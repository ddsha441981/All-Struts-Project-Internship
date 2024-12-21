package org.spring.repositry;

import java.sql.SQLException;
import java.util.List;

import org.spring.dto.AddEmployeeBeans;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class AddEmployeeDaoImpl {

	@Autowired
	JdbcTemplate jdbcTemplate;

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	public int addEmployees(AddEmployeeBeans addEmployeeBeans)throws SQLException {
		//int status = 0;
		System.out.println("In");
		String sql = "insert into employee values(null,'" + addEmployeeBeans.getName() + "','"+ addEmployeeBeans.getGender() + "','" + addEmployeeBeans.getDob() + "','" + addEmployeeBeans.getMobNo()+ "','" + addEmployeeBeans.getEmailId() + "','" + addEmployeeBeans.getAddress() + "','"+ addEmployeeBeans.getDoj() + "','" + addEmployeeBeans.getDesignation() +"','" + addEmployeeBeans.getPassword() + "','"+ addEmployeeBeans.getDptname() + "','" + addEmployeeBeans.getmId()+"')";
		System.out.println(sql);
		return jdbcTemplate.update(sql);
	}
	
	public List<AddEmployeeBeans> viewsEmployees(AddEmployeeBeans addEmployeeBeans) throws SQLException{
		String sql ="select * from employee";
		List<AddEmployeeBeans> list = jdbcTemplate.query(sql,new BeanPropertyRowMapper(AddEmployeeBeans.class));
		return list;
	}


}
