package org.spring.agent.repositries;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.spring.admin.beanclasses.RegisterAgent;
import org.spring.agent.beanofAgent.HealthInsurnceBeans;
import org.spring.utilitytablesquery.Queriesfile;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCallback;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

/**
* @author Deendayal
* @since
* @version 1.1.2
*/

/** This class is Repository class
*  some methods delcared
*  Class HealthDao
*/
@Repository
public class HealthDao {

	@Autowired(required = true)
	JdbcTemplate jdbcTemplate;
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	
	/**
	 * RegisterAgent Class name of Agent
	 * retriveAgentsDetails() method 
	 * Use BeanPropertyRowMapper to fetch Agent Details Using By Id
	 * Queriesfile is a class
	 * particularAgentSelected vrriable of query*/
	public RegisterAgent retriveAgentsDetails(Integer agentId){
		
		return jdbcTemplate.queryForObject(Queriesfile.particularAgentSelected,new Object[]{agentId},new BeanPropertyRowMapper<RegisterAgent>(RegisterAgent.class));
		
	}
	
	/**
	 * HealthInsurnceBeans Class name of Agent
	 * heathcreatingTables() method 
	 * Use this method to creating new table in database
	 * Queriesfile is a class
	 * talesofHealths vrriable of query*/
	public void heathcreatingTables(){
		 jdbcTemplate.execute(Queriesfile.talesofHealths);
		System.out.println("Table Created Successfully");
	}
	
	/**
	 * HealthInsurnceBeans Class name of Agent
	 * saveMyHealthInfo() method 
	 * Use this method to save Contents in database
	 * Queriesfile is a class
	 * saveHealthdata vrriable of query*/
	public Boolean saveMyHealthInfo(HealthInsurnceBeans healthInsurance){
		
		return jdbcTemplate.execute(Queriesfile.saveHealthdata,new PreparedStatementCallback<Boolean>() {

			@Override
			public Boolean doInPreparedStatement(PreparedStatement pstmt) throws SQLException, DataAccessException {
				pstmt.setString(1, healthInsurance.getHealthfromdate());
				pstmt.setString(2, healthInsurance.getHealthtodate());
				pstmt.setString(3, healthInsurance.getHealthopt1());
				pstmt.setString(4, healthInsurance.getHealthopt2());
				pstmt.setString(5, healthInsurance.getHealthopt3());
				pstmt.setString(6, healthInsurance.getHealthidv());
				pstmt.setString(7, healthInsurance.getHealththirdparty());
				pstmt.setString(8, healthInsurance.getHealthservicetax());
				pstmt.setString(9, healthInsurance.getPaymethod());
				pstmt.setInt(10, healthInsurance.getAgentId());
				pstmt.setInt(11, healthInsurance.getClientId());
				
				return pstmt.execute();
			}
		});	
	}
	

	/**
	 * HealthInsurnceBeans Class name of Agent
	 * retriveContentsofHealthByagents() method 
	 * Use this method to Retrive Contents from database
	 * Queriesfile is a class
	 * seletedHealthData vrriable of query*/
	public List<HealthInsurnceBeans> retriveContentsofHealthByagents(Integer agentId){
		return jdbcTemplate.query(Queriesfile.seletedHealthData,new Object[]{agentId},new RowMapper<HealthInsurnceBeans>() {

			@Override
			public HealthInsurnceBeans mapRow(ResultSet rs, int arg1) throws SQLException {
				HealthInsurnceBeans W1 = new HealthInsurnceBeans();
				W1.setHealthId(rs.getInt(1));
				W1.setHealthfromdate(rs.getString(2));
				W1.setHealthtodate(rs.getString(3));
				W1.setHealthopt1(rs.getString(4));
				W1.setHealthopt2(rs.getString(5));
				W1.setHealthopt3(rs.getString(6));
				W1.setHealthidv(rs.getString(7));
				W1.setHealththirdparty(rs.getString(8));
				W1.setHealthservicetax(rs.getString(9));
				W1.setPaymethod(rs.getString(10));
				W1.setAgentId(rs.getInt(11));
				W1.setClientId(rs.getInt(12));
				return W1;
			}
		} );
	}
}
