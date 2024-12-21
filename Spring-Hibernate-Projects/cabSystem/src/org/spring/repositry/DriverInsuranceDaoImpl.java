package org.spring.repositry;

import java.util.List;

import org.spring.dto.DriverInsuranceBeans;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class DriverInsuranceDaoImpl {

	@Autowired
	JdbcTemplate jdbcTemplate;

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	public int saveDriverInsuranceContents(DriverInsuranceBeans driverInsuranceBeans){
		
		String sql ="insert into driverinsurance values(default,'"+driverInsuranceBeans.getDriverId()+"','"+driverInsuranceBeans.getName()+"','"+driverInsuranceBeans.getNomineeName()+"','"+driverInsuranceBeans.getRelation()+"','"+driverInsuranceBeans.getAddress()+"','"+driverInsuranceBeans.getPincode()+"','"+driverInsuranceBeans.getGender()+"','"+driverInsuranceBeans.getMobNo()+"','"+driverInsuranceBeans.getEmailId()+"','"+driverInsuranceBeans.getDob()+"','"+driverInsuranceBeans.getAge()+"','"+driverInsuranceBeans.getFrom()+"','"+driverInsuranceBeans.getTo()+"','"+driverInsuranceBeans.getYearType()+"','"+driverInsuranceBeans.getPayType()+"','"+driverInsuranceBeans.getInserest()+"')";
		
		return jdbcTemplate.update(sql);
	}

public List<DriverInsuranceBeans> driverInsuaranceSelectedData(DriverInsuranceBeans driverInsuranceBeans){	 
		
	String sql ="select * from driverinsurance";
	List<DriverInsuranceBeans> driverInsuranceList = jdbcTemplate.query(sql,new BeanPropertyRowMapper(DriverInsuranceBeans.class));
	
		return driverInsuranceList;
	}

}
