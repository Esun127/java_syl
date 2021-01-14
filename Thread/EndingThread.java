import java.util.Scanner;

public class EndingThread {
    public static void main(String[] args){
        CountThread t = new CountThread();
        t.start();

        Scanner scanner = new Scanner(System.in);
        System.out.println("如果想终止输出计数线程, 请输入s");
        while(true){
            String s = scanner.nextLine();
            if(s.equals("s")) {
                t.stopIt();
                break;
            }
        }
    }
}



class CountThread extends Thread {
    private int i = 0;

    public CountThread() {
        super("计数线程");
    }

    //通过设置 i=100 让线程终止
    public void stopIt(){
        i = 100;
    }
    
    public void run(){
        try {
            while (i<100) {
                System.out.println(this.getName() + "计数: " + (i+1));
                i++;
                sleep(2000);
            }
        } catch(Exception e) {
            e.printStackTrace();
        }
    }
}