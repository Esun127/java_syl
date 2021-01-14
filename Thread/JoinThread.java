public class JoinThread {
    public static void main(String[] args) throws InterruptedException {
        SThread st = new SThread();
        QThread qt = new QThread(st);
        qt.start();
        st.start();
    }
}



class QThread extends Thread {
    int i =0;
    Thread t = null;

    // 无参构造器, 调用父类构造器设置线程名字
    public QThread(Thread t) {
        super("QThread线程");
        this.t =t;

    }

    public void run(){
        try {
            while(i<100) {
                if (i != 5) {
                    Thread.sleep(500);
                    System.out.println("QThread正在每隔0.5秒输出数字: " +(i++));

                } else {
                    t.join();
                }
            }
        } catch(InterruptedException e) {
            e.printStackTrace();
        }
    }
}


class SThread extends Thread {
    int i = 0;

    public void run(){
        try {
            while(i<100) {
                Thread.sleep(1000);
                System.out.println("SThread正在每隔1秒输出数字: " + (i++));
            }
        } catch(InterruptedException e) {
            e.printStackTrace();
        }
    }
}