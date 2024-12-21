package StudentInfo;
import java.io.File;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.Attr;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

public class WriteXMLFile {

	public static void main(String argv[]) throws TransformerException {

		Statement stmt;
		Connection con = null;
		ResultSet rs;
		String url = "jdbc:oracle:thin:@RJ_Achiever-PC:1521:XE";
		String query = "select id,f_name,l_name from users";
		int id;
		String newid;
		String fname;
		String lname;
	   try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("Loaded..");
		} catch (ClassNotFoundException e) {
			
			System.out.println("Connection Failed.....");
		}
	   try {
			con = DriverManager.getConnection(url,"HR","password");
		} catch (SQLException e1) {
			
			System.out.println("(Connection Established)");
		}
	   try {
		stmt = con.createStatement();
		rs=stmt.executeQuery(query);
		System.out.println("Query Executed Successfully");
		while(rs.next())
		{
			id = rs.getInt(1);
			newid = String.valueOf(id);
			fname = rs.getString(2);
			lname = rs.getString(3);
			System.out.println("Id : "+id);
			System.out.println("First_name : "+fname);
			System.out.println("Last_name : "+lname);

			DocumentBuilderFactory docFactory = DocumentBuilderFactory.newInstance();
			DocumentBuilder docBuilder = null;
			try {
				docBuilder = docFactory.newDocumentBuilder();
			} catch (ParserConfigurationException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			// root elements
			Document doc = docBuilder.newDocument();
			Element rootElement = doc.createElement("Users");
			doc.appendChild(rootElement);

			// staff elements
			Element seed = doc.createElement("Seed");
			rootElement.appendChild(seed);

			// set attribute to staff element
			Attr attr = doc.createAttribute("id");
			attr.setValue("1");
			seed.setAttributeNode(attr);

			// shorten way
			// staff.setAttribute("id", "1");

			// firstname elements
			Element ID = doc.createElement("ID");
			ID.appendChild(doc.createTextNode(newid));
			seed.appendChild(ID);
			Element firstname = doc.createElement("firstname");
			firstname.appendChild(doc.createTextNode(fname));
			seed.appendChild(firstname);

			// lastname elements
			Element lastname = doc.createElement("lastname");
			lastname.appendChild(doc.createTextNode(lname));
			seed.appendChild(lastname);

//			// nickname elements
//			Element nickname = doc.createElement("nickname");
//			nickname.appendChild(doc.createTextNode("mkyong"));
//			seed.appendChild(nickname);
//
//			// salary elements
//			Element salary = doc.createElement("salary");
//			salary.appendChild(doc.createTextNode("100000"));
//			seed.appendChild(salary);

			// write the content into xml file
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource source = new DOMSource(doc);
			StreamResult result = new StreamResult(new File("Newfile.xml"));
			System.out.println("File saved....");
			

			// Output to console for testing
			// StreamResult result = new StreamResult(System.out);

			transformer.transform(source, result);
		}
		
		
	} catch (SQLException e1) {
		System.out.println("Query execution failed ");
		e1.printStackTrace();
	}
	   
	  
	}
}