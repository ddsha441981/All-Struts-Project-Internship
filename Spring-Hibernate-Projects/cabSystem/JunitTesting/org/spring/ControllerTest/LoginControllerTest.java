/*package org.spring.ControllerTest;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.spring.dto.AdminLoginBeans;
import org.spring.dto.ManagerBeans;
import org.spring.repositry.LoginDaoImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:cabsystem-servlet.xml")
public class LoginControllerTest {

	@Autowired
	LoginDaoImpl loginDaoImpl;
	
	
	

	@Test
	public  void InvalidUserNameAndPasswordForAdmin()
	{
		System.out.println("in Test");
		AdminLoginBeans loginBean=new AdminLoginBeans();
		loginBean.setPassword("abc");
		loginBean.setEmailId("admin@gmail.com");
		assertNotNull(loginDaoImpl.adminLogin(loginBean));
		
	}
	
	@Test
	public  void InvalidUserNameAndPasswordFormanager()
	{
		System.out.println("in Test");
		ManagerBeans loginBean=new ManagerBeans();
		loginBean.setPassword("mabc");
		loginBean.setEmailId("manager@gmail.com");
		assertNotNull(loginDaoImpl.managerLogin(loginBean));
		
	}
}
*/