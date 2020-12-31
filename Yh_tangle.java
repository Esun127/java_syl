import java.util.Scanner;
import java.util.Arrays;


public class Yh_tangle {
    public static void yh( int n) {
        int nSum = 0;
        int[] sums = new int[n];
        int[][] a = new int[n][];
        //初始化杨辉三角第一行数组
        a[0] = new int[]{1};
        //初始化杨辉三角第二行数组
        a[1] = new int[]{1,1};
        sums[0] = 1;
        sums[1] = 2;
        
        System.out.println(Arrays.toString(a[0])); 
        System.out.println(Arrays.toString(a[1])); 
        
        // 从第三行开始自动计算
        for (int i=2; i<n; i++) {
            // 第i个索引的数组(有i+1个元素)
            a[i] = new int[i+1];

            //第一个元素为1
            a[i][0] = 1;
            // 最后一个元素为1
            a[i][i] = 1; 
            sums[i] = 2;
            // 1 ~ i-1 自动计算
            for (int j=1; j<=i-1; j++) {
                a[i][j] = a[i-1][j] + a[i-1][j-1];
                sums[i] += a[i][j];
            }

            System.out.println(Arrays.toString(a[i]));               
        }
        
        // 计算前n列和
        for (int i=0; i<n; i++) {
            nSum += sums[i];
        }

        System.out.println("前" + n + "列和为: " + nSum);
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("请输入想求取杨辉三角数的总和的列数: ");
        int n = input.nextInt();
        yh(n);
    }
}