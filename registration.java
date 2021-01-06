import java.util.InputMismatchException;
import java.util.Scanner;


public class registration {

    static Scanner s = new Scanner(System.in);

    public static void main(String[] args) throws Exception {

        String Name;
        int Age;
        String Gender;

        System.out.println("请输入您的姓名(不小于 1 个字符且不超过 20 个字符)：");
        while(true) {
            try {
                Name = inputName();
            } catch (NameException e) {
                e.printMessage();
                continue;
            }
            break;
        }

        System.out.println("请输入您的年龄(18~35)：");
        while (true) {
            try { 
                Age = inputAge();
            } catch(AgeException e) {
                e.printMessage();
                continue;
            } catch (InputMismatchException e) {
                System.out.println("年龄应输入数字, 请重新输入:");
                continue;
            }
            break;
        }


        System.out.println("请选择您的性别：1. 男    2. 女");
        while(true) {
            try {
                Gender = setGender();
            } catch (GenderException e) {
                e.printMessage();
                continue;
            }
            break;
        }

        System.out.println("您的报名信息为： 姓名：" + Name + "；年龄：" + Age + "；性别：" + Gender);
    }

    /**
     * 输入姓名的方法
     */
    public static String inputName() throws NameException {
        // 补充代码
        // System.out.print("请输入您的姓名(不小于1个字符且不超过20个字符): ");
        String name = s.next();
        if (1 > name.length() || name.length() > 20) {
            throw new NameException();
        }
        return name;
    }

    /**
     * 输入年龄的方法
     */
    public static int inputAge() throws AgeException{
        // 补充代码
    
        // System.out.print("请输入您的年龄(18~35): ");
        int age = s.nextInt();
        if (age > 35 || age < 18) {
            throw new AgeException(age);
        }
        return age;
    }

    /**
     * 选择性别的方法
     */
    public static String setGender() throws GenderException {
        // 补充代码
            // System.out.print("请选择您的性别: 1.男    2.女");
            int gender = s.nextInt();
  
            if (gender == 1) {
                return "男";
            } else if (gender == 2) {
                return "女";
            } else {
                throw new GenderException();
            }
        
    }

}




class NameException extends Exception {

    public  void printMessage() {
        System.out.println("您输入的姓名长度不符合要求, 请重新输入:");
    }

}

class AgeException extends Exception {
    private int age;
    public void printMessage(){
        System.out.println("年龄设置为" + age + "不符合要求, 请重新输入:");
    }
    public AgeException(int a) {
        this.age = a;
    }

}

class GenderException extends Exception {
    public void printMessage(){
        System.out.println("请选择1或2选择您的性别, 请重新输入:");
    }
}