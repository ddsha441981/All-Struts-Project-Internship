package pack1;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;
public class LoginAction extends ActionSupport implements SessionAware{
	
	private String uname,password,role;
	private String project="PM",admin="AD",intern="I",group_leader="GL",logout="lo";
	Map m;
 
	Connection con;
	Statement st;
	ResultSet rs;
	
	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
//		try{
//			stmt=con.createStatement();
//		}catch (Exception e2)
//		{
//			e2.printStackTrace();
//		}
//		System.out.println("connected");
//		try{
//			rs=stmt.executeQuery("select * from sp_admin");
//		}catch ( Exception e1){
//			e1.printStackTrace();
//		}
//		String u=null;
//		String p=null;
//		String r=null;
//		try{
//			while(rs.next())
//			{
//				try{
//					 u = rs.getString(1);
//				}catch( Exception e2){
//					e2.printStackTrace();
//				}
//				System.out.println(""+u);
//				try{
//					 p = rs.getString(2);
//				}catch( Exception e2){
//					e2.printStackTrace();
//				}
//				System.out.println(""+p);
//				
//				try{
//					 r = rs.getString(3);
//				}catch( Exception e2){
//					e2.printStackTrace();
//				}
//				System.out.println(""+r);
//				
//				if(u.equals(uname)&&p.equals(password)&&r.equals(role))
//					break;
//			}
//		}catch( Exception e2){
//			e2.printStackTrace();
//		}
//		
	public String execute() throws SQLException
	{
		Connection con=MyConnection.getConnection();
		st=con.createStatement();
		if(role.equals("admin"))
		{
		String query="select * from sp_admin";
		rs=st.executeQuery(query);	
		int flag=0;
		while(rs.next())
		{
			if(uname.equals(rs.getString(1))&&password.equals(rs.getString(2)))
			flag=1;
		}
		if(flag==1)
		{
			m.put("uname",getUname());
		return admin;
	}	
}	
		else if(role.equals("Project Manager"))
		{
			String query="select * from sp_projectmanagernew";
			rs=st.executeQuery(query);	
			int flag=0;
			while(rs.next())
			{
				if(uname.equals(rs.getString(2))&&password.equals(rs.getString(3))){
				flag=1;
				m.put("uid",rs.getString(1));
				break;
				}
			}
			if(flag==1)
			{
				m.put("uname",getUname());
				
				return project;
		}	
		}	
	
		else if(role.equals("Intern"))
		{
			String query="select * from sp_intern";
			rs=st.executeQuery(query);	
			int flag=0;
			while(rs.next())
			{
				if(uname.equals(rs.getString(3))&&password.equals(rs.getString(4)))
				{
					flag=1;
					m.put("uid",rs.getString(1));
					break;
				}
			}
			if(flag==1)
			{
				m.put("uname",getUname());			
				return intern;
		}	
		}	
		
		else if(role.equals("Group Leader"))
		{
			String query="select * from sp_group_leader";
			rs=st.executeQuery(query);	
			int flag=0;
			while(rs.next())
			{
				if(uname.equals(rs.getString(4))&&password.equals(rs.getString(5)))
				flag=1;
			}
			if(flag==1)
			{
				m.put("uname",getUname());			
				return group_leader;
		}	
		}	
		
		
		
//		else if(r.equals("Project Manager"))
//		{
//			if(u.equals(uname)&&p.equals(password))
//			addActionError("Invalid username or password");
//			return "input";
//		}
		

//		else if(r.equals("Project Manager"))
//		{
//			if(u.equals(uname)&&p.equals(password))
//			{
//				addActionError("Invalid username or password");
//			}
//			}
//			return "input";
//		}
		return ERROR;
     }

public void setSession(Map arg0) {
m=arg0;
	
}
}