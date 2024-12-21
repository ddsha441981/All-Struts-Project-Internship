package org.spring.Service;

import org.spring.Beans.AdminBeans;
import org.spring.Beans.StudentBeans;
import org.spring.Beans.TrainerBeans;
import org.spring.Dao.LoginDao;
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
public class LoginServiceImpl implements LoginService{

	private @Autowired(required = true)
	
	LoginDao loginDao;
	
	/**
	 * Handle request to the Login and check eamilId existing or not
	 * If existing in database then dao class
	 * AdminselectRecords() method
	 * @return jsp page
	 * @since  :June 30-2017
	 */
	@Override
	public int AdminselectRecords(AdminBeans adminBeans) {
		System.out.println("In service Impl");
		return loginDao.AdminselectRecords(adminBeans);
	}

	/**
	 * Handle request to the loginand check eamilId existing or not
	 * If existing in database then login
	 * TrainerselectRecords() method
	 * @return jsp page
	 * @since  :June 30-2017
	 */
	@Override
	public int TrainerselectRecords(TrainerBeans trainerBeans) {
		
		return loginDao.TrainerselectRecords(trainerBeans);
	}

	/**
	 * Handle request to the login and check eamilId existing or not
	 * If existing in database then login
	 * StudentselectRecords() method
	 * @return jsp page
	 * @since  :June 30-2017
	 */
	@Override
	public int StudentselectRecords(StudentBeans studentBeans) {
		// TODO Auto-generated method stub
		return loginDao.StudentselectRecords(studentBeans);
	}

}
