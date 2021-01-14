import java.lang.reflect.*;


public class TestNewInstance1 {
    public static void main(String[] args){

        try {

            Class c = Class.forName("Super2");
            // 通过形参反射类数组获取有参构造器
            Constructor con = c.getDeclaredConstructor(new Class[]{int.class, int.class});
            // 通过构造器的newInstance(Object[] args)方法创建对象
            // 形参数组对基本数据类型支持自动装箱,拆箱, 所以也可以写成 newInstance(21, 22)
            Super2 sup = (Super2) con.newInstance(new Object[]{21, 22});
            System.out.println(sup.supPackage());

            Constructor con2 = c.getDeclaredConstructor();
            Super2 sup2 = (Super2) con2.newInstance();
            System.out.println(sup2.supProtected());

        } catch (Exception e){
            e.printStackTrace();
        }
    }
}