public class LambdaDemo1 {
    public static void main(String[] args){
        new Thread(new Runnable(){ //匿名内部类
            @Override
            public void run(){
                System.out.println("Hello World");
            }
        }).start();
    }
}