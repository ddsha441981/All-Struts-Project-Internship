package pack1;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class AjaxCall {
	private int id;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}

	public String execute(){
	return "success";
	
}
	public String enable(){
		System.out.println("Ajax call : "+id);
		
		SessionFactory factory=new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
		Session s=factory.openSession();
		Transaction tr=s.beginTransaction();
		Query q=s.createSQLQuery("update sp_exam set status='enable' where exam_id="+id);
		/*
		q.setParameter("status", "Enable");
		q.setParameter("exid", getId());*/
		int result=q.executeUpdate();
		//s.save(this);
		tr.commit();
		s.close();
		factory.close();
		return "success";
	}
}
