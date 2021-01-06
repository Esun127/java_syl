import java.util.Scanner;

public class TestEx7 {
    public static void main(String[] args){
        try {

            String[] teachers = {"柳海龙", "孙传杰", "孙悦"};
            for (int i =0; i< teachers.length; i++) {
                System.out.println(teachers[i]);
            }

            int appleNum = 0;
            int stuNum = 0;
            System.out.println("**现在给孩子们分苹果**");
            Scanner input = new Scanner(System.in);
            System.out.print("请输入桌子上有几个苹果: ");
            appleNum = input.nextInt();
        
            System.out.print("请输入班上有几个孩子: ");
            stuNum = input.nextInt();
            System.out.println("班上每个孩子分得多少苹果: " + appleNum / stuNum);
            System.out.println("孩子们非常开心! ");

        } catch(ArithmeticException e) {
            System.out.println("除数为0异常, 请修改程序.");
        } catch(ArrayIndexOutOfBoundsException e) {
            System.out.println("数组小标越界异常, 请修改程序.");
        }
        System.out.println("程序执行完毕!");
        

   

    }
}