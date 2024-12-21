import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;


public class ConnectionJDBC {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		Connection con;
		Statement stmt;
		ResultSetMetaData rsmd;
		
		Class.forName("oracle.jdbc.driver.OracleDriver");
		String url ="jdbc:oracle:thin:@Deendayal-PC:1521:XE";
		Properties p1 = new Properties();
		p1.put("user", "HR");
		p1.put("password", "password");
		con = DriverManager.getConnection(url,p1);
		stmt=con.createStatement();
		System.out.println("Connection Established Successfully");
		
		ResultSet rs = stmt.executeQuery("select Employee_id,Last_Name,First_Name,Salary from Employees");
		rsmd=rs.getMetaData();
		System.err.println(rsmd.getColumnName(1) +" "+rsmd.getColumnName(2)+ " "+rsmd.getColumnName(3)+ " " +rsmd.getColumnName(4));
		while(rs.next())
		{
		System.out.println(rs.getInt(1)+ "    " +rs.getString(2) + "    " +rs.getString(3) + "     " +rs.getInt(4));
		}
		
		
	}
}
