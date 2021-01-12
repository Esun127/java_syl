import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;


public class TestByteStream {
    public static void main(String[] args) throws IOException {
        FileInputStream in = null;
        FileOutputStream out = null;
        try {
            File f = new File("/home/project/new_file.txt");
            // f.createNewFile();
            // 通过构造器: String类构造输入流
            in = new FileInputStream("/home/project/ori_file.txt");
            // 通过构造器: File类构造输出流
            out = new FileOutputStream(f, true);
            int c;
            // 通过逐个读取每个字节, 存入每个字节实现文件复制
            while((c = in.read()) != -1) {
                out.write(c);
                
            }

        }catch(IOException e) {
            System.out.println(e.getMessage());
        } finally {
            if (in != null) {
                in.close();
            }
            if (out != null) {
                out.close();
            }
        }
    }
}