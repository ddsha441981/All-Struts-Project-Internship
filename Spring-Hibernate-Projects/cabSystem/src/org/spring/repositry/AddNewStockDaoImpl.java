package org.spring.repositry;

import java.util.List;

import org.spring.dto.AddNewStockBeans;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class AddNewStockDaoImpl {

	@Autowired
	JdbcTemplate jdbcTemplate;

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	public int saveStocks(AddNewStockBeans addNewStockBeans) {

		String sql = "insert into stock values(default,'" + addNewStockBeans.getDealername() + "','"
				+ addNewStockBeans.getStockType() + "','" + addNewStockBeans.getSparePartsName() + "','"
				+ addNewStockBeans.getPurchaseDate() + "','" + addNewStockBeans.getQuantity() + "','"
				+ addNewStockBeans.getPrice() + "','" + addNewStockBeans.getTotalAmt() + "','"
				+ addNewStockBeans.getmId() + "')";
		return jdbcTemplate.update(sql);
	}
	
	
	public List<AddNewStockBeans> viewStockFetch(AddNewStockBeans addNewStockBeans){
		
		String sql ="select * from stock";
		List<AddNewStockBeans> stockList =jdbcTemplate.query(sql,new BeanPropertyRowMapper(AddNewStockBeans.class));
		return stockList;
	}
}
