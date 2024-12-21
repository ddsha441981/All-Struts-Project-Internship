package org.spring.repositry;

import org.spring.BeansClass.UserRegisterBeans;
import org.spring.utility.DataBaseFile;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class UserRegisterDaoImpl {

	@Autowired(required = true)
	JdbcTemplate jdbcTemplate;
	
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	
	public int registerUserContents(UserRegisterBeans userRegisterBeans){
		
		System.out.println("In Repositry Class of user register");
		String sql="insert into user1234 values(seq1.nextVal,'"+userRegisterBeans.getUsername()+"','"+userRegisterBeans.getEmail()+"','"+userRegisterBeans.getAutoPassword()+"','"+userRegisterBeans.getContactNo()+"','"+userRegisterBeans.getAddress()+"','user')";
		System.out.println(sql);
		return jdbcTemplate.update(sql);
	}
}
