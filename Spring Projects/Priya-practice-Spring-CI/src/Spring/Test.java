package Spring;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
BeanFactory bfac=new ClassPathXmlApplicationContext("spring.xml");
Login l=(Login)bfac.getBean("priya");
l.user();

	}

}
