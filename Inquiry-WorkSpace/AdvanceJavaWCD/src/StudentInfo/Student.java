package StudentInfo;

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

public class Student {
	Connection con;
	Statement stmt;
	ResultSet rs;
	PreparedStatement pstmt;
	
	
	 
		
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
	
	void insertData() throws SQLException
	{
		
		String sql = "insert into studentd values(?,?,?,?) ";
		
		pstmt = con.prepareStatement(sql);
		
		pstmt.setInt(1, 04);
		
		pstmt.setString(2, "bala");
		pstmt.setString(3, "beed");
		pstmt.setString(4, "ddd");
		
		int i = pstmt.executeUpdate();
		System.out.println(i);
	}
	void retriveData() throws SQLException
	{
		String retrive = "select * from studentd";
		pstmt = con.prepareStatement(retrive);
		rs = pstmt.executeQuery();
		
		while(rs.next())
		{
			System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3));
		}
		
	}
	void updateData() throws SQLException
	{
		String updated = "update test set f_name=? where id=?";
		pstmt = con.prepareStatement(updated);
		pstmt.setString(3, "kumavat");
		pstmt.setInt(1, 02);
		
		
		int u = pstmt.executeUpdate();
		System.out.println(u +"Data successfully updated");
	}
	void close() throws SQLException
	{
		con.close();
		System.out.println("Connection closed");
	}
public static void main(String[] args) throws ClassNotFoundException, FileNotFoundException, SQLException, IOException {
		Student st = new Student();
		st.connect();
		//st.insertData();
		st.retriveData();
		//st.updateData();
		st.close();
	}
}

