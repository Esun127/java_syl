import java.io.FileWriter;
import java.io.Reader;
import java.io.Writer;
import java.sql.*;

public class ReadText{
    final static String DRIVER = "com.mysql.jdbc.Driver";
    final static String URL = "jdbc:mysql://localhost:3306/shiyanlou?useUnicode=true&characterEncoding=utf8";
    final static String USERNAME = "root";
    final static String PASSWORD = "";
    static Connection conn = null;
    static PreparedStatement pstmt = null;
    static ResultSet rs = null;


    public static void readTextToClob(){
        try {
            Class.forName(DRIVER);
            conn = DriverManager.getConnection(URL, USERNAME, PASSWORD);
            String sql = "select * from myTxt where id = ?";
            pstmt = conn.prepareStatement(sql);
            pstmt.setInt(1, 1);
            rs = pstmt.executeQuery();
            if (rs.next()){
                // 将小说从数据库中读出, 类型为Reader
                Reader reader = rs.getCharacterStream("clob");
                // 通过IO流将小说写入文件
                Writer writer = new FileWriter("src/new_introduce.txt");
                // 设置写入缓冲区
                char[] temp = new char[200];
                int len = -1;
                while((len=reader.read(temp)) != -1) {
                    writer.write(temp, 0, len);
                }
                writer.close();
                reader.close();
                System.out.println("小说读取成功!");

            }

        }catch(ClassNotFoundException e){
            e.printStackTrace();
        } catch(SQLException e){
            e.printStackTrace();
        } catch(Exception e){
            e.printStackTrace();
        } finally {
            try {
                if (rs != null){
                    rs.close();
                }
                if (pstmt != null){
                    pstmt.close();
                }
                if (conn != null){
                    conn.close();
                }
            } catch(SQLException e){
                e.printStackTrace();
            } catch (Exception e){
                e.printStackTrace();
            }
        }

    }

    public static void main(String[] args){
        readTextToClob();
    }

}