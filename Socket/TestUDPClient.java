import java.net.*;
import java.io.*;


public class TestUDPClient {

    public static void main(String[] args) throws Exception{
        long n = 10000L;
        ByteArrayOutputStream byteListOuts = new ByteArrayOutputStream();
        DataOutputStream dos = new DataOutputStream(byteListOuts);
        dos.writeLong(n);
        byte[] buf = byteListOuts.toByteArray();
        System.out.println("客户端: ");
        System.out.println(buf.length);


        // 创建数据报文包的套接字, 端口号9999
        DatagramSocket ds = new DatagramSocket(9999);
        // 创建发送的数据报文包
        DatagramPacket dataPacket = new DatagramPacket(buf, buf.length, new InetSocketAddress("127.0.0.1",8888));
        // 从此套接字发送数据报文包
        ds.send(dataPacket);
        ds.close();


    }
}