package org.spring.repositry;

import org.spring.BeansClass.ChangePasswordAdminBeans;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class ChangePasswordAdminDaoImpl {
	
	@Autowired(required = true)
	JdbcTemplate jdbcTemplate;
	
	public ChangePasswordAdminBeans adminChangePassword(ChangePasswordAdminBeans changePasswordAdminBeans){
		ChangePasswordAdminBeans isExistEmailForAdmin = null;
	//	System.out.println("In Dao Class of Change Password");
		String sql ="select email from admin1234 where email='"+changePasswordAdminBeans.getEmail()+"'";
		//System.out.println(sql);
		
		isExistEmailForAdmin = (ChangePasswordAdminBeans) jdbcTemplate.queryForObject(sql, new BeanPropertyRowMapper(ChangePasswordAdminBeans.class));
		return isExistEmailForAdmin;
	}
	
	public int updatedPasswordForAdmin(ChangePasswordAdminBeans changePasswordAdminBeans){
		int status =0;
		
		//System.out.println("In Dao Class of Change Password"+changePasswordAdminBeans.getAutoPassword());
		String sql ="update admin1234 set autoPassword='"+changePasswordAdminBeans.getAutoPassword()+"'";
		//System.out.println(sql);
		 status = jdbcTemplate.update(sql);
		// System.out.println("Updated Value"+status);
		 return status;
		
	}
	

}
