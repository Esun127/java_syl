import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;



class ServerThread extends Thread {

    Socket socket = null;
    Scanner input = new Scanner(System.in);

    public ServerThread(Socket socket){
        this.socket = socket;
    }

    @Override
    public void run(){
        InputStream in = null;
        OutputStream out = null;
        try {
            in = socket.getInputStream();
            out = socket.getOutputStream();
            DataOutputStream dos=new DataOutputStream(out);
            DataInputStream dis = new DataInputStream(in);
            String str = null;
            while (true) {
                if((str = dis.readUTF()) != null){
                    if (str.equals("e")){
                        break;
                    }
                    System.out.println("客户端发来的内容: " + str);
                }
                // 服务端向客户端发送响应内容
                System.out.println("请输入要向客户端发送的消息: ");
                String msg = input.nextLine();
                dos.writeUTF(msg);
                System.out.println();

            }
            dis.close();
            dos.close();
            socket.close();


        } catch(EOFException e){
            System.out.println("客户端" + socket.getInetAddress().getHostAddress() + ":" + socket.getPort() + "退出! ");
        } catch(IOException e){
            e.printStackTrace();
        } catch(Exception e){
            e.printStackTrace();
        }
    }
}



public class TestSockServer {
    public static void main(String[] args){
        try {
            ServerSocket serverSocket = new ServerSocket(8888);
            while(true){
                Socket socket = serverSocket.accept();
                ServerThread serverThread = new ServerThread(socket);
                serverThread.start();
            }
        } catch(IOException e){
            e.printStackTrace();
        }
    }
}