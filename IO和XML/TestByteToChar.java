import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TestByteToChar{
    public static void main(String[] args) throws IOException{
        BufferedReader in = null;
        try {
            //　将字节流System.in通过InputStreamReader 转换成字符流
            in = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("请输入你今天最想说的话: ");
            String s = in.readLine();
            System.out.println("你最想表达的是: " + s);


        } catch (IOException e) {
            System.out.println(e.getMessage());
        } finally {
            if (in != null) {
                in.close();
            }
        }
    }
}