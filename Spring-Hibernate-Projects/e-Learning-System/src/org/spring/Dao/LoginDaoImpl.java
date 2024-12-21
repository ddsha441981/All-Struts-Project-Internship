package org.spring.Dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.spring.Beans.AdminBeans;
import org.spring.Beans.StudentBeans;
import org.spring.Beans.TrainerBeans;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.stereotype.Repository;

/***
 * @author : Deendayal
 * 
 * @param : LoginDaoImpl to set object of Login  Repository class
 * 
 * @return : String name of the Jsp page (Login Using Role)
 * 
 * @ since :June 30-2017
 */
@Repository
public class LoginDaoImpl implements LoginDao {

	private @Autowired(required =true)
	
	JdbcTemplate jdbcTemplate;
	
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	
	/**
	 * Check email Id and password match or not
	 * If existing in database then Login
	 * AdminselectRecords() method
	 * @return jsp page
	 * @since  :June 30-2017
	 */
	@Override
	public int AdminselectRecords(final AdminBeans adminBeans) {
		System.out.println("In Dao Impl");
		String sql ="select emailId,password,adminName,adminId from superadmin where emailId=? and password =?";
		System.out.println(sql);
		return jdbcTemplate.query(sql,new Object[]{adminBeans.getEmailId(),adminBeans.getPassword()},new ResultSetExtractor<Integer>() {

			@Override
			public Integer extractData(ResultSet rs) throws SQLException, DataAccessException {
				
				int count = 0;
				System.out.println("Before rs.next");
				while(rs.next()){
					
					adminBeans.setEmailId(rs.getString(1));
					adminBeans.setPassword(rs.getString(2));
					count = rs.getInt("adminId");
				}
				System.out.println("In Dao Imp"+count);
				return count;
			}
		});
		
	}
	
	/**
	 * Check email Id and password match or not
	 * If existing in database then Login
	 * TrainerselectRecords() method
	 * @return jsp page
	 * @since  :June 30-2017
	 */
	@Override
	public int TrainerselectRecords(final TrainerBeans trainerBeans) {
		
		String sql ="select emailId,password,trainerId from trainer where emailId=? and password=?";
		return jdbcTemplate.query(sql,new Object[]{trainerBeans.getEmailId(),trainerBeans.getPassword()},new ResultSetExtractor<Integer>() {

			@Override
			public Integer extractData(ResultSet rs) throws SQLException, DataAccessException {
				int count = 0;
				while(rs.next()){
					
					trainerBeans.setEmailId(rs.getString(1));
					trainerBeans.setPassword(rs.getString(2));
					count =rs.getInt("trainerId");
				}
				
				return count;
			}
		});
		
	}

	/**
	 * Check email Id and password match or not
	 * If existing in database then Login
	 * StudentselectRecords() method
	 * @return jsp page
	 * @since  :June 30-2017
	 */
	@Override
	public int StudentselectRecords(final StudentBeans studentBeans) {
		
		String sql ="select emailId,password,userName,stdId from student where emailId=? and password=?";
		
		return jdbcTemplate.query(sql,new Object[]{studentBeans.getEmailId(),studentBeans.getPassword()},new ResultSetExtractor<Integer>() {

			@Override
			public Integer extractData(ResultSet rs) throws SQLException, DataAccessException {
				
				int count = 0;
				while(rs.next()){
					studentBeans.setEmailId(rs.getString(1));
					studentBeans.setPassword(rs.getString(2));
					studentBeans.setUserName(rs.getString(3));
					count = rs.getInt("stdId");
				}
				return count;
			}
		});
	}

}
