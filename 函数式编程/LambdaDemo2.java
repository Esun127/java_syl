public class LambdaDemo2 {
    public static void main(String[] args){
        new Thread( //匿名方法
            ()->{ System.out.println("Hello World"); }
        ).start();
    }
}