package org.spring.repositry;

import java.util.List;

import org.spring.dto.DepartmentBeans;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class DepartmentDaoImpl {
	
	@Autowired
	JdbcTemplate jdbcTemplate;
	
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	
	
	public int adddepartmentsData(DepartmentBeans departmentBeans){
		
		System.out.println("department Repos");
		String sql ="insert into department values(null,'"+departmentBeans.getDptname()+"')";
		
		return jdbcTemplate.update(sql);
	}
	
	
public List<DepartmentBeans> departmentAllData(DepartmentBeans departmentBeans){
		
		System.out.println("selectd All Departments");
		String sql ="select * from department";
		 List<DepartmentBeans> departList =  jdbcTemplate.query(sql,new BeanPropertyRowMapper(DepartmentBeans.class));
		 return departList ;
	}

}
