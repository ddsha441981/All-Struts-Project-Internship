package pack1;

import java.util.Date;
import java.util.Map;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;
import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.interceptor.ServletRequestAware;
import org.apache.struts2.interceptor.SessionAware;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

@Entity
@Table(name="sp_result")
public class CheckAnswer implements ServletRequestAware,SessionAware {
    @Transient
	HttpServletRequest request;
	
	@Id
	@GeneratedValue(generator="resultId_seq")
	@SequenceGenerator(name="resultId_seq",initialValue=1,allocationSize=1,sequenceName="resultId_seq")
	private int id;
	private int percentage;

	
	@ManyToOne
	@JoinColumn
	private CreateExam e_id;
	
	/*@ManyToOne
	@JoinColumn
	private Intern user_id;
	public Intern getUser_id() {
		return user_id;
	}

	public void setUser_id(Intern user_id) {
		this.user_id = user_id;
	}
	*/
	private String user_id;
	
	
	
	public String getUser_id() {
		return user_id;
	}

	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}
	@Temporal(TemporalType.DATE)
	private Date Exam_date;
	
	@Transient
	private int count,no_que,attempted_que;
	@Transient
	private String e_title,e_marks;
	@Transient
	Map m;
	
	@Override
	public void setServletRequest(HttpServletRequest request) {
		this.request = request;
	}
	
	public CreateExam getE_id() {
		return e_id;
	}

	public void setE_id(CreateExam e_id) {
		this.e_id = e_id;
	}

	

	public Date getExam_date() {
		return Exam_date;
	}
	public void setExam_date(Date exam_date) {
		Exam_date = exam_date;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public String getE_title() {
		return e_title;
	}
	public void setE_title(String e_title) {
		this.e_title = e_title;
	}
	public String getE_marks() {
		return e_marks;
	}
	public void setE_marks(String e_marks) {
		this.e_marks = e_marks;
	}
	
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
public int getNo_que() {
		return no_que;
	}
public void setNo_que(int no_que) {
		this.no_que = no_que;
	}
public int getPercentage() {
		return percentage;
	}
public void setPercentage(int percentage) {
		this.percentage = percentage;
	}
public int getAttempted_que() {
		return attempted_que;
	}
public void setAttempted_que(int attempted_que) {
		this.attempted_que = attempted_que;
	}

	public String execute(){
		return "success";
	}
	
	public String checkAns(){
		System.out.println("Inside execute");
		String[] q_id=request.getParameterValues("q_id");
		for(int i=0;i<q_id.length;i++){
			System.out.println(q_id[i]);
			System.out.println(request.getParameter("ans"+q_id[i]));
			System.out.println(request.getParameter("c_ans"+q_id[i]));
			System.out.println("------------------------------------");
			
			if(request.getParameter("c_ans"+q_id[i]).equals(request.getParameter("ans"+q_id[i]))){
				count++;
			}
			if(request.getParameter("ans"+q_id[i])!=null){
				attempted_que++;
			}
			no_que++;
	}
		
		int e_id=Integer.parseInt(request.getParameter("e_id"));
		e_title=request.getParameter("e_title");
		e_marks=request.getParameter("e_marks");
		String user_id=(String) m.get("uid");
		System.out.println("Correct ans "+count);
		System.out.println("No of question is "+no_que);
		percentage=(100*count)/q_id.length;
		System.out.println("percentage is "+(100*count)/q_id.length);
		System.out.println("Total attempted questions  "+attempted_que);
		System.out.println(e_id);
		System.out.println(e_title);
		System.out.println(e_marks);
		System.out.println(user_id);
		resultDB(e_id,user_id);
		return "success";
}
private void resultDB(int examId,String userId){
		
 SessionFactory factory=new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
 Session s=factory.openSession();
 Transaction tr=s.beginTransaction();
 setExam_date(new Date());
 
 CreateExam e=new CreateExam();
 e.setExam_id(examId);
 setE_id(e);
 
/* Intern i=new Intern();
 i.setIntern_id(userId);*/
 setUser_id(userId);
 s.save(this);
 tr.commit();
 s.close();
 factory.close();
 }
	@Override
	public void setSession(Map arg0){
		m=arg0;
	}
}
