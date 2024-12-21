package org.spring.Dao;

import org.spring.Beans.AdminBeans;
import org.spring.Beans.StudentBeans;
import org.spring.Beans.TrainerBeans;

public interface ChangePasswordDao {

	public AdminBeans changePasswordByAmin(AdminBeans adminBeans);

	public int updatedpwdExistedEmailAdmin(AdminBeans adminBeans);

	public TrainerBeans changePasswordByTrainer(TrainerBeans trainerBeans);

	public int updatedpwdExistedEmailTrainer(TrainerBeans trainerBeans);

	public StudentBeans changePasswordByStudent(StudentBeans studentBeans);

	public int updatedpwdExistedEmailStudent(StudentBeans studentBeans);

}
