import java.util.Scanner;
import java.net.*;
import java.io.*;


public class TestURL {

    public static void main(String[] args){
        URL tURL = null;

        BufferedReader in = null;
        Scanner input = new Scanner(System.in);
        System.out.print("请输入要定位的URL地址: ");
        String url = input.next();
        System.out.print("请输入要显示哪个页面标签元素的内容: ");
        String iStr = input.next();
        try {
            tURL = new URL(url);
            // 缓冲输入字符流
            in = new BufferedReader(new InputStreamReader(tURL.openStream()));
            String s;
            // 从流中按行读取
            while((s =in.readLine()) != null) {
                // 如果行中包含指定字符串
                if (s.contains(iStr)) {
                    System.out.println(s);
                }
            } 
        }
        catch(Exception e) {
                e.printStackTrace();
        }
        
    }
}