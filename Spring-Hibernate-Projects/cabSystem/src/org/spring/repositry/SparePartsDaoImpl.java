package org.spring.repositry;

import java.util.List;

import org.spring.dto.SparePartsBeans;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class SparePartsDaoImpl {
	
	@Autowired
	JdbcTemplate jdbcTemplate;
	
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	
	public int addSpareParts(SparePartsBeans sparePartsBeans){
		String sql ="insert into spareparts values(default,'"+sparePartsBeans.getSparetype()+"','"+sparePartsBeans.getQuantity()+"','"+sparePartsBeans.getName()+"','"+sparePartsBeans.getDate()+"','"+sparePartsBeans.getVehicleNo()+"')";
		System.out.println(sql);
		return jdbcTemplate.update(sql);
	}

	
	public List<SparePartsBeans> selectedSparesRecords(SparePartsBeans sparePartsBeans){
		String sql ="select * from spareparts";
		List<SparePartsBeans> spareList = jdbcTemplate.query(sql,new BeanPropertyRowMapper(SparePartsBeans.class));
		return spareList;
	}
}
