import java.lang.reflect.*;


public class TestMethod2 {
    public static void main(String args[]) {
        try {
            Class c = Class.forName("Sub");
            // 返回Method对象数组, 存放该类或接口的所有方法(不含继承来的)
            // Method[] mList = c.getMethods();
            Method[] mList = c.getDeclaredMethods();
            System.out.println("Sub类getDeclaredMethods()得到的方法如下: ");
            //遍历所有方法
            for (int i=0; i<mList.length; i++){
                System.out.println("**********************");
                Method m = mList[i];
                System.out.println("方法" + (i+1) + "名称为: " + m.getName());
                System.out.println("该方法所在的类或接口为: "+ m.getDeclaringClass());
                Class[] ptl = m.getParameterTypes();
                for(int j=0; j<ptl.length; j++){
                    System.out.println("形参" +(j+1) + " 类型为: " + ptl[j]);
                }
                Class[] etl = m.getExceptionTypes();
                for(int k=0; k<etl.length; k++){
                        System.out.println("异常" + (k+1) + " 类型为: " + etl[k]);
                }
                System.out.println("返回值类型为: " + m.getReturnType());
                    
                
            }
        } catch(Exception e){
            e.printStackTrace();
        }
    }
}