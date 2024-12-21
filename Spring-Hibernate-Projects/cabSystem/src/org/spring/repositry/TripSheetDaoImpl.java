package org.spring.repositry;

import java.util.List;

import org.spring.dto.TripSheetBeans;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class TripSheetDaoImpl {

	@Autowired
	JdbcTemplate jdbcTemplate;

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	public int saveTripSheet(TripSheetBeans tripSheetBeans) {

		String sql = "insert into tripsheet values(default,'" + tripSheetBeans.getVehicleNo() + "','"
				+ tripSheetBeans.getAllocateId() + "','" + tripSheetBeans.getRateKm() + "','"
				+ tripSheetBeans.getTotalKm() + "','" + tripSheetBeans.getTotalAmt() + "')";
		return jdbcTemplate.update(sql);

	}

	public List<TripSheetBeans> listOfTrip(TripSheetBeans tripSheetBeans){
		
		String sql ="select * from tripsheet";
		List<TripSheetBeans> tripsList = jdbcTemplate.query(sql,new BeanPropertyRowMapper(TripSheetBeans.class));
		return tripsList;
	}
}
