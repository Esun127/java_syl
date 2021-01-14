import java.lang.reflect.*;


public class TestConstructor {

    public static void main(String[] args){
        try {
            Class c = Class.forName("Sub");
            //返回构造器反射对象数组, 存放该类或接口的所有构造器反射对象(不含父类/父接口的构造器)
            // Constructor[] constructorList = c.getDeclaredConstructors();
            Constructor[] constructorList = c.getConstructors();
            // System.out.println("Sub类getDeclaredConstructors()得到的构造方法如下: ");
            System.out.println("Sub类getConstructors()得到的构造方法如下: ");
            int i =0;
            for (Constructor con: constructorList){
                System.out.println("*********************");
                System.out.println("构造方法" + (i+1) + "名称为: " + con.getName());
                System.out.println("该构造方法所在的类/接口为: " + con.getDeclaringClass());
                Class[] ptl = con.getParameterTypes();
                int j = 0;
                for (Class pC: ptl) {
                    System.out.println("形参" +(++j)+" 类型为: "+pC);
     
                }
                int k = 0;
                Class[] etl = con.getExceptionTypes();
                for(Class eC: etl){
                    System.out.println("异常" +(++k)+" 类型为: " + eC);
                }
                i++;

            }
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}