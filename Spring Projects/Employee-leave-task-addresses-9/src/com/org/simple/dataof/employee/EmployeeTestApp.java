package com.org.simple.dataof.employee;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**@author Deendayal*/
public class EmployeeTestApp {
 
	public static void main(String[] args) {
	
		ApplicationContext ctx = new  ClassPathXmlApplicationContext("spring.xml");
		Employee employee = (Employee)ctx.getBean("emp");
		employee.display();
		
}
}
 
