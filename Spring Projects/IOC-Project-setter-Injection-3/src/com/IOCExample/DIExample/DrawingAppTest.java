package com.IOCExample.DIExample;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

@SuppressWarnings("unused")
public class DrawingAppTest {
	public static void main(String[] args) {
		//BeanFactory factory = new XmlBeanFactory(new ClassPathResource("spring.xml"));
		//Triangle triangle = (Triangle) factory.getBean("triangle");
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		Triangle triangle = (Triangle) context.getBean("triangle");//here pass Id its mapping in spring.xml
		triangle.draw();
		Circle circle = (Circle) context.getBean("circle");//here pass Id its mapping in spring.xml
		circle.draw();
	}

}
