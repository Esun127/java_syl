//自定义函数式接口
interface MyLambda {
    void method();
}



public class LambdaDemo3 {

    public LambdaDemo3(MyLambda lambda){
        // 其他代码
        lambda.method();
        System.out.println("构造成功!");
    }

    public static void main(String[] args){
        new LambdaDemo3(
            () -> { System.out.println("Hello Lambda"); }
        );
    }
}