package pack1;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class create_group {
private String group_id,intern_id,project_name;

public String getGroup_id() {
	return group_id;
}

public void setGroup_id(String group_id) {
	this.group_id = group_id;
}

public String getIntern_id() {
	return intern_id;
}

public void setIntern_id(String intern_id) {
	this.intern_id = intern_id;
}

public String getProject_name() {
	return project_name;
}

public void setProject_name(String project_name) {
	this.project_name = project_name;
}

ArrayList< create_group > list=new ArrayList<create_group >();

public ArrayList< create_group > getList() {
	return list;
}

public void setList(ArrayList<create_group> list) {
	this.list = list;
}

public String execute() throws ClassNotFoundException{
	Connection con;
	PreparedStatement pst;
	ResultSet rs;
	con=MyConnection.getConnection();
	try{
		pst=con.prepareStatement("insert into sp_group values(?,?,?)");
		pst.setString(1, group_id);
		pst.setString(2, intern_id);
		pst.setString(3, project_name);
		pst.execute();
		System.out.println("value inserted");
	}catch(SQLException e){
		e.printStackTrace();
	}
    return "success";  
  }

public String view4()throws Exception
{
	try{
	Connection con;
	PreparedStatement ps;
	con=MyConnection.getConnection();
	System.out.println("view data");
	PreparedStatement pst=con.prepareStatement("select * from sp_group");
    ResultSet rs=pst.executeQuery();
		while(rs.next())
		{
			create_group C1=new create_group();
			C1.setGroup_id(rs.getString(1));
			C1.setIntern_id(rs.getString(2));
			C1.setProject_name(rs.getString(3));
		    list.add(C1);			
        }
	}catch(Exception e)
	{
		e.printStackTrace();
	}
		return "success";
   }

}
