import java.util.Scanner;

public class TestEx6 {
    public static void main(String[] args){
        int appleNum = 0;
        int stuNum = 0;
        System.out.println("**现在给孩子们分苹果**");
        Scanner input = new Scanner(System.in);
        System.out.print("请输入桌子上有几个苹果: ");
        appleNum = input.nextInt();
        try {
            System.out.print("请输入班上有几个孩子: ");
            stuNum = input.nextInt();
            System.out.println("班上每个孩子分得多少苹果: " + appleNum / stuNum);
            System.out.println("孩子们非常开心! ");

        } catch(Exception e) {
            System.out.println("除数为0异常, 请修改程序.");
        }
        

   

    }
}