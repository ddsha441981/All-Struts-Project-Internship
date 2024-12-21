package org.spring.repositry;

import java.util.List;

import org.spring.dto.VehicleAllocatedBeans;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class VehicleAllocationDaoImpl {

	@Autowired
	JdbcTemplate jdbcTemplate;

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	public int saveVehicleAllocationData(VehicleAllocatedBeans vehicleAllocatedBeans) {

		String sql = "insert into vehicleallocation values(default,'" + vehicleAllocatedBeans.getVehicleNo() + "','"
				+ vehicleAllocatedBeans.getEmpId() + "','" + vehicleAllocatedBeans.getDriverId() + "','"
				+ vehicleAllocatedBeans.getRouteId() + "','" + vehicleAllocatedBeans.getPickPoint() + "','"
				+ vehicleAllocatedBeans.getDropPoint() + "','" + vehicleAllocatedBeans.getAllocatedDate() + "','"
				+ vehicleAllocatedBeans.getAllocatedTime() + "')";
		return jdbcTemplate.update(sql);
	}
	
	public List<VehicleAllocatedBeans> viewsAllocatedDetails(VehicleAllocatedBeans vehicleAllocatedBeans){
		
		String sql = "select * from vehicleallocation";
		 List<VehicleAllocatedBeans> vehicleAllocationList =  jdbcTemplate.query(sql,new BeanPropertyRowMapper(VehicleAllocatedBeans.class));
		 return vehicleAllocationList;
	}
}
