import java.sql.*;



public class JDBCUpdateByStatement{
    final static String DRIVER = "com.mysql.jdbc.Driver";
    // 数据库的实例名是 shiyanlou
    final static String URL = "jdbc:mysql://localhost:3306/shiyanlou?useUnicode=true&characterEncoding=utf8";
    final static String USERNAME = "root";
    final static String PASSWORD = "";
    static Connection connection = null;
    static Statement stmt = null;
    static ResultSet rs = null;

    // 执行·插入·方法
    public static boolean executeUpdate(){
        boolean flag = false;
        try {
            // 1,加载数据库驱动
            Class.forName(DRIVER);
            // 2,获取数据库连接对象
            connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
            // 3,by连接对象, 获取Statement对象, 用来发送SQL
            stmt = connection.createStatement();
            // 4,通过executeUpdate()实现插入操作
            // String SQL = "insert into student(stuNo, stuName, stuAge) values(5, '王五', 25)";
            // String SQL = "update student set stuName = '张三' where stuName = '王五'";
            String SQL = "delete from student where stuNo = 5";
            int count = stmt.executeUpdate(SQL);
            System.out.println("受影响的行数是: " + count);
            flag = true; //如果一切正常,没有发生异常,则将flag设置为true
        } catch(ClassNotFoundException e){
            e.printStackTrace();
        } catch(SQLException e){
            e.printStackTrace();
        } catch(Exception e){
            e.printStackTrace();
        } finally {
            try {
                if(stmt != null){
                    stmt.close();
                }
                if (connection != null) {
                    connection.close();
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