import java.util.InputMismatchException;
import java.util.Scanner;

public class TestEx16 {
    // 抛出InputMismatchException 异常, 自己不处理, 让方法的直接调用者去处理
    private static void p() throws InputMismatchException {
        int appleNum = 0;
        int stuNum = 0;
        System.out.println("**现在给孩子们分苹果: ");
        Scanner input = new Scanner(System.in);
        System.out.print("请输入桌子上有几个苹果: ");
        appleNum = input.nextInt();
        System.out.print("请输入班上有几个孩子: ");
        stuNum = input.nextInt();
        System.out.println("班上每个孩子分得多少苹果: " + appleNum / stuNum);
        System.out.println("孩子们非常开心!");
    }

    public static void main(String[] args){
        try {
            p();
        } catch(InputMismatchException e) {
            System.out.println("main方法处理InputMismatchException异常");
        }
    }
}