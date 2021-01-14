public class InterruptThread {

    public static void main(String[] args){
        CountThread2 t = new CountThread2();
        t.start();
        try {
            Thread.sleep(6000);

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        // 中断子线程的阻塞状态即唤醒子线程
        t.interrupt();
    }
}

class CountThread2 extends Thread {

    private int i = 0;

    public CountThread2(){
        super("计数线程");
    }

    public void run(){
        while(i < 100) {
            try {
                System.out.println(this.getName() + "计数: " +(i+1));
                i++;
                Thread.sleep(5000);
            } catch(InterruptedException e) {
                System.out.println("程序捕获了`InterruptedException`异常!");
            }
            System.out.println("计数线程运行1次!");
        }
    }
}