package com.org.beanfactory.database.jdbctamplate.example;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCallback;

/**@author Deendayal*/
public class DAOemploye {

	JdbcTemplate jdbcTemplate;
	
	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}
	
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	public int createtable(){
		String sql = "create table emp111(eId number(9),eName varchar(50),salary varchar(9))";
		int count = jdbcTemplate.update(sql);
		System.out.println("Table created successfully"+count);
		return count;
	}
	
	public Boolean saveemployeedata(Employee e){
		String sql = "insert into emp111 values(?,?,?)";
		return jdbcTemplate.execute(sql, new PreparedStatementCallback<Boolean>() {

			@Override
			public Boolean doInPreparedStatement(PreparedStatement pstmt) throws SQLException, DataAccessException {
				pstmt.setInt(1, e.geteId());
				pstmt.setString(2, e.geteName());
				pstmt.setString(3, e.getSalary());
				Boolean count = pstmt.execute();
				System.out.println(count +  "  --------Record inserted Successfully-----------");
				return count;
			}
		});
		
	}
	
	/*public Employee searchdata(int eId){
		String sql = "select * from emp111 where eId=111";
		Employee employee = (Employee)getJdbcTemplate().queryForObject(sql, new BeanPropertyRowMapper(Employee.class));
		return employee;
	}*/
	
	public List<Employee> findAll(){

		String sql = "select * from emp111";

		List<Employee> employee  = getJdbcTemplate().query(sql,new BeanPropertyRowMapper<Employee>(Employee.class));

		return employee;
	}

}
