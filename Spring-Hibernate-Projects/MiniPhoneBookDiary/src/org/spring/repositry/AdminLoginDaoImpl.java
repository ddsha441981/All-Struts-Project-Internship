package org.spring.repositry;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.spring.BeansClass.LoginBeans;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.stereotype.Repository;

@Repository
public class AdminLoginDaoImpl {
	
	@Autowired(required = true)
	JdbcTemplate jdbcTemplate;
	
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	
public int adminLoginRedirect(LoginBeans loginBeans){
		
	System.out.println("In Admin Repositry");
	String sql ="select email,autoPassword,adminId from admin1234 where email=? and autoPassword=? ";
		return jdbcTemplate.query(sql,new Object[]{loginBeans.getEmail(),loginBeans.getAutoPassword()},new ResultSetExtractor<Integer>() {

			@Override
			public Integer extractData(ResultSet rs) throws SQLException, DataAccessException {
				
				int status =0;
				while(rs.next()){
					loginBeans.setEmail(rs.getString(1));
					loginBeans.setAutoPassword(rs.getString(2));
					status = rs.getInt("adminId");
				}
				System.out.println("Admin Login SuccessFully Login"+status);
				return status;
			}
		});
	}


}
