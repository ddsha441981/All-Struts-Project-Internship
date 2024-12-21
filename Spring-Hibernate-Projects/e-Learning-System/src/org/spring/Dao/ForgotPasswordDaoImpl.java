package org.spring.Dao;

import org.spring.Beans.AdminBeans;
import org.spring.Beans.StudentBeans;
import org.spring.Beans.TrainerBeans;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

/***
 * @author : Deendayal
 * 
 * @param : model to set object of Forgot Password Repository class
 * 
 * @return : String name of the Jsp page (Login Using Role)
 * 
 * @ since :June 30-2017
 */

@Repository
public class ForgotPasswordDaoImpl implements ForgotPasswordDao {

	@Autowired(required = true)
	JdbcTemplate jdbcTemplate;

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	@Override
	public AdminBeans adminForgotPassword(AdminBeans adminBeans) {
		AdminBeans isExistingEmail = null;
		String sql = "select emailId,password,adminName from superadmin where emailId ='" + adminBeans.getEmailId()+ "' ";
		isExistingEmail = jdbcTemplate.queryForObject(sql, new BeanPropertyRowMapper(AdminBeans.class));
		return isExistingEmail;
	}

	@Override
	public TrainerBeans trainerForgotPassword(TrainerBeans trainerBeans) {

		TrainerBeans isExistingEmail = null;
		String sql = "select emailId,password,fname from trainer where emailId ='" + trainerBeans.getEmailId()+ "' ";
		isExistingEmail = jdbcTemplate.queryForObject(sql, new BeanPropertyRowMapper(AdminBeans.class));

		return isExistingEmail;
	}

	@Override
	public StudentBeans studentForgotPassword(StudentBeans studentBeans) {
		StudentBeans isExistingEmail = null;
		String sql = "select emailId,password,userName from student where emailId ='" + studentBeans.getEmailId()+ "' ";

		isExistingEmail = jdbcTemplate.queryForObject(sql, new BeanPropertyRowMapper(AdminBeans.class));

		return isExistingEmail;
	}

}
