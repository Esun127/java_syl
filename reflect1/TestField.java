import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.Scanner;



public class TestField {

    public static void main(String[] args){
        try {
            // 通过类名称映射类反射对象
            Class c = Class.forName("Sub");
            Scanner input = new Scanner(System.in);
            System.out.print("请输入你想获取Sub类的哪个属性的类型: ");
            String name = input.next();
            // 通过字段名称映射字段反射对象
            Field sf = c.getDeclaredField(name);
            System.out.println("Sub类" + name + "属性的类型为: " + sf.getType());
            System.out.println("***************");
            // 获取字段反射对象列表
            Field[] fieldList = c.getDeclaredFields();
            System.out.println("Sub类getDeclaredFields()得到属性如下: ");
            // 遍历所有字段
            for(int i=0; i<fieldList.length; i++){
                System.out.println("********************");
                Field f = fieldList[i];
                System.out.println("属性" + (i+1) + "名称为: " + f.getName());
                System.out.println("该属性所在的类或接口为: "+f.getDeclaringClass());
                System.out.println("该属性所在的类型为: "+f.getType());
                // 使用反射对象的Modifier对象表示访问权限修饰符的整数编码
                int m = f.getModifiers();
                // 由整数编码获取字符串表示
                System.out.println("该属性的修饰符为: "+ Modifier.toString(m));



            }



        }catch(Exception e){
            e.printStackTrace();
        }
    }
}