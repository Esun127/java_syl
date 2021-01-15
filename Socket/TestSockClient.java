import java.io.*;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;


public class TestSockClient {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        InputStream is = null;
        OutputStream os = null;
        DataInputStream dis = null;
        DataOutputStream dos = null;
        String receive = null;

        try {
            Socket socket = new Socket("localhost", 8888);
            while(true){
                is = socket.getInputStream();
                os = socket.getOutputStream();
                dis = new DataInputStream(is);
                dos = new DataOutputStream(os);
                // 向服务端发送请求内容
                System.out.println("请输入要向客户端发送的信息(输入\"e\"结束会话): ");
                String msg = input.nextLine();

                if(msg.equals("e")) {
                    System.out.println("已退出聊天! ");
                    break;
                }
                dos.writeUTF(msg);
                if((receive = dis.readUTF()) !=null){
                    System.out.println("\n服务端发来的内容: " + receive);
                }
            }
            dos.close();
            dis.close();
            socket.close();
        } catch(UnknownHostException e){
            e.printStackTrace();
        } catch(IOException e){
            e.printStackTrace();
        } catch(Exception e){
            e.printStackTrace();
        }

    }
}