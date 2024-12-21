package org.spring.repositry;

import java.util.List;

import org.spring.dto.AddRouteBeans;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class AddNewRouteDaoImpl {

	
	@Autowired
	JdbcTemplate jdbcTemplate;
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	
	public int saveRouteData(AddRouteBeans addRouteBeans){
		
		String sql ="insert into route values(null,'"+addRouteBeans.getSource()+"','"+addRouteBeans.getDestination()+"','"+addRouteBeans.getDescription()+"','"+addRouteBeans.getmId()+"','"+addRouteBeans.getDriverId()+"','"+addRouteBeans.getMobNo()+"')";
		return jdbcTemplate.update(sql);
	}
	
	public List <AddRouteBeans> infoViewsRoutes(AddRouteBeans addRouteBeans){
		String sql ="select * from route";
		List <AddRouteBeans> routeList = jdbcTemplate.query(sql,new BeanPropertyRowMapper(AddRouteBeans.class));
		return routeList;
	}
}
