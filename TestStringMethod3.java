import java.util.Scanner;


public class TestStringMethod3 {

    public static void main(String[] args) {

        String result = String.valueOf(100) ; //String.valueOf 是String类的静态方法
        Scanner input = new Scanner(System.in);

        System.out.print("请输入您去年一年的薪水总和: ");
        int lastSalary = input.nextInt();

        String strSalary = String.valueOf(lastSalary);

        System.out.println("您去年一年的薪水总和是: " + strSalary.length() + "位数");

        String date = ",Mary,F,1976";
        String[] splitStr = date.split(",");
        
        System.out.println("Mary,F,1976使用,分割后的结果是: ");
        for (int i=0; i<splitStr.length; i++) {
            System.out.println(splitStr[i]);
        }

        for (String str : splitStr) {
            System.out.println(str);
        }
    }
}