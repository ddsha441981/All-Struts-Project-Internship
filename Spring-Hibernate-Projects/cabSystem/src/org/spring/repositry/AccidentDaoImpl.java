package org.spring.repositry;

import java.util.List;

import org.spring.dto.AccidentDetailsBeans;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class AccidentDaoImpl {

	@Autowired
	JdbcTemplate jdbcTemplate;

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	public int saveAccidentData(AccidentDetailsBeans accidentDetailsBeans) {

		System.out.println("In Repositry Class");
		String sql = "insert into accident values(default,'" + accidentDetailsBeans.getDriverId() + "','"
				+ accidentDetailsBeans.getVehicleNo() + "','" + accidentDetailsBeans.getInsuranceDId() + "','"
				+ accidentDetailsBeans.getInsuredDriver() + "','" + accidentDetailsBeans.getVehicleInsuranceId() + "','"
				+ accidentDetailsBeans.getInsuredVehicle() + "','" + accidentDetailsBeans.getAccidentDate() + "','"
				+ accidentDetailsBeans.getPlace() + "','" + accidentDetailsBeans.getPrice() + "','"
				+ accidentDetailsBeans.getReason() + "','none')";

		System.out.println(sql);
		return jdbcTemplate.update(sql);
	}
	
	public List <AccidentDetailsBeans> selectAccidentData(AccidentDetailsBeans accidentDetailsBeans){
		
		String sql ="select * from accident";
		List <AccidentDetailsBeans> accidentList = jdbcTemplate.query(sql,new BeanPropertyRowMapper(AccidentDetailsBeans.class));
		return accidentList;
	}
	
	public List <AccidentDetailsBeans> usingByIdDataSelected(Integer accidentId){
		
		String sql ="select * from accident where accidentId =?";
		List <AccidentDetailsBeans> usingById = jdbcTemplate.query(sql,new Object[]{accidentId},new BeanPropertyRowMapper(AccidentDetailsBeans.class));
		return usingById;
	}
	
	public int dataUpdate(AccidentDetailsBeans accidentDetailsBeans) {

		System.out.println("In Repositry Class");
		String sql ="update accident set query='"+accidentDetailsBeans.getQuery()+"' where accidentId='"+accidentDetailsBeans.getAccidentId()+"'";

		System.out.println(sql);
		return jdbcTemplate.update(sql);
	}
}
