package edu.seed.repository;

import java.io.IOException;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCallback;
import org.springframework.stereotype.Repository;

import edu.seed.dto.InternProfileBean;
/*
 * 
 */
@Repository
public class InternProfileRepository {

	@Autowired(required = true)

	JdbcTemplate jdbctemplate;

	public void setJdbctemplate(JdbcTemplate jdbctemplate) {
		this.jdbctemplate = jdbctemplate;
	}

	
	public Boolean saveInternProfileByPreparedStatement(final InternProfileBean internprofilebean1, int userid) {
		Boolean Profilebeanrow = null;

		try {
			String query = "insert into internprofile_f values(i_id.NEXTVAL,?,?,?,?,?,?,?,'" + userid + "')";
			return jdbctemplate.execute(query, new PreparedStatementCallback<Boolean>() {

				@Override
				public Boolean doInPreparedStatement(PreparedStatement ps) throws SQLException, DataAccessException {

					ps.setInt(1, internprofilebean1.getI_salary());
					System.out.println("salary is :" + internprofilebean1.getI_salary());
					
					try {

						ps.setBinaryStream(2, internprofilebean1.getI_resume().getInputStream(),
								internprofilebean1.getI_resume().getInputStream().available());

						System.out.println("Resume is" + internprofilebean1.getI_resume());
					} catch (IOException e) {
						
						e.printStackTrace();
					}
					
					ps.setString(3, internprofilebean1.getI_10th());								
					ps.setString(4, internprofilebean1.getI_12th());				
					ps.setString(5, internprofilebean1.getI_degree());					
					ps.setString(6, internprofilebean1.getI_pg());
					ps.setString(7, internprofilebean1.getI_address());

					System.out.println("Inserted Successfully");
					 return ps.execute();
				}

			});
		} catch (Exception e) {
		    e.printStackTrace();
		}
		
		return Profilebeanrow;

	}

}
