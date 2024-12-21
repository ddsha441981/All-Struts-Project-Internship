package Database;
import java.sql.*;
public class DbConnection {
    static Connection con;
    public static Connection dataConnection()
    {
        try
        {
Class.forName("com.mysql.jdbc.Driver");
con = DriverManager.getConnection("jdbc:mysql://localhost:3306/project","root","root");
            System.out.println("Database connected");
        }catch(Exception e)
        {
    System.out.println("Database not connected " +e);
        } 
        return con;
    }    

}
