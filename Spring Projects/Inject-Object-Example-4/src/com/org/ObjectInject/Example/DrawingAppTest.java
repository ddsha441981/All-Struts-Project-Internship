package com.org.ObjectInject.Example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Deendayal Kumawat
 */
public class DrawingAppTest {

	/**
	 * @param main
	 *            method to execute my class and inject object
	 */

	public static void main(String[] args) {
		
		/**
		 *@param create Application context object to get beans
		 */
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		Triangle triangle = (Triangle) context.getBean("triangle");
		triangle.draw();
		
	}
}
