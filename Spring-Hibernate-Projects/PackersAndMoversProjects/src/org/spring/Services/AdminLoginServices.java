package org.spring.Services;

import org.spring.DaoImpl.AdminLoginDao;
import org.spring.dto.AdminBeans;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AdminLoginServices {
	
	@Autowired(required =true)
	AdminLoginDao adminLoginDao;
	
	public int adminLoginCredientials(AdminBeans adminBeans){
		
		return adminLoginDao.adminLoginCredientials(adminBeans);
	}

}
