package org.spring.Controller;

import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCallback;
import org.springframework.stereotype.Repository;

@Repository
public class UserDao {

	@Autowired
	JdbcTemplate jdbcTemplate;
	
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	
	public boolean adddata(Getter getter){
		String sql = "insert into admin123 values(?,?)";
		return jdbcTemplate.execute(sql, new PreparedStatementCallback<Boolean>() {

			@Override
			public Boolean doInPreparedStatement(PreparedStatement pstmt) throws SQLException, DataAccessException {
				
				pstmt.setString(1, getter.getName());
				pstmt.setString(2, getter.getPassword());
				System.out.println("Data Insert SuccessFully");
				return pstmt.execute();
			}
		});
		
	}
}
