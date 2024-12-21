package com.org.jdbc.example;

/**@author Deendayal*/
import org.springframework.jdbc.core.JdbcTemplate;

public class DAOemployee {

	private JdbcTemplate jdbcTemplate;

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	public int saveEmployee(Employee e) {
		String query = "insert into employeetable values('" + e.geteId() + "','" + e.geteName() + "','" + e.getSalary()
				+ "')";
		return jdbcTemplate.update(query);
	}

	public int updateEmployee(Employee e) {
		String query="update employeetable set eName='"+e.geteName()+"',salary='"+e.getSalary()+"' where eId='"+e.geteId()+"' ";
		return jdbcTemplate.update(query);
	}
}
