import java.net.*;
import java.io.*;

public class TestEx14 {

    public static void doEx1() throws IOException{
        try {
            ServerSocket ss = new ServerSocket(5678);
            Socket socket = ss.accept();
        } catch (IOException e) {
            System.out.println("doEx1方法中处理IOException异常!");
            throw e;
        }
    }
    public static void main(String[] args){
        try {
            doEx1();
        } catch (IOException e) {
            System.out.println("main方法中处理IOException异常!");
        } finally {
            System.out.println("程序结束!");
        }
    }
}