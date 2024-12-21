package pack1;

import java.util.ArrayList;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class View_Results {
	ArrayList<CheckAnswer> list;

	public ArrayList<CheckAnswer> getList() {
		return list;
	}

	public void setList(ArrayList<CheckAnswer> list) {
		this.list = list;
	}
	
	public String execute(){
		SessionFactory factory=new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
	    Session s=factory.openSession();
		Transaction tr=s.beginTransaction();
		Query q=s.createQuery("from CheckAnswer");
		list=(ArrayList<CheckAnswer>) q.list();
		tr.commit();
		s.close();
		factory.close();
		return "success";
	   }
}
