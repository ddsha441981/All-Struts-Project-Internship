import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;


public class MyConnection {
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Connection con;
		Statement stmt;
		ResultSet rs;
		ResultSetMetaData rsmd;
		Class.forName("oracle.jdbc.driver.OracleDriver");
		String url ="jdbc:oracle:thin:@Deendayal-PC:1521:XE";
		Properties p = new Properties();
		p.put("user", "HR");
		p.put("password","password");
		con=DriverManager.getConnection(url,p);
		stmt=con.createStatement();
		System.out.println("Connection Successfully..........");
		
		 rs=stmt.executeQuery("select Id , Name , Age , Address , Salary from Customers");
		 rsmd=rs.getMetaData();
		System.out.println( rsmd.getColumnName(1)+" "+rsmd.getColumnName(2)+" "+rsmd.getColumnName(3)+" "+rsmd.getColumnName(4)+" "+rsmd.getColumnName(5));
		 while(rs.next())
		 {
		 System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getInt(3)+" "+rs.getString(4)+" "+rs.getInt(5));
		 
		 }
	}

}
