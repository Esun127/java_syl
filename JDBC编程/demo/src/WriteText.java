import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.sql.*;


public class WriteText{
    final static String DRIVER = "com.mysql.jdbc.Driver";
    final static String URL = "jdbc:mysql://localhost:3306/shiyanlou?useUnicode=true&characterEncoding=utf8";
    final static String USERNAME = "root";
    final static String PASSWORD = "";
    
    static Connection conn = null;
    static PreparedStatement pstmt = null;
    

    public static void writeTextToClob(){
        try {

            Class.forName(DRIVER);
            conn = DriverManager.getConnection(URL, USERNAME, PASSWORD);
            String sql = "insert into myTxt(id, clob) values(?,?)";
            pstmt = conn.prepareStatement(sql);
            pstmt.setInt(1, 1);

            // 将小说文本文件转换为字符输入流, 并且设置编码格式为GBK
            File file = new File("/home/project/introduce.txt");
            Reader reader = new InputStreamReader(new FileInputStream(file), "utf8");
            //将字符输入流写入myTxt表
            pstmt.setCharacterStream(2, reader, (int)file.length());
            int result = pstmt.executeUpdate();
            if (result > 0){
                System.out.println("小说写入成功!");
            } else {
                System.out.println("小说写入失败.");
            }
        } catch(ClassNotFoundException e){
            e.printStackTrace();
        
        } catch(SQLException e){
            e.printStackTrace();
        
        } catch(Exception e){
            e.printStackTrace();
        } finally {
            try {
                if (pstmt != null){
                    pstmt.close();
                }

                if (conn != null){
                    conn.close();
                }
            } catch(SQLException e){
                e.printStackTrace();
            } catch(Exception e){
                e.printStackTrace();
            }
        }

    }
    public static void main(String[] args){
        writeTextToClob();
    }

}