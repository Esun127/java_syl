



interface MyInterface {
    default String myFunction(){
        return "Hello World";
    }
}


public class DefaultInterfaceDemo2 implements MyInterface {

    // 重写(实现)`接口的默认方法`
    @Override
    public String myFunction(){
        return "Override method";
    }
    public static void main(String[] args){
        // 实现类可以继承并使用 `接口中的默认方法`
        System.out.println(new DefaultInterfaceDemo2().myFunction());
    }
}