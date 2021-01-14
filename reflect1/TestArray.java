import java.util.Scanner;
import java.lang.reflect.*;



public class TestArray {

    public static void main(String[] args){
        try {
            // 实例化输入流扫描器
            Scanner input = new Scanner(System.in);
            // 反射类 映射到字符串类
            Class c = Class.forName("java.lang.String");

            System.out.print("请输入班级人数: ");
            // 扫描器扫描整数
            int stuNum = input.nextInt();

            // 利用Array数组反射类 创建长度为stuNum的字符串数组
            // 形参为反射类c(目标对象为String), stuNum: 学生个数
            Object obj = Array.newInstance(c, stuNum);
            System.out.println("请输入需要给学号为?的学生输入姓名: ");
            
            int stuNO = input.nextInt();
            System.out.print("请输入该学生姓名: ");
            String stuName = input.next();
            // 反射数组类设置 数组中的指定索引处的元素
            Array.set(obj, (stuNO - 1), stuName);
            System.out.println("学号为" + stuNO + "的姓名为: "+ Array.get(obj, (stuNO-1)));


        } catch(Exception e) {
            e.printStackTrace();
        }
    }
}