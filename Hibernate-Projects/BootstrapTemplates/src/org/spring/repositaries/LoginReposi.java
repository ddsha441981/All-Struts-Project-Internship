package org.spring.repositaries;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.spring.Bean.LoginBeans;
import org.spring.UtilityClasses.SqlQueries;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.stereotype.Repository;

@Repository
public class LoginReposi {

	@Autowired(required = true)
	JdbcTemplate jdbcTemplate;

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	
	
	public int vaildLoginUser(LoginBeans logins){
		
		System.out.println("In Dao class");
		
		
		return jdbcTemplate.query(SqlQueries.vaildlogin,new Object[]{logins.getUsername(),logins.getPassword(),logins.getRoleName()},new ResultSetExtractor<Integer>() {

			@Override
			public Integer extractData(ResultSet rs) throws SQLException, DataAccessException {
				int count = 0;
				
				while(rs.next()){
					
					
					logins.setUsername(rs.getString(1));
					logins.setPassword(rs.getString(2));
					logins.setRoleName(rs.getString(3));
				    count = rs.getInt("userId");
				}
				return count;
			}
		}); 
	}
			
}
