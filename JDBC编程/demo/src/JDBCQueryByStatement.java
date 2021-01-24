import java.sql.*;


public class JDBCQueryByStatement {
    final static String DRIVER = "com.mysql.jdbc.Driver";
    final static String URL = "jdbc:mysql://localhost:3306/shiyanlou?useUnicode=true&characterEncoding=utf8";
    final static String USERNAME = "root";
    final static String PASSWORD = "";
    static Connection connection = null;
    static Statement stmt = null;
    static ResultSet rs = null;

    public static void executeQuery(){
        try {
            //1, 加载数据库驱动
            Class.forName(DRIVER);
            // 2, 获取数据库连接对象
            connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
            // 3, 通过连接对象, 获取操作数据库的Statement对象
            stmt = connection.createStatement();
            // 4, 通过executeQuery() 实现对数据库的查询, 并返回一个结果集(包含了所有查询到的数据)
            // String querySQL = "select * from student";
            String querySQL = "select * from student where stuName like 'stu%'";
            rs = stmt.executeQuery(querySQL);
            // 5, 通过迭代ResultSet读取结果
            while(rs.next()){
                int stuNo = rs.getInt("stuNo");             // rs.getInt(1);
                String stuName = rs.getString("stuName");   // rs.getString(2)
                int stuAge = rs.getInt("stuAge");           // rs.getInt(3)
                System.out.println(stuNo + "\t" + stuName + "\t" + stuAge);

            }
        } catch(ClassNotFoundException e){
            e.printStackTrace();
        } catch(SQLException e){
            e.printStackTrace();
        } catch(Exception e){
            e.printStackTrace();
        } finally {
            try {
                if (rs != null) {
                    rs.close();
                }
                if (stmt != null) {
                    stmt.close();
                }
                if (connection != null){
                    connection.close();
                }
            } catch(SQLException e){
                e.printStackTrace();
            } catch(Exception e){
                e.printStackTrace();
            }
        }

    }
    public static void main(String[] args){
        executeQuery();
    }
}