package org.spring.Dao;

import org.spring.Beans.AdminBeans;
import org.spring.Beans.StudentBeans;
import org.spring.Beans.TrainerBeans;

/***
 * @author : Deendayal
 * 
 * @param : Dao to set object of ForgotPasswordDao Interface
 * 
 * @return : Getter and Setter data set 
 * 
 * @ since :June 30-2017
 */
public interface ForgotPasswordDao {

	public AdminBeans adminForgotPassword(AdminBeans adminBeans);
	public TrainerBeans trainerForgotPassword(TrainerBeans trainerBeans);
	public StudentBeans studentForgotPassword(StudentBeans studentBeans);

}
