package pack1;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class MyConnection{
static Connection con;
static ResultSet rs;
public static Connection getConnection(){

	try {
		try{
		Class.forName("oracle.jdbc.driver.OracleDriver");
	}catch (ClassNotFoundException e){
		e.printStackTrace();
	}
		con=DriverManager.getConnection("jdbc:oracle:thin:@SHARESRV:1521:orcl","spic","spic");
		System.out.println(con);
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	return con;
}
public static void main(String[] args)
{
	getConnection();
	}
}