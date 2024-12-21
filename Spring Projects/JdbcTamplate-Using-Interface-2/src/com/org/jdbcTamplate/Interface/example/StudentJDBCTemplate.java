package com.org.jdbcTamplate.Interface.example;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;

public class StudentJDBCTemplate implements StudentDAO {
	private JdbcTemplate jdbcTemplate;
	

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	@Override
	public void create(int id ,String name, int age) {
		System.out.println("Hello");
		String query="insert into mystudent(id,name,age) values(?,?,?)";
		int status = jdbcTemplate.update(query,id,name,age);
		System.out.println("Record Inserted Successfully" +status);
		return;
	}

	/*@Override
	public Student getuser(int id) {
		
		String sql = "select * from mystudent where id=?";
		Student stud = jdbcTemplate.queryForObject(sql, 
                new Object[]{id}, new StudentMapper());
				return stud;
	}

	*/
	@Override
	public List<Student> listStudents() {
		String SQL = "select * from mystudent";
	      List <Student> students = jdbcTemplate.query(SQL,new StudentMapper());
	      return students;
		
	}
	
	

}
