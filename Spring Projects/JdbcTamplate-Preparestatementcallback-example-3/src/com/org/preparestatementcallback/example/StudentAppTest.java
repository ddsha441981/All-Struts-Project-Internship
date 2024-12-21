package com.org.preparestatementcallback.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/** @author Deendayal */
public class StudentAppTest {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		DAOJdbcTamplate dao = (DAOJdbcTamplate)context.getBean("studd");
		
		System.out.println("--------Create Tables--------------------");
		
		/*dao.stcreate1();
		dao.addcreate2();
		dao.bacreate3();*/
		/*
		System.out.println("------------Insert records of Student class--------------");
		
		dao.savestudentbypreparestatement(new Student("Infonic Infotch", "Jaipur"));
		
		System.out.println("------------Insert records of Address class--------------");
		
		dao.saveaddressbypreparestatement(new Address("Shekhawat Marg", "Rajasthan", "Jaipur", "311470"));
		
		System.out.println("------------Insert records of BasicDetails class--------------");
		
		dao.savebasicdetailsofstudent(new BasicDetailsofStudent(112, "DD", 23, "PHP", "2012"));*/
		
		System.out.println("--------------------Retrive Data of Student-------------------");
		System.out.println("Student Data\n\t" +dao.retriveofstudent());
		System.out.println("Student Address\n\t" +dao.retriveofAddress());
		System.out.println("Student Basic Details\n\t" +dao.retriveofBasic());
		
	}
}
