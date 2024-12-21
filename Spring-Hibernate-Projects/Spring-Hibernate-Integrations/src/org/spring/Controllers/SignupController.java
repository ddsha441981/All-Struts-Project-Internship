package org.spring.Controllers;
/**
 * @author Deendayal
 * @since 2017
 * @version 1.1.2*/

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.spring.dao.Employeedao;
import org.spring.daoimpl.DaoImpli;
import org.spring.services.SignUp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
public class SignupController {
	
	/*@Autowired(required=true)
	SessionFactory sessionFactory;*/
	@Autowired
	Employeedao dao;
	
	@RequestMapping("/signuppage")
	public String mapping(){
		System.out.println("In Method");
		return "signup";
	}
	
	
	
	@RequestMapping("/signupdata")
	public String signupData(SignUp signUp){
		System.out.println("In signupdata Method");
		System.out.println("Name : "+signUp.getName());
		System.out.println("Password : "+signUp.getPassword());
		
		//dao.add(signUp);
		List<SignUp> j = dao.getall();
		j.toString();
		/*Session s=sessionFactory.openSession();
		Transaction tr=s.beginTransaction();
			s.save(signUp);
		tr.commit();
		s.close();*/
		
		
		
		return "signup";
	}
}
