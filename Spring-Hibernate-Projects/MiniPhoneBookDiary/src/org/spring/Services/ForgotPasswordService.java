package org.spring.Services;

import org.spring.BeansClass.ForgetPasswordBeans;
import org.spring.repositry.ForgotPasswordDaoImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ForgotPasswordService {
	
	@Autowired(required = true)
	ForgotPasswordDaoImpl forgotPassworDaoImpl;

		public ForgetPasswordBeans forgotPasswordGetFromDataBase(ForgetPasswordBeans forgotPasswordBeans){
			
			System.out.println("In service");
			return forgotPassworDaoImpl.forgotPasswordGetFromDataBase(forgotPasswordBeans);
		}

}
