import java.io.*;


public class TestCharStream {
    public static void main(String[] args) throws IOException {
        FileReader in = null;
        FileWriter out = null;
        try {
            // 其中args[0]代表程序执行时输入的第一个参数
            in = new FileReader(args[0]);
            out = new FileWriter(args[1], true);
            int c;
            while((c=in.read()) != -1) {
                // out.write(c);
                out.append((char)c);
            }
        } catch (IOException e) {
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