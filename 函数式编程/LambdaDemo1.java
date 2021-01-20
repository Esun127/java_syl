public class LambdaDemo1 {
    public static void main(String[] args){
        new Thread(new Runnable() {
            @Override
            public void run(){
                System.out.println("Hello World!");
            }
        }).start();
        try {
            Thread.sleep(1);
        } catch(InterruptedException e){
            e.printStackTrace();
        }

    }
}



