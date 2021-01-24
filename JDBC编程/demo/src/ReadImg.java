import java.io.*;
import java.sql.*;


public class ReadImg{
    final static String DRIVER = "com.mysql.jdbc.Driver";
    final static String URL = "jdbc:mysql://localhost:3306/shiyanlou?useUnicode=true&characterEncoding=utf8";
    final static String USERNAME = "root";
    final static String PASSWORD = "";
    static Connection conn = null;
    static PreparedStatement pstmt = null;
    static ResultSet rs = null;

    public static void readImgToBlob(){

        try {
            Class.forName(DRIVER);
            conn = DriverManager.getConnection(URL, USERNAME, PASSWORD);
            String sql = "select * from myPicture where id = ?";
            pstmt = conn.prepareStatement(sql);
            pstmt.setInt(1, 1);
            rs = pstmt.executeQuery();
            if(rs.next()){
                InputStream imgInS = rs.getBinaryStream("img");
                InputStream ins = new BufferedInputStream(imgInS);
                OutputStream imgOutS = new FileOutputStream("src/new_mypic.png");
                OutputStream outs = new BufferedOutputStream(imgOutS);
                int len = -1;
                while((len = ins.read())!=-1){
                    outs.write(len);
                }
                outs.close();
                imgOutS.close();
                ins.close();
                imgInS.close();
                System.out.println("图片读取成功!");

            }
        }catch(ClassNotFoundException e){
            e.printStackTrace();
        }catch(SQLException e){
            e.printStackTrace();
        }catch(Exception e){
            e.printStackTrace();
        }finally {
            try{
                if (rs != null){
                    rs.close();
                }
                if (pstmt != null){
                    pstmt.close();
                }
                if( conn != null){
                    conn.close();
                }
            }catch(SQLException e){
                e.printStackTrace();
            }catch(Exception e){
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args){
        readImgToBlob();
    }

}