import java.net.*;
import java.io.*;
import java.util.Scanner;



public class TestURLConnection {
    public static void main(String[] args){

        try {
            URL url = new URL("https://53eb2792d116-service.simplelab.cn/examples/index.html");
            URLConnection urlConn = url.openConnection();
            HttpURLConnection httpURLConn = (HttpURLConnection) urlConn;
            httpURLConn.setDoOutput(true);
            httpURLConn.setDoInput(true);
            httpURLConn.setUseCaches(false);

            httpURLConn.setRequestProperty("Content-Type", "text/align;charset=utf-8");
            httpURLConn.setRequestMethod("POST");
            httpURLConn.connect();
            OutputStream outStream = httpURLConn.getOutputStream();
            InputStream inStream = httpURLConn.getInputStream();

            byte[] cSet = new byte[1024];
            int n = inStream.read(cSet);
            System.out.println(cSet);
            while(n > 0) {
                n = inStream.read(cSet);
                 System.out.println(cSet);
            }
            
     
 
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}