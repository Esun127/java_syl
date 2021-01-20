interface MyInterface {
    default String myFunction(){
        return "hello world";
    }
}



public class DefaultInterfaceDemo1 implements MyInterface {
    public static void main(String[] args){
        // 实现类可以继承并使用接口的默认方法
        String s = new DefaultInterfaceDemo1().myFunction();
        System.out.println(s);
    }
}