



interface MyInterface1 {
    default String myFunction(){
        return "Hello interface1";
    }
}

interface MyInterface2 {
    default String myFunction(){
        return "hello interface2";
    }
}


public class DefaultInterfaceDemo3 implements MyInterface1, MyInterface2 {

    // 重写(实现)`接口的默认方法`
    @Override
    public String myFunction(){
        // 通过`复写 + 指定接口名 + super.函数名()` 来指定调用的同名的默认方法
        return MyInterface2.super.myFunction();
    }
    public static void main(String[] args){
        // 实现类可以继承并使用 `接口中的默认方法`
        System.out.println(new DefaultInterfaceDemo3().myFunction());
    }
}