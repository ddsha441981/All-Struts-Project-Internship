package org.spring.repositry;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.spring.BeansClass.UserRegisterBeans;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.stereotype.Repository;

@Repository
public class UserLoginDaoImpl {

	@Autowired(required = true)
	JdbcTemplate jdbcTemplate;
	
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	
	public int loginCrentials(UserRegisterBeans userRegisterBeans){
		//UserRegisterBeans userRegisterRowBeans =null;
		System.out.println("In Repositry Class");
		String sql ="select email,autoPassword,userId from user1234 where email=? and autoPassword=?";
		System.out.println(sql);
		return jdbcTemplate.query(sql,new Object[]{userRegisterBeans.getEmail(),userRegisterBeans.getAutoPassword()},new ResultSetExtractor<Integer>() {
			
			@Override
			public Integer extractData(ResultSet rs) throws SQLException, DataAccessException {
				int count = 0;
				
				while(rs.next()){
					
					userRegisterBeans.setEmail(rs.getString(1));
					userRegisterBeans.setAutoPassword(rs.getString(2));
					count = rs.getInt("userId");
				}
				System.out.println("In Dao Class Count Value Is "+count);
				return count;
			}
		});
		
		
	}
}
