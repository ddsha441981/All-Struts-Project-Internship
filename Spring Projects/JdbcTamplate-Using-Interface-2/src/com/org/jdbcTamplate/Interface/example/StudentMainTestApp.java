package com.org.jdbcTamplate.Interface.example;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StudentMainTestApp {
	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("spring.xml");
		
		StudentJDBCTemplate stj = (StudentJDBCTemplate)ctx.getBean("st1");
		
		/*System.out.println("------------Record Create--------------");
		stj.create(1, "Deendayal", 25);
		stj.create(2, "Nitin", 26);
		stj.create(3, "Bala", 24);
		stj.create(4, "Ratan", 30);
		*/
		System.out.println("--------Record Retrive DataBase--------");
		List<Student> students = stj.listStudents();
		for (Student student : students) {
			
			System.out.println("Id \t" +student.getId());
			System.out.println("Name \t" +student.getName());
			System.out.println("Age \t" +student.getAge());
		}
		
	}

}
