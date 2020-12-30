import java.util.Scanner;

class TestArray1 {

    public static void main(String[] args) {
        // 底薪大于等于6000的Java工程师人数

        int highNum = 0;
        int sumBasSalary = 0;
        //  创建一个长度为10的整型数组
        int[] basSalaries = new int[10];

        Scanner input = new Scanner(System.in);

        for (int i=0; i<10; i++) {
            System.out.print("请输入第" + (i+1) + "个工程师底薪: ");
            basSalaries[i] = input.nextInt();
            if (basSalaries[i] >= 6000) {
                highNum++;
                sumBasSalary += basSalaries[i];
            }

        }

        System.out.println("10个Java工程师中, 高新人员比例为: " + highNum / 10.0 * 100 + "%");
        System.out.println("高薪人员平均月薪为: " + sumBasSalary/highNum);
        System.out.print("请输入你需要获取第几个工程师的底薪: ");
        int idx = input.nextInt();
        System.out.println("第" + idx + "个工程师的底薪: " + basSalaries[idx-1]);



    }



}