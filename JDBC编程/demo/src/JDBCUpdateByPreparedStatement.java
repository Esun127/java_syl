import java.sql.*;


public class JDBCUpdateByPreparedStatement {

    final static String DRIVER = "com.mysql.jdbc.Driver";
    final static String URL = "jdbc:mysql://localhost:3306/shiyanlou?useUnicode=true&characterEncoding=utf8";
    final static String USERNAME = "root";
    final static String PASSWORD = "";
    
    static Connection conn = null;
    // static Statement stmt = null;
    // static ResultSet rs = null;
    static PreparedStatement pstmt = null;


    public static boolean executeUpdate(){

        boolean flag = false;
        try {
            Class.forName(DRIVER);
            conn = DriverManager.getConnection(URL, USERNAME, PASSWORD);
            // 带占位符的SQL
            String SQL = "delete from student where stuName = ? and stuAge = ?";
            pstmt = conn.prepareStatement(SQL);
            // 设置占位符的真实值
            pstmt.setString(1, "stu9443");
            pstmt.setInt(2, 100);
            int count = pstmt.executeUpdate();
            System.out.println("受影响的行数是: " + count);
            flag = true;


        } catch(ClassNotFoundException e){
            e.printStackTrace();
        }catch(SQLException e){
            e.printStackTrace();
        }catch(Exception e){
            e.printStackTrace();
        } finally {
            try {
                if(pstmt != null){
                    pstmt.close();
                }
                if(conn != null){
                    conn.close();
                }
            } catch(SQLException e){
                e.printStackTrace();
            } catch(Exception e){
                e.printStackTrace();
            }
        }

        return flag;
    }

    public static void main(String[] args){
        executeUpdate();
    }

}