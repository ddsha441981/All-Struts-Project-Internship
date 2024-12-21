package org.spring.Dao;

import org.spring.Beans.AdminBeans;
import org.spring.Beans.StudentBeans;
import org.spring.Beans.TrainerBeans;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class ChangePasswordDaoImpl implements ChangePasswordDao {

	@Autowired(required = true)
	JdbcTemplate jdbcTemplate;

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	@Override
	public AdminBeans changePasswordByAmin(AdminBeans adminBeans) {
		AdminBeans isExistEmailAdmins = null;
		String sql = "select emailId from superadmin where emailId='" + adminBeans.getEmailId() + "'";
		System.out.println(sql);
		isExistEmailAdmins = (AdminBeans) jdbcTemplate.queryForObject(sql, new BeanPropertyRowMapper(AdminBeans.class));
		
		return isExistEmailAdmins;
	}

	@Override
	public int updatedpwdExistedEmailAdmin(AdminBeans adminBeans) {
		
		String sql ="update superadmin set password ='"+adminBeans.getPassword()+"'";
		return jdbcTemplate.update(sql);
	}

	@Override
	public TrainerBeans changePasswordByTrainer(TrainerBeans trainerBeans) {
		TrainerBeans isExistEmailTrainer = null;
		String sql = "select emailId from trainer where emailId='" + trainerBeans.getEmailId() + "'";
		System.out.println(sql);
		isExistEmailTrainer = (TrainerBeans) jdbcTemplate.queryForObject(sql, new BeanPropertyRowMapper(TrainerBeans.class));
		System.out.println(isExistEmailTrainer+"///////////////////////////");
		return isExistEmailTrainer;
	}

	@Override
	public int updatedpwdExistedEmailTrainer(TrainerBeans trainerBeans) {
		String sql ="update trainer set password ='"+trainerBeans.getPassword()+"'";
		return jdbcTemplate.update(sql);
	}

	@Override
	public StudentBeans changePasswordByStudent(StudentBeans studentBeans) {
		
		StudentBeans isExistEmailStudent = null;
		String sql = "select emailId from student where emailId='" + studentBeans.getEmailId() + "'";
		isExistEmailStudent = (StudentBeans) jdbcTemplate.queryForObject(sql, new BeanPropertyRowMapper(StudentBeans.class));
		return isExistEmailStudent;
	}

	@Override
	public int updatedpwdExistedEmailStudent(StudentBeans studentBeans) {
		
		String sql ="update student set password ='"+studentBeans.getPassword()+"'";
		System.out.println("After Update"+sql);
		return jdbcTemplate.update(sql);
	}

}
