import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.sql.*;



public class WriteImg{
    final static String DRIVER = "com.mysql.jdbc.Driver";
    final static String URL = "jdbc:mysql://localhost:3306/shiyanlou?useUnicode=true&characterEncodingg=utf8";
    final static String USERNAME = "root";
    final static String PASSWORD = "";

    static Connection conn = null;
    static PreparedStatement pstmt = null;
    
    public static void writeImgToBlob(){
        try {
            Class.forName(DRIVER);
            conn = DriverManager.getConnection(URL, USERNAME, PASSWORD);
            String sql = "insert into myPicture values(?, ?)";
            pstmt = conn.prepareStatement(sql);
            pstmt.setInt(1, 1);

            File f = new File("/home/project/myPic.png");
            InputStream ins = new FileInputStream(f);
            pstmt.setBinaryStream(2, ins, (int)f.length());
            int result = pstmt.executeUpdate();
            if(result > 0){
                System.out.println("图片写入成功!");
            } else {
                System.out.println("图片写入失败!");
            }
            // ins.close();
            // f.close();

        } catch(ClassNotFoundException e){
            e.printStackTrace();
        
        } catch(SQLException e){
            e.printStackTrace();
        
        } catch(Exception e){
            e.printStackTrace();
        } finally {

            try {
                if (pstmt != null) {
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
        writeImgToBlob();
    }
}