public class TestThread {
    public static void main(String[] args) throws InterruptedException {
        // 继承Thread类对象
        Thread t1 = new MyThread1();
        // 适配Runnable接口对象
        MyThread2 mt2 = new MyThread2();
        Thread t2 = new Thread(mt2);
        t1.start();
        t2.start();
        System.out.println("我是主线程");

    }
}



// 继承自`Thread`类创建线程类
class MyThread1 extends Thread {
    private int i = 0;

    //　无参构造器，　调用父类构造器设置线程名字
    public MyThread1(){
        super("我的线程1");
    }

    //通过循环判断，　输出１０次，　每次间隔０.５秒
    public void run(){
        try {
            while (i<10) {
                System.out.println(this.getName()+"运行第" + (i+1) + "次");
                i++;
                sleep(500);
            }
        } catch(Exception e) {
            e.printStackTrace();
        }
    }
}



// 实现Runnable接口创建线程类
class MyThread2 implements Runnable {
    String name = "我的线程2";

    public void run(){
        System.out.println(this.name);
    }
}