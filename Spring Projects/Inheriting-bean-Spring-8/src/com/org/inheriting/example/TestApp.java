package com.org.inheriting.example;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

/**@author Deendayal*/
public class TestApp {
	
	public static void main(String[] args) {
		//ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");//two time obj 
		//Employee emp = (Employee)context.getBean("e2");
		Resource r = new  ClassPathResource("spring.xml");
		BeanFactory factory = new XmlBeanFactory(r);
		Employee emp = (Employee)factory.getBean("e2");
		emp.show();
	}

}
