package pack1;
import java.util.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.TableGenerator;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

import org.apache.struts2.interceptor.SessionAware;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import java.util.ArrayList;

public class View_Exam implements SessionAware {
	
	private int exam_id;
	private int total_marks;
	private String exam_title,project_manager_id,status;
	@Temporal(TemporalType.DATE)
	private Date created_date;
	@Transient
	Map m;
	ArrayList<CreateExam> list;
	
	public ArrayList<CreateExam> getList() {
		return list;
	}
	public void setList(ArrayList<CreateExam> list) {
		this.list = list;
	}
	public int getExam_id() {
		return exam_id;
	}
	public void setExam_id(int exam_id) {
		this.exam_id = exam_id;
	}
	public int getTotal_marks() {
		return total_marks;
	}
	public void setTotal_marks(int total_marks) {
		this.total_marks = total_marks;
	}
	public String getExam_title() {
		return exam_title;
	}
	public void setExam_title(String exam_title) {
		this.exam_title = exam_title;
	}
	public String getProject_manager_id() {
		return project_manager_id;
	}
	public void setProject_manager_id(String project_manager_id) {
		this.project_manager_id = project_manager_id;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public Date getCreated_date() {
		return created_date;
	}
	public void setCreated_date(Date created_date) {
		this.created_date = created_date;
	}
	
public String execute(){
	SessionFactory factory=new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
    Session s=factory.openSession();
	Transaction tr=s.beginTransaction();
	Query q=s.createQuery("from CreateExam where STATUS= 'enable' ");
	list=(ArrayList<CreateExam>) q.list();
	//list=new ArrayList<CreateExam>(); 
	tr.commit();
	
	s.close();
	factory.close();
	return "success";
	
	
   }
public void setSession(Map arg0) {
	m=arg0;
	
}
}
