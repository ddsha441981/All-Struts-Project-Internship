package com.org.DIexample.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**@author Deendayal*/
public class ExamAppTest {

	public static void main(String[] args) {
		
		ApplicationContext ctx = new ClassPathXmlApplicationContext("spring.xml");
		Exam ex = (Exam)ctx.getBean("exams");
		ex.display();
	}
}
