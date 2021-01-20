public class LambdaDemo2 {
    public static void main(String[] args){
        new Thread(
            // 函数式接口
            ()->{ System.out.println("Hello World"); }
        ).start();
        try {
            Thread.sleep(1);
        } catch(InterruptedException e){
            e.printStackTrace();
        }

    }
}



