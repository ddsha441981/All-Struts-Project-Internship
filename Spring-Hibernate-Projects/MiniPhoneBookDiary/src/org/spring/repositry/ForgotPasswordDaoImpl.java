package org.spring.repositry;

import org.spring.BeansClass.ForgetPasswordBeans;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class ForgotPasswordDaoImpl {

	@Autowired(required = true)
	JdbcTemplate jdbcTemplate;
	
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	
	public ForgetPasswordBeans forgotPasswordGetFromDataBase(ForgetPasswordBeans forgotPasswordBeans){
	
		ForgetPasswordBeans isemailExistsRowbean = null;
	
		String sql ="select username,email,autoPassword from user1234 where email='"+forgotPasswordBeans.getEmail()+"' ";
		
		isemailExistsRowbean = (ForgetPasswordBeans)jdbcTemplate.queryForObject(sql,new BeanPropertyRowMapper(ForgetPasswordBeans.class));
		//System.out.println("User Emil and Password is "+isemailExistsRowbean);
		return isemailExistsRowbean;
	}
	
}
