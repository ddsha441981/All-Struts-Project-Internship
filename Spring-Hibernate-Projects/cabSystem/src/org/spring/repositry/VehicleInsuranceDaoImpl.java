package org.spring.repositry;

import java.util.List;

import org.spring.dto.VehicleInsuranceBeans;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class VehicleInsuranceDaoImpl {

	@Autowired
	JdbcTemplate jdbcTemplate;

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	public int savevehicleInsurance(VehicleInsuranceBeans vehicleInsuranceBeans) {

		String sql = "insert into vehicleinsurance values(default,'" + vehicleInsuranceBeans.getVehicleNo() + "','"
				+ vehicleInsuranceBeans.getName() + "','" + vehicleInsuranceBeans.getModel() + "','"
				+ vehicleInsuranceBeans.getChassisNo() + "','" + vehicleInsuranceBeans.getPurchaseDate() + "','"
				+ vehicleInsuranceBeans.getEngineNo() + "','" + vehicleInsuranceBeans.getServiceTax() + "','"
				+ vehicleInsuranceBeans.getFrom() + "','" + vehicleInsuranceBeans.getTo() + "','"
				+ vehicleInsuranceBeans.getYearType() + "','" + vehicleInsuranceBeans.getPayType() + "')";

		return jdbcTemplate.update(sql);
	}
	
	public List<VehicleInsuranceBeans> vehiclesDataOfInsurances(VehicleInsuranceBeans vehicleInsuranceBeans){
		String sql ="select * from vehicleinsurance";
		List<VehicleInsuranceBeans> vehicleInsuranceList = jdbcTemplate.query(sql,new BeanPropertyRowMapper(VehicleInsuranceBeans.class));
		return vehicleInsuranceList;
	}
}
