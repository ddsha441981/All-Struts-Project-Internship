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

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class XmlJavaDemo {
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
	void close() throws SQLException
	{
		con.close();
		System.out.println("connection closed");
		
	}
	void firequery() throws SQLException
	{
		rs = stmt.executeQuery("select * from studentd");
		while(rs.next())
		{
			
			System.out.println(rs.getInt(1)+ "  " + rs.getString(2));
		}
		
		
	}
	
	
	
	
	
	
   public static void main(String[] args) throws ClassNotFoundException, FileNotFoundException, SQLException, IOException{
	   
	   DocumentBuilderFactory fact = DocumentBuilderFactory.newInstance();
		try {
			DocumentBuilder builder = fact.newDocumentBuilder();
			Document doc = builder.parse("input.xml");
			NodeList nod = doc.getElementsByTagName("class");
			for(int i = 0;i<nod.getLength();i++)
			{
				Node p =nod.item(i);
				if(p.getNodeType()==Node.ELEMENT_NODE)
				{
					Element person = (Element) p;
					String id = person.getAttribute("id");
					NodeList nol = person.getChildNodes();
					for(int j = 0;j< nol.getLength();j++)
					{
						Node n = nol.item(j);
						if(n.getNodeType()==Node.ELEMENT_NODE)
						{
							Element name = (Element) n;
							System.out.println("Id = "+id+ " name "+name.getTagName()+" "+name.getTextContent());
						}
					}
				}
			}
		} catch (ParserConfigurationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SAXException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	   
	   
	   
	   XmlJavaDemo xjd = new XmlJavaDemo();
	     xjd.connect();
	    // xjd.firequery();
	    //xjd.xmalf();
	     xjd.close();

      
   }
}