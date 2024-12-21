package org.spring.registerDao;

import org.spring.registerBeans.RegisterBeans;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class RegisterDao {
	
	@Autowired(required = true)
	JdbcTemplate jdbcTemplate;
	
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	
	public int registerContents(RegisterBeans registerBeans){
		
		System.out.println("Hello");
		String sql ="insert into register1 values(default,?,?,?,?)";
		System.out.println("My Sql Query is "+sql);
		return jdbcTemplate.update(sql,registerBeans.getUserName(),registerBeans.getPassword(),registerBeans.getEmail(),registerBeans.getMobNo());
	}

}
