package pack1;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class dropdownlistview {
List<Intern> list3=new ArrayList<Intern>();
	
	public List<Intern> getList3() {
		return list3;
	}

	public void setList3(ArrayList<Intern> list3) {
		this.list3 = list3;
	}
	
	public String execute(){
		try{
		Connection con;
		PreparedStatement ps;
		con=MyConnection.getConnection();
		PreparedStatement pst=con.prepareStatement("select INTERN_ID from sp_intern");
	    ResultSet rs=pst.executeQuery();
	    while(rs.next()){
	    	Intern I1=new Intern();
	    	I1.setIntern_id(rs.getString(1));
	    	
	    	list3.add(I1);
	    }
	    con.close();
		}catch(Exception e){
			e.printStackTrace();
		}
		return "success";
	}
}
