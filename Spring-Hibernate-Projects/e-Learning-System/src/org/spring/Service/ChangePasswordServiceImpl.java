package org.spring.Service;

import org.spring.Beans.AdminBeans;
import org.spring.Beans.StudentBeans;
import org.spring.Beans.TrainerBeans;
import org.spring.Dao.ChangePasswordDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ChangePasswordServiceImpl implements ChangePasswordService {

	@Autowired(required = true)
	ChangePasswordDao changePasswordDao;

	@Override
	public AdminBeans changePasswordByAmin(AdminBeans adminBeans) {
		
		return changePasswordDao.changePasswordByAmin(adminBeans);
	}

	@Override
	public int updatedpwdExistedEmailAdmin(AdminBeans adminBeans) {
		
		return changePasswordDao.updatedpwdExistedEmailAdmin(adminBeans);
	}

	@Override
	public TrainerBeans changePasswordByTrainer(TrainerBeans trainerBeans) {
		
		return changePasswordDao.changePasswordByTrainer(trainerBeans);
	}

	@Override
	public int updatedpwdExistedEmailTrainer(TrainerBeans trainerBeans) {
		
		return changePasswordDao.updatedpwdExistedEmailTrainer(trainerBeans);
	}

	@Override
	public StudentBeans changePasswordByStudent(StudentBeans studentBeans) {
		
		return changePasswordDao.changePasswordByStudent(studentBeans);
	}

	@Override
	public int updatedpwdExistedEmailStudent(StudentBeans studentBeans) {
		
		return changePasswordDao.updatedpwdExistedEmailStudent(studentBeans);
	}
}
