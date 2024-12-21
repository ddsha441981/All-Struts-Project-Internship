package BlobJDBC;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.Blob;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class BlobRetriveImg {

	Connection con;
	PreparedStatement pstmt;
	Statement stmt;
	ResultSet rs;
	Blob b;
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
	public void blobRetrive() throws SQLException, IOException
	{
		String sql ="select * from MyImg";
		pstmt=con.prepareStatement(sql);
		rs = pstmt.executeQuery();
		if(rs.next())
		{
		b = rs.getBlob(2);//means 2nd column data
		byte arr[] =b.getBytes(1, (int)b.length());
		
		/*means 1st row images and here typecast because contains have 
		long type value and so typecast it and converted into int */
		
		FileOutputStream fo = new FileOutputStream("OutputImage.jpg");
		fo.write(arr);
		}
		System.out.println("Image Retrive successfully");
	}
	public void close() throws SQLException
	{
		con.close();
		System.out.println("Your Connection Successfully Closed");
		
	}
	public static void main(String[] args) throws ClassNotFoundException, FileNotFoundException, SQLException, IOException {
		BlobRetriveImg br = new BlobRetriveImg();
		br.connect();
		br.blobRetrive();
		br.close();
	}
}
