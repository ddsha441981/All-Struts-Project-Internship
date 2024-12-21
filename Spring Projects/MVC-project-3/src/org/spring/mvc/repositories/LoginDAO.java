package org.spring.mvc.repositories;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.spring.mvc.beanclasses.Register;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCallback;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

@Repository
public class LoginDAO {

	@Autowired
	JdbcTemplate jdbcTemplate;

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	public int cratetable() {
		String sql = "create table registerstudent(name varchar(50),username varchar(50),email varchar(50),password varchar(50),cfpassword varchar(50))";
		int count = jdbcTemplate.update(sql);
		System.out.println("-------Table created Successfully------- " + count);
		return count;
	}

	public Boolean save(Register regi) {
		System.out.println("I am in Dao Class");

		String sql = "insert into registerstudent values(?,?,?,?,?)";

		return jdbcTemplate.execute(sql, new PreparedStatementCallback<Boolean>() {

			@Override
			public Boolean doInPreparedStatement(PreparedStatement pstmt) throws SQLException, DataAccessException {
				pstmt.setString(1, regi.getName());
				pstmt.setString(2, regi.getUsername());
				pstmt.setString(3, regi.getEmail());
				pstmt.setString(4, regi.getPassword());
				pstmt.setString(5, regi.getCfpassword());
				System.out.println("Data Inserted Successfully");
				return pstmt.execute();
			}
		});
	}
	
	public List<Register>  getallrecords(){
		System.out.println("I am in DAO getallRecods Methods");
		String sql ="select * from registerstudent";
		return jdbcTemplate.query(sql, new RowMapper<Register>() {

			@Override
			public Register mapRow(ResultSet rs, int rownum) throws SQLException {
				Register re = new Register();
				re.setName(rs.getString(1));
				re.setUsername(rs.getString(2));
				re.setEmail(rs.getString(3));
				re.setPassword(rs.getString(4));
				re.setCfpassword(rs.getString(5));
				
				return re;
			}
		});
		
	}

	public Boolean change(Register regi) {
		String sql = "select password from registerstudent where password=?";
		//regi.setPassword("password");
		int count = jdbcTemplate.update(sql);
		
		if (regi.getPassword().equalsIgnoreCase("password")) {
			String query = "update registerstudent set password=?,cfpassword=?";
			return jdbcTemplate.execute(query, new PreparedStatementCallback<Boolean>() {

				@Override
				public Boolean doInPreparedStatement(PreparedStatement pstmt) throws SQLException, DataAccessException {

					pstmt.setString(1, regi.getPassword());
					pstmt.setString(2, regi.getCfpassword());
					return pstmt.execute();
				}
			});
		} else {
			System.out.println(".........No match.......");
			return false;
		}

	}

}
