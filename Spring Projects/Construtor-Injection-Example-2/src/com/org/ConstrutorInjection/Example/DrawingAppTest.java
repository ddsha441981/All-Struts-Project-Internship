package com.org.ConstrutorInjection.Example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DrawingAppTest {
	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		Circle cr = (Circle) context.getBean("circle");
		cr.draw();
		/*
		Triangle tr = (Triangle) context.getBean("triangle");
		tr.draw();*/
		
	}

}
