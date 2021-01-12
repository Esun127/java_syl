import java.io.*;

public class TestBufferStream {

    public static void main(String[] args) throws IOException {
        BufferedReader in = null;
        BufferedWriter out = null;
        try{
            in  =new BufferedReader(new FileReader("/home/project/ori_file.txt"));
            out = new BufferedWriter(new FileWriter("/home/project/new_file.txt"));

            String s;
            while((s = in.readLine()) != null) {
                out.write(s);
                // 写入一个换行符, 否则内容会写入在一行
                out.newLine();
            }
        } catch (IOException e){
            System.out.println(e.getMessage());
        } finally {
            if (in != null) {
                in.close();
            }
            if (out != null){
                out.close();
            }
        }
    }
}