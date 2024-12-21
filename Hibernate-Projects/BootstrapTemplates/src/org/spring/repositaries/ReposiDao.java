package org.spring.repositaries;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;


import org.spring.Bean.BeanClass;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

@Repository
public class ReposiDao {

	@Autowired(required = true)
	JdbcTemplate jdbcTemplate;
	
	public List<BeanClass>getContents(){
		
		System.out.println("In Dao Class");
		String sql ="select * from employees";
		return jdbcTemplate.query(sql,new  RowMapper<BeanClass>() {

			@Override
			public BeanClass mapRow(ResultSet rs, int arg1) throws SQLException {

				BeanClass bean = new BeanClass();
				bean.setEmployee_id(rs.getInt(1));
				bean.setFirst_name(rs.getString(2));
				bean.setLast_name(rs.getString(2));
				bean.setEmail(rs.getString(4));
				//System.out.println(bean.toString());
				return bean;
			}
		});
		
	}
}
