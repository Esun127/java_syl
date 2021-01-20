



interface MyInterface {
    default String myFunction(){
        return "Hello World";
    }
}


public class DefaultInterfaceDemo1 implements MyInterface {
    public static void main(String[] args){
        // 实现类可以继承并使用 `接口中的默认方法`
        System.out.println(new DefaultInterfaceDemo1().myFunction());
    }
}