package pack1;
import java.io.Serializable;
import java.util.*;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.TableGenerator;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

import org.apache.struts2.interceptor.SessionAware;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
@Entity
@Table(name="sp_Exam")
public class CreateExam implements SessionAware,Serializable {
	/**
	 * 
	 */
	@Transient
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(generator="examId_seq")
	@SequenceGenerator(name="examId_seq",initialValue=1,allocationSize=1,sequenceName="examId_seq")
	
	private int exam_id;
	private int total_marks;
	private String exam_title,project_manager_id,status;
	@OneToMany(fetch=FetchType.EAGER, mappedBy="exam_id")
	
	private List<Add_Question> questions;
	
	public List<Add_Question> getQuestions() {
		return questions;
	}
	public void setQuestions(List<Add_Question> questions) {
		this.questions = questions;
	}
	@Temporal(TemporalType.DATE)
	private Date created_date;
	@Transient
	Map m;
	
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
	setCreated_date(new Date());
	setStatus("disable");
	setProject_manager_id((String)(m.get("uid")));
	s.save(this);
	tr.commit();
	s.close();
	factory.close();
	return "success";
   }

 public void setSession(Map arg0) {
	m=arg0;
   }
}
