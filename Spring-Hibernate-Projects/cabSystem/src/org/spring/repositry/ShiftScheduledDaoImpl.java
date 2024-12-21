package org.spring.repositry;

import java.util.List;

import org.spring.dto.ShiftScheduledBeans;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class ShiftScheduledDaoImpl {

	@Autowired
	JdbcTemplate jdbcTemplate;

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	public int saveShiftDetails(ShiftScheduledBeans shiftScheduledBeans) {
		String sql = "insert into shiftschedule values(default,'" + shiftScheduledBeans.getEmpName() + "','"
				+ shiftScheduledBeans.getDepartmentName() + "','" + shiftScheduledBeans.getTotalEmp() + "','"
				+ shiftScheduledBeans.getShiftName() + "','" + shiftScheduledBeans.getStartingPoint() + "','"
				+ shiftScheduledBeans.getDispatchName() + "','" + shiftScheduledBeans.getShiftdate() + "','"
				+ shiftScheduledBeans.getEmpId() + "','" + shiftScheduledBeans.getRouteId() + "')";
		return jdbcTemplate.update(sql);
	}
	
	public List<ShiftScheduledBeans> infoShiftsDetails(ShiftScheduledBeans shiftScheduledBeans){
		
		String  sql = "select * from shiftschedule";
		List<ShiftScheduledBeans> shiftList = jdbcTemplate.query(sql,new BeanPropertyRowMapper(ShiftScheduledBeans.class));
		
		return shiftList;
	}

}
