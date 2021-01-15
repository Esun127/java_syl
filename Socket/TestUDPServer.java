import java.net.*;
import java.io.*;


public class TestUDPServer {

    public static void main(String[] args) throws Exception{
        // 创建数据报报文套接字, 端口号8888
        DatagramSocket ds = new DatagramSocket(8888);
        byte[] buf = new byte[1024];

        //创建接收的数据报报文包
        DatagramPacket dpReceive = new DatagramPacket(buf, 1024);
        System.out.println("服务端: ");
        while (true){
            //从此套接字接收数据包报文
            ds.receive(dpReceive);
            ByteArrayInputStream byteListIn = new ByteArrayInputStream(buf);
            DataInputStream dis = new DataInputStream(byteListIn);
            System.out.println(dis.readLong());
        }

    }
}