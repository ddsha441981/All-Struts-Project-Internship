package org.spring.Service;

import org.spring.Beans.AdminBeans;
import org.spring.Beans.StudentBeans;
import org.spring.Beans.TrainerBeans;
import org.spring.Dao.ForgotPasswordDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/***
 * @author : Deendayal
 * 
 * @param : ForgotPasswordService to set object of Login  Services interface
 * 
 * @return : String name of the Jsp page (Login Using Role)
 * 
 * @ since :June 30-2017
 */
@Service
public class ForgotPasswordServiceImpl implements ForgotPasswordService {

	@Autowired(required = true)
	private ForgotPasswordDao forgotPasswordDao;

	/**
	 * Handle request to the Forgot Password and check eamilId existing or not
	 * If existing in database then send password by Email
	 * adminForgotPassword() method
	 * @return jsp page
	 * @since  :June 30-2017
	 */
	@Override
	public AdminBeans adminForgotPassword(AdminBeans adminBeans) {
		
		return forgotPasswordDao.adminForgotPassword(adminBeans);
	}

	/**
	 * Handle request to the Forgot Password and check eamilId existing or not
	 * If existing in database then send password by Email
	 * trainerForgotPassword() method
	 * @return jsp page
	 * @since  :June 30-2017
	 */
	@Override
	public TrainerBeans trainerForgotPassword(TrainerBeans trainerBeans) {

		return forgotPasswordDao.trainerForgotPassword(trainerBeans);
	}
	
	/**
	 * Handle request to the Forgot Password and check eamilId existing or not
	 * If existing in database then send password by Email
	 * studentForgotPassword() method
	 * @return jsp page
	 * @since  :June 30-2017
	 */
	@Override
	public StudentBeans studentForgotPassword(StudentBeans studentBeans) {
		
		return forgotPasswordDao.studentForgotPassword(studentBeans);
	}

	
	
	

}
