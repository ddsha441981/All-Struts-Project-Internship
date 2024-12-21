package org.spring.repositry;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.spring.dto.AddEmployeeBeans;
import org.spring.dto.AdminLoginBeans;
import org.spring.dto.ManagerBeans;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.stereotype.Repository;

@Repository
public class LoginDaoImpl {

	@Autowired
	JdbcTemplate jdbcTemplate;
	
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	
public int adminLogin(AdminLoginBeans adminLoginBeans){
		
	String sql ="select name,emailId,password,adminId from adminlogin where emailId=? and password =?";
		return jdbcTemplate.query(sql,new Object[]{adminLoginBeans.getEmailId(),adminLoginBeans.getPassword()},new ResultSetExtractor<Integer>() {

			@Override
			public Integer extractData(ResultSet rs) throws SQLException, DataAccessException {
				int status = 0;
				while(rs.next()){
					
					adminLoginBeans.setEmailId(rs.getString(1));
					adminLoginBeans.setPassword(rs.getString(2));
					adminLoginBeans.setName(rs.getString(3));
					status = rs.getInt("adminId");
				}
				return status;
			}
		});
	}

public int employeeLogin(AddEmployeeBeans addEmployeeBeans){
	
	String sql ="select name,emailId,password,empId from employee where emailId=? and password =?";
		return jdbcTemplate.query(sql,new Object[]{addEmployeeBeans.getEmailId(),addEmployeeBeans.getPassword()},new ResultSetExtractor<Integer>() {

			@Override
			public Integer extractData(ResultSet rs) throws SQLException, DataAccessException {
				int status = 0;
				while(rs.next()){
					
					addEmployeeBeans.setEmailId(rs.getString(1));
					addEmployeeBeans.setPassword(rs.getString(2));
					addEmployeeBeans.setName(rs.getString(3));
					status = rs.getInt("empId");
				}
				return status;
			}
		});
	}


public int managerLogin(ManagerBeans managerBeans){
	
	String sql ="select name,emailId,password,mId from manager where emailId=? and password =?";
		return jdbcTemplate.query(sql,new Object[]{managerBeans.getEmailId(),managerBeans.getPassword()},new ResultSetExtractor<Integer>() {

			@Override
			public Integer extractData(ResultSet rs) throws SQLException, DataAccessException {
				int status = 0;
				while(rs.next()){
					
					managerBeans.setEmailId(rs.getString(1));
					managerBeans.setPassword(rs.getString(2));
					managerBeans.setName(rs.getString(3));
					status = rs.getInt("mId");
				}
				return status;
			}
		});
	}
}
