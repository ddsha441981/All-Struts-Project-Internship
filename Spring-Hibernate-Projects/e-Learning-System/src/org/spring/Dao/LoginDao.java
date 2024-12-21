package org.spring.Dao;

import org.spring.Beans.AdminBeans;
import org.spring.Beans.StudentBeans;
import org.spring.Beans.TrainerBeans;

/***
 * @author : Deendayal
 * 
 * @param : Dao to set object of LoginDao Interface
 * 
 * @return : Getter and Setter data set 
 * 
 * @ since :June 30-2017
 */
public interface LoginDao {

	public int AdminselectRecords(AdminBeans adminBeans);
	public int TrainerselectRecords(TrainerBeans trainerBeans);
	public int StudentselectRecords(StudentBeans studentBeans);
}
