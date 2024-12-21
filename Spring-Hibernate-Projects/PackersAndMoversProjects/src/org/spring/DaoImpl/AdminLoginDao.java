package org.spring.DaoImpl;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.spring.dto.AdminBeans;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.stereotype.Repository;

@Repository
public class AdminLoginDao {
	
	@Autowired(required = true)
	JdbcTemplate jdbcTemplate;
	
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	
	public int adminLoginCredientials(AdminBeans adminBeans){
		
		System.out.println("in admin login repositry class");
		String sql ="select emailId,autoPassword,adminId from  admin12 where emailId=? and autoPassword=? ";
		return jdbcTemplate.query(sql, new Object[]{adminBeans.getEmailId(),adminBeans.getAutoPassword()},new ResultSetExtractor<Integer>() {

			@Override
			public Integer extractData(ResultSet rs) throws SQLException, DataAccessException {
				int status = 0;
				while(rs.next()){
				adminBeans.setEmailId(rs.getString(1));
				adminBeans.setAutoPassword(rs.getString(2));
				status = rs.getInt("adminId");
				}
				System.out.println("Here Admin Id is"+status);
				return status;
			}
		});
		
	}

}
