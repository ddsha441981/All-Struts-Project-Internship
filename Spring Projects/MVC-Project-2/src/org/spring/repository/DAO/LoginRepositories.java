package org.spring.repository.DAO;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import org.spring.bean.Beansdata;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCallback;
import org.springframework.stereotype.Repository;

/** @author Deendayal */
@Repository
public class LoginRepositories {
@Autowired
	JdbcTemplate jdbcTemplate;

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	public int createtable(){
		String sql = "create table logsimple(name varchar(50),pwd varchar(50))";
		int count = jdbcTemplate.update(sql);
		System.out.println("Table created Successfully  " + count);
		return count;
	}
	
	public Boolean save(Beansdata bens) {
		System.out.println("In DAO class");
		
		String sql ="insert into logsimple values(?,?)";
		return jdbcTemplate.execute(sql, new PreparedStatementCallback<Boolean>() {

			@Override
			public Boolean doInPreparedStatement(PreparedStatement pstmt) throws SQLException, DataAccessException {
				pstmt.setString(1, bens.getName());
				pstmt.setString(2, bens.getPwd());
				System.out.println("Data insert successfully Inserted");
				return pstmt.execute();
			}
		});
	}

	public List retriveall(){
		String sql ="select * from logsimple";
		List jj = jdbcTemplate.queryForList(sql);
		return jj;
	}
}
