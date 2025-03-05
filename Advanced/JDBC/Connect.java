package Advanced.JDBC;
import java.sql.*;
public class Connect {
    public static void main(String[] args) throws SQLException {
        Connection conn=null;
        try {
            String userName="mysql@123";
            String password="mysql@123";
            String url="jdbc:mysql://localhost/batabase1";
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            conn=DriverManager.getConnection(url,userName,password);
        }
        catch (Exception e){
            System.out.println("cant connect to database server");
        }
        finally
        {
            if (conn!=null){
                try {
                    conn.close();
                    System.out.println("database connection terminated ");
                }
                catch (Exception e){

                }
            }
        }
        Statement stmt;
        ResultSet rs;


        //creating table
        try {
            stmt = conn.createStatement();
            stmt.execute("show tables");
            rs=stmt.getResultSet();
            System.out.println("result before creating table");
            

        }
        catch (Exception e){

        }
    }
}
