package edu.seed.controllerTest;



import static org.junit.Assert.*;



import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;


import edu.seed.dto.LoginBean;
import edu.seed.repository.LoginDao;
import edu.seed.service.LoginServices;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations="classpath:spring-servlet.xml")
public class LoginControllerTest {
	
	@Autowired(required=true)
	LoginDao loginRepository;

	
	@Test
	public  void testForInvalidUserNameAndPassword()
	{
		System.out.println("in Test");
		LoginBean loginBean=new LoginBean();
		loginBean.setPassword("komal123");
		loginBean.setUsername("komal123@gmail.com");
		assertNotNull(loginRepository.login(loginBean));
		
	}
	
	
}
