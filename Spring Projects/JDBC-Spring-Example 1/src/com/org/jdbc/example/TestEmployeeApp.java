package com.org.jdbc.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**@author Deendayal*/
public class TestEmployeeApp {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		DAOemployee empD = (DAOemployee)context.getBean("edao");
		/*int status = empD.saveEmployee(new Employee(115,"ratan",12000));
		System.out.println(status);*/
		
		int status = empD.updateEmployee(new Employee(115,"Sunil",10000));
		System.out.println(status);
	}
}
