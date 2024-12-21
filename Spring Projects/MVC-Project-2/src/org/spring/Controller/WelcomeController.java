package org.spring.Controller;

import org.spring.bean.Beansdata;
import org.spring.repository.DAO.LoginRepositories;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**@param custom controller*/

@Controller
public class WelcomeController {

	@Autowired(required=true)
	LoginRepositories dao;
	
	@RequestMapping(value="/loginmydata")
	public String savelogin(Beansdata bens){
		
		System.out.println("I am in Method of Login");
		//dao.createtable();
		//dao.save(bens);// LoginRepositories class my dao class obj and its created by autowire
		dao.retriveall();
		System.out.println(dao.retriveall());
		
		return "welcome";
		
		/**go to view resolver (spring.xml)*/
	}
	
}
