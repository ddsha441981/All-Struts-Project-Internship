package org.spring.repositry;

import java.util.List;

import org.spring.dto.OilExpensesBeans;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class OilExpensesDaoImpl {

	@Autowired
	JdbcTemplate jdbcTemplate;

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	public int saveOil(OilExpensesBeans oilExpensesBeans) {

		String sql = "insert into oilexpenses values(default,'" + oilExpensesBeans.getDriverId() + "','"
				+ oilExpensesBeans.getVehicleNo() + "','" + oilExpensesBeans.getTotalKM() + "','"
				+ oilExpensesBeans.getOilLtr() + "','" + oilExpensesBeans.getPrice() + "','"
				+ oilExpensesBeans.getTotalPrice() + "','" + oilExpensesBeans.getOilFillDate() + "')";
		return jdbcTemplate.update(sql);
	}
	
	public List<OilExpensesBeans> viewsOILS(OilExpensesBeans oilExpensesBeans){
		
		String sql ="select * from oilexpenses";
		List<OilExpensesBeans> oilList = jdbcTemplate.query(sql,new BeanPropertyRowMapper(OilExpensesBeans.class));
		 return oilList;
	}

}
