package org.spring.repositry;

import java.util.List;

import org.spring.dto.AddVehicleBeans;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class AddVehicleDaoImpl {

	@Autowired
	JdbcTemplate jdbcTemplate;

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	public int saveVehicle(AddVehicleBeans addVehicleBeans) {

		String sql = "insert into vehicle values('" + addVehicleBeans.getVehicleNo() + "','" + addVehicleBeans.getName()
				+ "','" + addVehicleBeans.getPurchaseDate() + "','" + addVehicleBeans.getCapacity() + "','"
				+ addVehicleBeans.getPrice() + "','" + addVehicleBeans.getQuantity() + "','"
				+ addVehicleBeans.getTotalAmt() + "','" + addVehicleBeans.getVendorId() + "','"
				+ addVehicleBeans.getmId() + "')";
		return jdbcTemplate.update(sql);

	}
	
	public List<AddVehicleBeans> selectVehicleDetails(AddVehicleBeans addVehicleBeans){
		
		String sql ="select * from vehicle";
		List<AddVehicleBeans> vehicleList = jdbcTemplate.query(sql,new BeanPropertyRowMapper(AddVehicleBeans.class));
		return vehicleList;
		
	}
}
