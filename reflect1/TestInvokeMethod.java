import java.lang.reflect.*;

public class TestInvokeMethod {
    public int add(int x, int y){
        return x+y;
    }

    public int add(int x){
        return x+1;
    }

    public int multiply(int x, int y){
        return x * y;
    }

    public int multiply(int x){
        return x * x;
    }

    public static void main(String[] args){
        try {
            // 直接获取TestInvokeMethod的反射类对象
            Class c = TestInvokeMethod.class;
            //通过反射类对象实例化目标对象
            Object obj = c.newInstance();

            // 通过反射类对象的getDeclaredMethod方法获取反射方法对象
            Method m = c.getDeclaredMethod("multiply", new Class[]{int.class, int.class});
            System.out.println("调用方法: multiply, 输入值为int型3和4, 结果为: " + m.invoke(obj, new Object[]{3, 4}));

            Method m2 = c.getDeclaredMethod("add", new Class[]{int.class});
            System.out.println("调用方法: add, 输入值为int型18, 结果为: " + m2.invoke(obj, new Object[]{18}));


        } catch(Exception e){
            e.printStackTrace();
        }
    }
}