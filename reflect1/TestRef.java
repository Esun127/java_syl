import java.util.Scanner;
import java.lang.reflect.Method;




class TestRef {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("请输入一个Java类全名: ");
        String className = input.next();
        showMethods(className);
    }


    // 从字符串类型的类名 获取 可实例化的类
    public static void showMethods(String name) {
        try {
            Class c = Class.forName(name);
            Method m[] = c.getDeclaredMethods();
            System.out.println("该Java类的方法有: ");
            for(int i=0; i<m.length;i++) {
                System.out.println(m[i].toString());
            }
 
        } catch(Exception e){
            e.printStackTrace();
        }
    }
}