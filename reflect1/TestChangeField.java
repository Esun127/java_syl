import java.lang.reflect.*;


public class TestChangeField {

    public static void main(String[] args){

        try {
            Class c= Class.forName("Super2");
            Super2 sup = (Super2) c.newInstance();

            // 通过映射字段名获取字段反射对象
            Field f = c.getDeclaredField("supPri");
            // 通过字段反射对象 取消字段的访问权限控制
            f.setAccessible(true);
            // 通过字段反射对象的get(Object)方法获取Object对象的该字段的值
            System.out.println("取消访问权限控制后再访问supPri, 其值为: " + f.get(sup));

            // 通过字段反射对象的get(Object)方法设置Object对象的该字段的值
            f.set(sup, 20);
            System.out.println("f.set(sup, 20)后访问supPri, 其值为: "+ f.get(sup));

            
        } catch(Exception e){
            e.printStackTrace();
        }
    }
}