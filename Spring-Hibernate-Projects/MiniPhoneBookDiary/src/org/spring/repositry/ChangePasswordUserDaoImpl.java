package org.spring.repositry;

import org.spring.BeansClass.ChangePasswordUserBeans;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class ChangePasswordUserDaoImpl {
	
	@Autowired(required = true)
	JdbcTemplate jdbcTemplate;
	
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	
	public ChangePasswordUserBeans userchangingOwnPassword(ChangePasswordUserBeans changePasswordUserBeans){
		ChangePasswordUserBeans isExistedEmail;
		System.out.println("In Dao class of User Change Password"+changePasswordUserBeans.getUserId());
		
		String sql = "select email from user1234 where email='"+changePasswordUserBeans.getEmail()+"' and userId='"+changePasswordUserBeans.getUserId()+"'";
		System.out.println(sql);
		isExistedEmail = (ChangePasswordUserBeans) jdbcTemplate.queryForObject(sql, new BeanPropertyRowMapper(ChangePasswordUserBeans.class));
	//	System.out.println(isExistedEmail);
		
		return isExistedEmail;
		
	}
		
		public int updatedUserChangePassword(ChangePasswordUserBeans changePasswordUserBeans){
			int status = 0;
			System.out.println("In Dao class of User Change Password"+changePasswordUserBeans.getUserId());
			
			String sql = "update user1234 set autoPassword='"+changePasswordUserBeans.getAutoPassword()+"' where userId='"+changePasswordUserBeans.getUserId()+"' ";
			System.out.println(sql);
			status = jdbcTemplate.update(sql);
			System.out.println(status);
			
			return status;
	}
	

}
