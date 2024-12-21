package org.spring.Service;

import org.spring.Beans.AdminBeans;
import org.spring.Beans.StudentBeans;
import org.spring.Beans.TrainerBeans;

/***
 * @author : Deendayal
 * 
 * @param : LoginService to set object of Login  Services interface
 * 
 * @return : String name of the Jsp page (Login Using Role)
 * 
 * @ since :June 30-2017
 */
public interface LoginService {

	public int AdminselectRecords(AdminBeans adminBeans);
	public int TrainerselectRecords(TrainerBeans trainerBeans);
	public int StudentselectRecords(StudentBeans studentBeans);

}
