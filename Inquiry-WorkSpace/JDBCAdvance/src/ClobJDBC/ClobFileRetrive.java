package ClobJDBC;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.sql.Clob;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class ClobFileRetrive {

	Connection con;
	Statement stmt;
	PreparedStatement pstmt;
	ResultSet rs;
	Clob cb;
	Reader rr;
	FileWriter fw;
	
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
	public void fileRetrive() throws SQLException, IOException
	{
		String sql ="select * from MyFile";
		pstmt = con.prepareStatement(sql);
		rs = pstmt.executeQuery();
		rs.next();//now pointer is 1st row
		cb = rs.getClob(2);
		rr= cb.getCharacterStream();//read data from file char by char
		fw = new FileWriter("MyFile.txt");//you give here any name of file
		
		int i;
		while((i=rr.read())!=-1)
		{
			fw.write((char)i);
			
			
		}
		fw.close();
		System.out.println("File Received Successfully");
		
		
	}
	public void close() throws SQLException
	{
		con.close();
		System.out.println("Your connetion successfully Closed");
		
	}
	public static void main(String[] args) throws ClassNotFoundException, FileNotFoundException, SQLException, IOException {
		
		ClobFileRetrive cfr = new ClobFileRetrive();
		cfr.connect();
		cfr.fileRetrive();
		cfr.close();
	}
}
