package org.spring.repositry;

import org.spring.BeansClass.TestBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class TestDao {

	@Autowired(required = true)
	JdbcTemplate jdbcTemplate;
	
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	
	public int saveLoginData(TestBean testBean){
		int status =0;
		System.out.println("In Repositry class");
		String sql  ="insert into otpTestPurpose values(seqTest1.nextVal,'"+testBean.getName()+"','"+testBean.getPassword()+"','"+testBean.getLoginOtp()+"') ";
		System.out.println("My Query Is "+sql);
		status = jdbcTemplate.update(sql);
		System.out.println("Now Your Row is "+status);
		return status;
	}
	
	public TestBean selectDataUsingOTP(TestBean testBean){
		TestBean IsOTPExists = null;
		System.out.println("In Repositry class");
		String sql  ="select loginOtp,name from otpTestPurpose where loginOtp='"+testBean.getLoginOtp()+"' ";
		System.out.println("My Query Is "+sql);
		
		
		 IsOTPExists = (TestBean) jdbcTemplate.queryForObject(sql, new BeanPropertyRowMapper(TestBean.class));
		 System.out.println("Now Your Row is "+IsOTPExists);
		 return IsOTPExists;
	}
}
