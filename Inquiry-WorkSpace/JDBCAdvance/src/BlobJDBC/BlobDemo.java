package BlobJDBC;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class BlobDemo {
Connection con;
PreparedStatement pstmt;
Statement stmt;// not need this
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
public void blobCall() throws SQLException, IOException
{
	String sql ="insert into MyImg values(?,?)";//insert value
	pstmt = con.prepareStatement(sql);//Execute query
	pstmt.setInt(1, 101);//1 row insert value
	FileInputStream f = new FileInputStream("Desert.jpg");//here given path for image using instream
	pstmt.setBinaryStream(2, f,f.available());//insert image in table
	
	int i = pstmt.executeUpdate();
	System.out.println(i+"Image insert in database successfully");
	
}
public void close() throws SQLException
{
	con.close();
	System.out.println(" Connection Succesfully Closed");
}

public static void main(String[] args) throws ClassNotFoundException, FileNotFoundException, SQLException, IOException {
	BlobDemo bd = new BlobDemo();
	bd.connect();
	bd.blobCall();
	bd.close();
	
}

}
