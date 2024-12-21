package org.spring.repositry;

import java.util.List;

import org.spring.dto.VendorBeans;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class VendorDaoImpl {

	@Autowired
	JdbcTemplate jdbcTemplate;
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	
	public int saveVendorsDetails(VendorBeans vendorBeans){
		String sql ="insert into vendor values(null,'"+vendorBeans.getName()+"','"+vendorBeans.getAddress()+"','"+vendorBeans.getMobNo()+"','"+vendorBeans.getEmailId()+"','"+vendorBeans.getmId()+"')";
		return jdbcTemplate.update(sql);
	}
	
	public List<VendorBeans> vendorDetailsSelected(VendorBeans vendorBeans){
		String sql = "select * from vendor";
		List<VendorBeans> vendorList = jdbcTemplate.query(sql,new BeanPropertyRowMapper(VendorBeans.class));
		return vendorList;
	}
}
