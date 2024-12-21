package org.spring.repositry;

import java.util.List;

import org.spring.dto.ManagerBeans;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class ManagerDaoImpl {

	@Autowired
	JdbcTemplate jdbcTemplate;
	
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	
	public int saveManager(ManagerBeans managerBeans){
		
		String sql ="insert into manager values(null,'"+managerBeans.getName()+"','"+managerBeans.getGender()+"','"+managerBeans.getDob()+"','"+managerBeans.getDoj()+"','"+managerBeans.getMobNo()+"','"+managerBeans.getEmailId()+"','"+managerBeans.getPassword()+"','"+managerBeans.getDptId()+"')";
		return jdbcTemplate.update(sql);
	}
	
	public List<ManagerBeans> viewManager(ManagerBeans managerBeans){
		
		String sql ="select * from  manager";
		List<ManagerBeans> managerList =  jdbcTemplate.query(sql,new BeanPropertyRowMapper(ManagerBeans.class));
		
		return managerList;
	}
}
