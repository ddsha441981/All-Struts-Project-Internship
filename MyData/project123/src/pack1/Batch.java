package pack1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.opensymphony.xwork2.ActionSupport;

public class Batch extends ActionSupport {
	
	private String batch_id,batch_name,start_date,end_date,technology;

	public String getBatch_id() {
		return batch_id;
	}

	public void setBatch_id(String batch_id) {
		this.batch_id = batch_id;
	}

	public String getBatch_name() {
		return batch_name;
	}

	public void setBatch_name(String batch_name) {
		this.batch_name = batch_name;
	}

	public String getStart_date() {
		return start_date;
	}

	public void setStart_date(String start_date) {
		this.start_date = start_date;
	}

	public String getEnd_date() {
		return end_date;
	}

	public void setEnd_date(String end_date) {
		this.end_date = end_date;
	}

	public String getTechnology() {
		return technology;
	}

	public void setTechnology(String technology) {
		this.technology = technology;
	}
//	ArrayList< Batch > list=new ArrayList<Batch >();
//
//	public ArrayList<Batch > getList() {
//		return list;
//	}
//
//	public void setList(ArrayList<Batch >list) {
//		this.list = list;
//	}
	
	
	public String execute()throws Exception
	{
		try{
		Connection con;
		PreparedStatement pst;
		ResultSet rs;
		con=MyConnection.getConnection();
			pst=con.prepareStatement("insert into sp_batch(batch_id,batch_name,start_date,end_date,technology) values(?,?,?,?,?)");
			pst.setString(1, batch_id);
			pst.setString(2, batch_name);
			pst.setString(3, start_date);
			pst.setString(4, end_date);
			pst.setString(5, technology);
			pst.execute();
			System.out.println("value inserted");
		    }catch(SQLException e){
			    e.printStackTrace();
		       }
		return SUCCESS;
		
	}
	public String view3()throws Exception
	{
//		try{
//		Connection con;
//		PreparedStatement ps;
//		con=MyConnection.getConnection();
//		System.out.println("view data");
//		PreparedStatement pst=con.prepareStatement("select * from sp_batch");
//	   
//	    ResultSet rs=pst.executeQuery();
//			while(rs.next())
//			{
//				Batch B1=new Batch();
//				B1.setBatch_id(rs.getString(1));
//				B1.setBatch_name(rs.getString(2));
//				B1.setStart_date(rs.getString(3));
//				B1.setEnd_date(rs.getString(4));
//				B1.setTechnology(rs.getString(5));
//			    list.add(B1);
//			    System.out.println(B1);
//	        }
//		}catch(Exception e)
//		{
//			e.printStackTrace();
//		}
			return SUCCESS;
	   }
	
//	public String edit()throws Exception
//	{
//		try{
//			Connection con;
//			PreparedStatement pst;
//			ResultSet rs;
//			con=MyConnection.getConnection();
//			pst=con.prepareStatement("update sp_batch set batch_name=?, technology=? where batch_id=?");
//			pst.setString(3, batch_id);
//			pst.setString(1, batch_name);
//			pst.setString(2, technology);
//			System.out.println("values Edited");
//		}catch (Exception e) {
//			e.printStackTrace();
//		}
//		return SUCCESS;
//	}
}
