import java.net.*;
import java.io.*;



public class TestServer {

    public static void main(String[] args){
        try {
            
            // 创建一个ServerSocket对象, 并指定端口号为8888
            ServerSocket s = new ServerSocket(8888);
            while(true){
                // 侦听并收受客户端连接请求
                Socket s1 = s.accept();
                OutputStream os = s1.getOutputStream();
                DataOutputStream dos = new DataOutputStream(os);
                dos.writeUTF("客户端IP: " + s1.getInetAddress().getHostAddress() + "客户端端口号: " + s1.getPort());
                dos.close();
                s1.close();
            }
            
        } catch(IOException e){
            e.printStackTrace();
            System.out.println("程序运行出错! ");
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}