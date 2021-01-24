import java.sql.*;



public class JDBCOperateByCallableStatement {
    final static String DRIVER = "com.mysql.jdbc.Driver";

    final static String URL = "jdbc:mysql://localhost:3306/shiyanlou?useUnicode=true&characterEncoding=utf8";

    final static String USERNAME = "root";
    final static String PASSWORD = "";

    static Connection conn = null;
    // static Statement stmt = null;
    // static ResultSet rs = null;
    static CallableStatement cstmt = null;


    public static void main(String[] args){
        try {
            Class.forName(DRIVER);
            conn = DriverManager.getConnection(URL, USERNAME, PASSWORD);
            cstmt = conn.prepareCall("{call addTwoNum(?,?,?)}");
            cstmt.setInt(1, 10);
            cstmt.setInt(2, 20);
            // 将第三个占位符(输出参数)类型设置为int, 并注册为输出参数
            cstmt.registerOutParameter(3, Types.INTEGER);
            cstmt.execute();
            // 获取第三个占位符的 输出
            int result = cstmt.getInt(3);
            System.out.println("相加的结果是: " + result);
        } catch(ClassNotFoundException e){
            e.printStackTrace();
        }catch(SQLException e){
            e.printStackTrace();
        }catch(Exception e){
            e.printStackTrace();
        } finally {
            try {
                if (cstmt != null){
                    cstmt.close();
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
    }

}