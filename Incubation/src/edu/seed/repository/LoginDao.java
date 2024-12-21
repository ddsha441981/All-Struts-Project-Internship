package edu.seed.repository;

import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCallback;
import org.springframework.stereotype.Repository;

import edu.seed.dto.LoginBean;
import edu.seed.dto.RegistrationBean;


@Repository
public class LoginDao {

	@Autowired(required=true)
	JdbcTemplate jdbcTemplate;
	
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate)
	{
		this.jdbcTemplate=jdbcTemplate;
	}

	public int Registration(RegistrationBean regbean)
	{
		String sql=("insert into register_f values()");
		return jdbcTemplate.update(sql);
	}
	
	
	/***
	 @author : Abhay singh solanki
	 @return : Obj. of login beanrow(fetch row through row mapper)
     @ since :march 13-2017
	
	*/
	
	public LoginBean login(LoginBean loginBean)
	{
		LoginBean loginBeanRow=null;
		try{
			String sql="select  * from register_f where email='"+loginBean.getEmail()+"' and password='"+loginBean.getPassword()+"'";
		loginBeanRow=(LoginBean)jdbcTemplate.queryForObject(sql,new BeanPropertyRowMapper(LoginBean.class));
		return loginBeanRow;
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return loginBeanRow;
	}
	
	
		
		
	}
	

