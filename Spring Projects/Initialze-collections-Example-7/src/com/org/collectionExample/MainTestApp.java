package com.org.collectionExample;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainTestApp {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		Triangle trian = (Triangle)context.getBean("triangle");
		trian.draw();
	}

}
