package org.spring.Service;

import org.spring.Beans.AdminBeans;
import org.spring.Beans.StudentBeans;
import org.spring.Beans.TrainerBeans;

/***
 * @author : Deendayal
 * 
 * @param : ForgotPasswordService to set object of Login  Services interface
 * 
 * @return : String name of the Jsp page (Login Using Role)
 * 
 * @ since :June 30-2017
 */
public interface ForgotPasswordService {
	
	public AdminBeans adminForgotPassword(AdminBeans adminBeans);
	public TrainerBeans trainerForgotPassword(TrainerBeans trainerBeans);
	public StudentBeans studentForgotPassword(StudentBeans studentBeans);
}
