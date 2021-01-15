import java.util.Scanner;
import java.net.*;



public class TestGetIP2 {

    public static void main(String[] args){
        InetAddress sohuIP = null;

        Scanner input = new Scanner(System.in);
        System.out.println("请输入要查询IP地址的域名: ");
        String dName = input.next();
        try {
            // 通过InetAddress类静态方法返回指定域名的IP地址对象
            sohuIP = InetAddress.getByName(dName);
        } catch(Exception e){
            e.printStackTrace();
        }
        System.out.println("域名: " + dName + " 对应IP地址为: "+sohuIP.getHostAddress());
    }
}