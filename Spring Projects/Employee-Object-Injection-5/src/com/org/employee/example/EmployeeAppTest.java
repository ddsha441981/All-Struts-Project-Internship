package com.org.employee.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
/**
 * @author Deendayal Kumawat
 */
public class EmployeeAppTest {
	
	/**
	 * @param main
	 * method to execute my class and inject object
	 */
	public static void main(String[] args) {
		
		/**
		 *@param create Application context object to get beans
		 */
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		 EmployeeMain employeemain =  (EmployeeMain) context.getBean("employeemain");
		 employeemain.displayemployeeDetails();
		
	}
	
}
