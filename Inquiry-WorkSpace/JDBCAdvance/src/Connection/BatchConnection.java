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

public class BatchConnection {
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
	con.setAutoCommit(false);
	//stmt.addBatch("insert into MyLogin values(9,'pune','java')");
	//stmt.addBatch("update MyLogin SET id=7,name='Jai',password='kishan' where id=9");//if u want to run plz remove comments
	//stmt.addBatch("delete from MyLogin where id=7");
	int count[]=stmt.executeBatch();
	for (int i : count) {
		System.out.println(i);
		
	}
	con.commit();
		
	}
	
	void close() throws SQLException
	{
		con.close();
		System.out.println("Connection Successfully Close");
	}
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException, FileNotFoundException, IOException {
		BatchConnection mc = new BatchConnection();
		mc.connect();
		mc.fireQuery();
		mc.close();
		
	}

}
