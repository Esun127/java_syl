import java.lang.reflect.*;


public class TestArray2 {
    public static void main(String[] args){

        try {

            Class c = Integer.TYPE;
            // 创建一个 8行, 10列 的二位整形数组
            int[] dim = {8, 10};

            Object array = Array.newInstance(c, dim);

            // 获取第4行上的数组
            Object array4 = Array.get(array, 4);
            
            // 对第4行数组的索引为6的元素赋值20
            Array.set(array4, 6, 20);
            System.out.println("array[4][6]的值为: " + Array.get(array4, 6));
           


        } catch(Exception e){
            e.printStackTrace();
        }
    }
}