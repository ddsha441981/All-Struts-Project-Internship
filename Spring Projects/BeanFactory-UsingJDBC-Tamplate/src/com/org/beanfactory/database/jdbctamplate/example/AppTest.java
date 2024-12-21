package com.org.beanfactory.database.jdbctamplate.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/** @author Deendayal */
public class AppTest {
	public static void main(String[] args) {

		ApplicationContext ctx = new ClassPathXmlApplicationContext("spring.xml");
		DAOemploye dem = (DAOemploye)ctx.getBean("emp");
		
		System.out.println("----------Table Create---------------");
		
		//dem.createtable();
		
		/*System.out.println("----------Data Insert---------------");
		
		dem.saveemployeedata(new Employee(111, "Deendayal", "15000"));
		dem.saveemployeedata(new Employee(112, "Nitin", "13000"));
		dem.saveemployeedata(new Employee(113, "Ratan", "10000"));
		dem.saveemployeedata(new Employee(114, "Bala", "8000"));
		dem.saveemployeedata(new Employee(115, "Sumit", "70000"));*/
		
		System.out.println("----------Data Retrive---------------");
		//dem.searchdata(111);
		System.out.println(dem.findAll().toString());
		
		//dem.findAll();
	}
}
