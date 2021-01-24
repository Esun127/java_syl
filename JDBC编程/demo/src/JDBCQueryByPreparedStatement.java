import java.sql.*;
import java.util.Scanner;


public class JDBCQueryByPreparedStatement {

    final static String DRIVER = "com.mysql.jdbc.Driver";
    final static String URL = "jdbc:mysql://localhost:3306/shiyanlou?useUnicode=true&characterEncoding=utf8";

    final static String USERNAME = "root";
    final static String PASSWORD = "";

    static Connection conn = null;
    static PreparedStatement pstmt = null;
    static ResultSet rs = null;

    public static boolean executeQuery(){

        Scanner input = new Scanner(System.in);
        boolean flag = false;
        try {
            Class.forName(DRIVER);
            conn = DriverManager.getConnection(URL, USERNAME, PASSWORD);
            System.out.println("请输入用户名: ");
            String name = input.nextLine();
            System.out.println("请输入密码: ");
            String pwd = input.nextLine();
            String sql = "select count(1) from login where username = ? and password = ?";
            pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, name);
            pstmt.setString(2, pwd);

            rs = pstmt.executeQuery();
            if (rs.next()){
                int count = rs.getInt(1);
                if (count > 0){
                    System.out.println("登陆成功");
                    flag = true;
                } else{
                    System.out.println("登录失败");
                }
            }
            
        } catch(ClassNotFoundException e){
            e.printStackTrace();
        }catch(SQLException e){
            e.printStackTrace();
        }catch(Exception e){
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
            } catch(Exception e){
                e.printStackTrace();
            }
        }
        return flag;
    } 

    public static void main(String[] args){
        executeQuery();
    }

}