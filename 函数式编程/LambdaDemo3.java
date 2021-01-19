interface MyLambda {
    void method();
}


public class LambdaDemo3 {
    public LambdaDemo3(MyLambda lambda) {

    }

    public static void main(String[] args){
        new LambdaDemo3(
            ()->{
                System.out.println("Hello Lambda");
            }
        );
    }
}