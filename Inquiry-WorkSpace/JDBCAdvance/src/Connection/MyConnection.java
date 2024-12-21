package Connection;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class MyConnection {
	Connection con;
	Statement stmt;
	ResultSet rs;
	
	void connect() throws ClassNotFoundException, SQLException, FileNotFoundException, IOException
	{
		Properties p = new Properties();
		p.load(new FileInputStream("connection1.properties"));
		Class.forName(p.getProperty("driver"));
		String url =p.getProperty("url");
		
		
		con=DriverManager.getConnection(url,p.getProperty("user"),p.getProperty("password"));
		stmt = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);//Advance jdbc to check that scroll is sens and updatable
		System.out.println("Your Connection Succesfully Established");
	}
	void fireQuery() throws SQLException
	{
	
		//rs = stmt.executeQuery("insert into MyLogin values(04,'Sumit','shole')");
		rs = stmt.executeQuery("select *  from MyLogin ");
		rs.next();
		
			System.out.println("Pointer is ="+rs.getRow());
			rs.absolute(+1);
			System.out.println("Pointer is ="+rs.getRow());
			rs.absolute(-1);
			System.out.println("Pointer is ="+rs.getRow());
			/*rs.beforeFirst();
			System.out.println("Pointer is "+rs.getRow());*/
			
			rs.absolute(2);
			rs.updateString("password", "dd");
			rs.updateRow();
			System.out.println("Pointer is ="+rs.getRow());
			
		/*	rs.moveToInsertRow();
			rs.updateString("id","6");
			rs.updateString("name", "dd");
			rs.updateString("password", "kk");
			rs.insertRow();
			
			rs.absolute(1);
			rs.deleteRow();
			System.out.println("After Row Delete"+rs.getRow());*/
			System.out.println(rs.getInt(1)+" "+rs.getString(2)+"  "+rs.getString(3));
		
	}
	
	void close() throws SQLException
	{
		con.close();
		System.out.println("Connection Successfully Close");
	}
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException, FileNotFoundException, IOException {
		MyConnection mc = new MyConnection();
		mc.connect();
		mc.fireQuery();
		mc.close();
		
	}

}
