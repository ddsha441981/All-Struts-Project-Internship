//package pack1;
//
//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.PreparedStatement;
//import java.sql.ResultSet;
//import java.sql.SQLException;
//import java.sql.Statement;
//import java.util.ArrayList;
//
//import pack1.LoginAction;
//
//import com.opensymphony.xwork2.ActionSupport;
//import com.opensymphony.xwork2.ModelDriven;
//import com.opensymphony.xwork2.validator.annotations.RequiredStringValidator;
//
//public class ProjectManager  extends ActionSupport{
//	
//	private String project_manager_id,name,password,re_enter_password,mobile_number,e_mail,birth_date,join_date,gender,country,city;  
//	
//    ArrayList< ProjectManager > list=new ArrayList<ProjectManager>();
//
//	
//	public ArrayList<ProjectManager> getList() {
//		return list;
//	}
//
//	public void setList(ArrayList<ProjectManager> list) {
//		this.list = list;
//	}
//	
//	public String getProject_manager_id() {
//		return project_manager_id;
//	}
//	
//	@RequiredStringValidator(fieldName="project_manager_id",message="Invalid ID")
//	public void setProject_manager_id(String project_manager_id) {
//		this.project_manager_id = project_manager_id;
//	}
//
//	public String getName() {
//		return name;
//	}
//
//	public void setName(String name) {
//		this.name = name;
//	}
//
//	public String getPassword() {
//		return password;
//	}
//
//	public void setPassword(String password) {
//		this.password = password;
//	}
//
//	public String getRe_enter_password() {
//		return re_enter_password;
//	}
//
//	public void setRe_enter_password(String re_enter_password) {
//		this.re_enter_password = re_enter_password;
//	}
//
//	public String getMobile_number() {
//		return mobile_number;
//	}
//
//	public void setMobile_number(String mobile_number) {
//		this.mobile_number = mobile_number;
//	}
//
//	public String getE_mail() {
//		return e_mail;
//	}
//
//	public void setE_mail(String e_mail) {
//		this.e_mail = e_mail;
//	}
//
//	public String getBirth_date() {
//		return birth_date;
//	}
//
//	public void setBirth_date(String birth_date) {
//		this.birth_date = birth_date;
//	}
//
//	public String getJoin_date() {
//		return join_date;
//	}
//
//	public void setJoin_date(String join_date) {
//		this.join_date = join_date;
//	}
//
//	public String getGender() {
//		return gender;
//	}
//
//	public void setGender(String gender) {
//		this.gender = gender;
//	}
//
//	public String getCountry() {
//		return country;
//	}
//
//	public void setCountry(String country) {
//		this.country = country;
//	}
//
//	public String getCity() {
//		return city;
//	}
//
//	public void setCity(String city) {
//		this.city = city;
//	}
//
//	
//	public String execute() throws Exception
//	{
//		try{
//			Connection con;
//			PreparedStatement pst;
//			ResultSet rs;
//			con=MyConnection.getConnection();
//				pst=con.prepareStatement("insert into sp_projectmanagernew values(?,?,?,?,?,?,?,?,?,?,?)");
//				pst.setString(1, project_manager_id);
//				pst.setString(2, name);
//				pst.setString(3, password);
//				pst.setString(4, re_enter_password);
//				pst.setString(5, mobile_number);
//				pst.setString(6, e_mail);
//				pst.setString(7, birth_date);
//				pst.setString(8, join_date);
//				pst.setString(9, gender);
//				pst.setString(10, country);
//				pst.setString(11, city);
//				pst.execute();
//				System.out.println("value inserted");
//			}catch(SQLException e){
//				e.printStackTrace();
//			}
//			return "success";
//		  }
//	
//	public String view()
//	{
////		try{
//			Connection con;
//			PreparedStatement ps;
//			con=MyConnection.getConnection();
//			System.out.println("view data");
//			PreparedStatement pst=con.prepareStatement("select * from sp_projectmanagernew");
//            ResultSet rs=pst.executeQuery();
//		 while(rs.next())
//			{
//			    ProjectManager CPM=new ProjectManager();
//				CPM.setProject_manager_id(rs.getString(1));
//				CPM.setName(rs.getString(2));
//				CPM.setPassword(rs.getString(3));
//				CPM.setMobile_number(rs.getString(5));
//				CPM.setE_mail(rs.getString(6));
//				CPM.setBirth_date(rs.getString(7));
//				CPM.setJoin_date(rs.getString(8));
//				CPM.setGender(rs.getString(9));
//				CPM.setCountry(rs.getString(10));
//				CPM.setCity(rs.getString(11));
//			    list.add(CPM);	
//            }
//		}catch(Exception e){
//		e.printStackTrace();	
//		}
//			return "success";
//	}
//	
//public String getEditRecord(){
//		try{  
//			Connection con;
//			PreparedStatement pst;
//			con=MyConnection.getConnection();
//			PreparedStatement ps=con.prepareStatement("select * from sp_projectmanagernew where ProjectManager_id=?");  
//			ps.setString(1, project_manager_id);
//			ResultSet rs =ps.executeQuery();  
//			while(rs.next()){
//				   ProjectManager PM=new ProjectManager();
//				   PM.setProject_manager_id(rs.getString(1));
//				   PM.setName(rs.getString(2));
//				   PM.setPassword(rs.getString(3));
//				   PM.setRe_enter_password(rs.getString(4));
//				   PM.setMobile_number(rs.getString(5));
//				   PM.setE_mail(rs.getString(6));
//				   PM.setBirth_date(rs.getString(7));
//				   PM.setJoin_date(rs.getString(8));
//				   PM.setGender(rs.getString(9));
//				   PM.setCountry(rs.getString(10));
//				   PM.setCity(rs.getString(11));
//			   }
//			   con.close();
//			  }
//			  catch(Exception e)
//			  {e.printStackTrace();}  
//		
//		return "success";
//	}
//	
//
//	public String edit(){
//		try{  
//			Connection con;
//			con=MyConnection.getConnection();
//			PreparedStatement ps=con.prepareStatement("update sp_projectmanagernew set username=?, password=?, re_enter_password=?, mobile_number=?, e_mail=?, birth_date=?, join_date=?, gender=?, country=?, city=? where project_manager_id=?");  
//			ps.setString(1, project_manager_id);
//			ps.setString(2, name);
//			ps.setString(3, password);
//			ps.setString(4, re_enter_password);
//			ps.setString(5, mobile_number);
//			ps.setString(6, e_mail);
//			ps.setString(7, birth_date);
//			ps.setString(8, join_date);
//			ps.setString(9, gender);
//			ps.setString(10, country);
//			ps.setString(11, city);
//			int count =ps.executeUpdate();  
//			con.close();
//			}
//	       catch(Exception e)
//		   {e.printStackTrace();}  
//		return "success";
//	}
//	
//}
