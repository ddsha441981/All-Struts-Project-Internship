package pack1;

import java.util.Map;

import javax.persistence.Transient;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Give_Exam {

private int question_id;
private String question,option_1,option_2,option_3,option_4,answer;
private int exam_id;
private int question_marks;

	@Transient
	Map m;
	@Transient
	CreateExam exam;
	public CreateExam getExam() {
		return exam;
	}
	public void setExam(CreateExam exam) {
		this.exam = exam;
	}
	//ArrayList<Add_Question> list;

public int getQuestion_id() {
	return question_id;
}
public void setQuestion_id(int question_id) {
	this.question_id = question_id;
}
public String getQuestion() {
	return question;
}
public void setQuestion(String question) {
	this.question = question;
}
public String getOption_1() {
	return option_1;
}
public void setOption_1(String option_1) {
	this.option_1 = option_1;
}
public String getOption_2() {
	return option_2;
}
public void setOption_2(String option_2) {
	this.option_2 = option_2;
}
public String getOption_3() {
	return option_3;
}
public void setOption_3(String option_3) {
	this.option_3 = option_3;
}
public String getOption_4() {
	return option_4;
}
public void setOption_4(String option_4) {
	this.option_4 = option_4;
}
public String getAnswer() {
	return answer;
}
public void setAnswer(String answer) {
	this.answer = answer;
}
public int getExam_id() {
	return exam_id;
}
public void setExam_id(int exam_id) {
	this.exam_id = exam_id;
}
public int getQuestion_marks() {
	return question_marks;
}
public void setQuestion_marks(int question_marks) {
	this.question_marks = question_marks;
}
/*public ArrayList<Add_Question> getList() {
	return list;
}
public void setList(ArrayList<Add_Question> list) {
	this.list = list;
}
*/
	
	
public String execute(){
	SessionFactory factory=new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
	
	
	Session s=factory.openSession();
	Transaction tr=s.beginTransaction();
	//Query q=s.createSQLQuery("update sp_exam set status='enable' where exam_id="+id);
	Query q=s.createQuery("from CreateExam where exam_id=:i");
	q.setParameter("i", exam_id);
	exam=(CreateExam) q.getSingleResult();
	
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
