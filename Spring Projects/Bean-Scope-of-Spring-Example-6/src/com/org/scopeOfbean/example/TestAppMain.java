package com.org.scopeOfbean.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**@author Deendayal*/

public class TestAppMain {
	/**@see main Method*/
	public static void main(String[] args) {
		
		/**@param Spring Container*/
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		Customer cust1 = (Customer)context.getBean("custom1");
		Customer cust2 = (Customer)context.getBean("custom1");
	 /**Customer cust3 = (Customer)context.getBean("custom1");
		Customer cust4 = (Customer)context.getBean("custom1");
		Customer cust5 = (Customer)context.getBean("custom1");
		Customer cust6 = (Customer)context.getBean("custom2");*/ /**This part is singleton In spring by default obj creating singleton pattern */
	/**	Customer cust3 = (Customer)context.getBean("custom2");
		Customer cust4 = (Customer)context.getBean("custom2");
		Customer cust5 = (Customer)context.getBean("custom2");
		Customer cust6 = (Customer)context.getBean("custom2");
		Customer cust7 = (Customer)context.getBean("custom2");
		Customer cust8 = (Customer)context.getBean("custom2");*/ /**This part of prototype (multiple creating obj every time when user request on container) */
		
		System.out.println("Second Obj Is Call " +cust2.getCustomId());/**This is prototype means every time create new obj */
		System.out.println("Second Obj Is Call "+ cust2.getCustomName());
		
		System.out.println("First Obj Is Call " +cust1.getCustomId());
		System.out.println("First Obj Is Call " +cust1.getCustomName());/**This is Singleton means only one time create new obj */
	}

}
