package ClobJDBC;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class ClobDemo {

	Connection con;
	PreparedStatement pstmt;
	Statement stmt;
	
	public void connect() throws ClassNotFoundException, SQLException, FileNotFoundException, IOException
	{
		Properties p = new Properties();
		p.load(new FileInputStream("connection1.properties"));
		Class.forName(p.getProperty("driver"));
		String url =p.getProperty("url");
		
		
		con=DriverManager.getConnection(url,p.getProperty("user"),p.getProperty("password"));
		stmt = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);//Advance jdbc to check that scroll is sens and updatable
		System.out.println("Your Connection Succesfully Established");
	}
	
	public void clobFile() throws SQLException, FileNotFoundException
	{
		String sql = "insert into MyFile values (?,?)";
		pstmt = con.prepareStatement(sql);
		pstmt.setInt(1, 101);
		
		File f = new File("MyTxt.txt");
		FileReader fr = new FileReader(f);//or new FileReader(MyTxt.txt);
		pstmt.setCharacterStream(2,fr,(int)f.length());
		int i = pstmt.executeUpdate();
		System.out.println("File Data Inserted successfully");
		System.out.println("File Save Suceessfully");
		
		
		
	}
	
	public void close() throws SQLException
	{
		con.close();
		System.out.println("Your connection Suessfully closed");
	}
	
	
	
	public static void main(String[] args) throws ClassNotFoundException, FileNotFoundException, SQLException, IOException {
		
		ClobDemo cd = new ClobDemo();
		cd.connect();
		cd.clobFile();
		cd.close();
		
	}
	
}
