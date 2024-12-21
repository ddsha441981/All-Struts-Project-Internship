package org.spring.repositry;

import java.util.List;

import org.spring.dto.AddDriverBeans;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class DriverDaoImpl {
	
	@Autowired
	JdbcTemplate jdbcTemplate;
	
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	
	public int saveDriversContents(AddDriverBeans addDriverBeans){
		String sql ="insert into driver values(null,'"+addDriverBeans.getName()+"','"+addDriverBeans.getAddress()+"','"+addDriverBeans.getMobNo()+"','"+addDriverBeans.getDob()+"','"+addDriverBeans.getDoj()+"','"+addDriverBeans.getLicenceNo()+"','"+addDriverBeans.getExryDate()+"','"+addDriverBeans.getExperience()+"','"+addDriverBeans.getEmailId()+"','"+addDriverBeans.getEmployeeType()+"','"+addDriverBeans.getmId()+"')";
		return jdbcTemplate.update(sql);
	}

	
	public List<AddDriverBeans> selectDriverDetails(AddDriverBeans addDriverBeans){
		String sql ="select * from driver";
		List<AddDriverBeans> driverList = jdbcTemplate.query(sql,new BeanPropertyRowMapper(AddDriverBeans.class));
		return driverList;
	}
	
	public List<AddDriverBeans> selectedIdForDriver(AddDriverBeans addDriverBeans){
		String sql ="select driverId,name from driver";
		 List<AddDriverBeans> driverlist = jdbcTemplate.query(sql, new BeanPropertyRowMapper(AddDriverBeans.class));
		 
		 return driverlist;
	}
}
