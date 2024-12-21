package pack1;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Transient;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

@Entity
@Table(name="sp_Question")
public class Add_Question implements Serializable{
	
	@Transient
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(generator="QuestionId_seq")
	@SequenceGenerator(name="QuestionId_seq",initialValue=1,allocationSize=1,sequenceName="QuestionId_seq")
	private int question_id;
private String question,option_1,option_2,option_3,option_4,answer;
@Transient
private int ex_id,count,queCount,maxCount;
public int getQueCount() {
	return queCount;
}
public void setQueCount(int queCount) {
	this.queCount = queCount;
}
public int getMaxCount() {
	return maxCount;
}
public void setMaxCount(int maxCount) {
	this.maxCount = maxCount;
}
public int getEx_id() {
	return ex_id;
}
public void setEx_id(int ex_id) {
	this.ex_id = ex_id;
	CreateExam exam=new CreateExam();
	exam.setExam_id(ex_id);
	setExam_id(exam);
}
@ManyToOne
@JoinColumn
private CreateExam exam_id;
private int question_marks;

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
public int getQuestion_id() {
	return question_id;
}
public void setQuestion_id(int question_id) {
	this.question_id = question_id;
}
public CreateExam getExam_id() {
	return exam_id;
}
public void setExam_id(CreateExam exam_id) {
	this.exam_id = exam_id;
}
public int getQuestion_marks() {
	return question_marks;
}
public void setQuestion_marks(int question_marks) {
	this.question_marks = question_marks;
}

public String execute(){
	
	SessionFactory factory=new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
	Session s=factory.openSession();
	Transaction tr=s.beginTransaction();
	System.out.println(queCount+" "+maxCount);
	if(queCount<5){
	s.save(this);
	tr.commit();
	s.close();
	}
	else 
		System.out.println("question limit reached");
	    factory.close();
	
	    System.out.println(count);
	    return "success";
   }
}
