import java.net.*;  //导入Java网络包
import java.io.*;   //导入IO包


public class TestEx8 {

    // 声明服务端套接字对象
    public static ServerSocket ss = null;
    //　暂不理会throws IOException代码的含义, 之后的课程会有介绍
    public static void main(String[] args) throws IOException{
        try{
            // 实例化服务器端套接字, 服务端套接字等待请求通过网络传入
            ss = new ServerSocket(5678);
            // 侦听并接受此套接字的连接
            Socket socket = ss.accept();

        } catch(IOException e) {
            // 关闭套接字
            ss.close();
        }
    }
}