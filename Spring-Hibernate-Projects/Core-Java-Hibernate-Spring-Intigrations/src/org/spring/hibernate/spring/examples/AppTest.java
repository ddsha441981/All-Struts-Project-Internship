package org.spring.hibernate.spring.examples;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * The Class AppTest.
 * @author Deendayal
 * @Since 2017
 * @Version 1.1.2
 */
public class AppTest {

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		EmployeeDao empDao = (EmployeeDao)context.getBean("employeeDaoImpl");
		
		Employee employee = new Employee();
		employee.setEmpId(100);
		employee.setName("Deendayal");
		employee.setSalary(20000);
		System.out.println("------Records Creation--------" );
		  empDao.createEmployee(employee);
		
	}
}
