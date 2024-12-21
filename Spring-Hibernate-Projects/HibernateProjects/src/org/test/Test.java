package org.test;

import org.hibernate.cfg.Configuration;

public class Test {

	public static void main(String[] args) {
		
		Configuration cfg = new Configuration();
		cfg.configure("/resources/hibernate.cfg.xml");
		cfg.buildSessionFactory();
	}
}
