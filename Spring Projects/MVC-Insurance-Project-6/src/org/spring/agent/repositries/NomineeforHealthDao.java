package org.spring.agent.repositries;
/**
 * @author Deendayal
 * @since 2017
 * @version 1.1.2
 */

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.RowMapper;
import org.spring.admin.beanclasses.AddnewPolicy;
import org.spring.agent.beanofAgent.HealthNomineeBeans;
import org.spring.utilitytablesquery.Queriesfile;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCallback;
import org.springframework.stereotype.Repository;

/** This class is NomineeforHealthDao class
 *  some methods delcared
 *  Used Logger
 */
@Repository
public class NomineeforHealthDao {

	@Autowired
	JdbcTemplate jdbcTemplate;
	
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	
	/**
	 *  registeragent table Name of Database
	 *  listofAgentUsingEquiry() method is used to Retrive data from database
	 *  (Queriesfile.myAgentsselectedforEnquiry) used to retrive data
	 *  Queriesfile is class and myAgentsselectedforEnquiry is varriable name
	 *  This method return type is List
	 *  U1 is Object 
	 */
	public List<AddnewPolicy> fetchpolicyForAddingNominees(){
		return jdbcTemplate.query(Queriesfile.nomineeHealthFetchPolicy,new RowMapper<AddnewPolicy>() {

			@Override
			public AddnewPolicy mapRow(ResultSet rs, int arg1) throws SQLException {
				AddnewPolicy U1 = new AddnewPolicy();
				U1.setPolicyId(rs.getInt(1));
				U1.setPolicyName(rs.getString(2));
				return U1;
			}
		});
		
	}
	
	/**
	 *  healthnominee table Name of Database
	 *  createtableofNomineeDetails() method is used to creating tables in database
	 *  (Queriesfile.myNomineesTablesForHealth) used to create table
	 *  Queriesfile is class and myNomineesTablesForHealth is varriable name
	 *  This method return type is void
	 */
	public void createtableofNomineeDetails(){
		jdbcTemplate.execute(Queriesfile.myNomineesTablesForHealth);
	}
	
	/**
	 *  healthnominee table Name of Database
	 *  saveDeatilsOfNominees() method is used to Save data in database
	 *  (Queriesfile.storeContentsOfNominees) used to save table
	 *  Queriesfile is class and storeContentsOfNominees is varriable name
	 *  This method return type is Boolean
	 */
	public Boolean saveDeatilsOfNominees(HealthNomineeBeans healthNominee){
		return jdbcTemplate.execute(Queriesfile.storeContentsOfNominees,new PreparedStatementCallback<Boolean>() {

			@Override
			public Boolean doInPreparedStatement(PreparedStatement pstmt) throws SQLException, DataAccessException {
				
				pstmt.setString(1, healthNominee.getHealthsumInsured());
				pstmt.setString(2, healthNominee.getHealthpriemium());
				pstmt.setString(3, healthNominee.getHealthnomineeName());
				pstmt.setString(4, healthNominee.getHealthrelationsWithNominee());
				pstmt.setInt(5, healthNominee.getPolicyId());
				pstmt.setInt(6, healthNominee.getClientId());
	
				return pstmt.execute();
			}
		});
	}
	
	/**
	 *  healthNominee table Name of Database
	 *  listofAgentUsingEquiry() method is used to Retrive data from database
	 *  (Queriesfile.retriveNomineeValues) used to retrive data
	 *  Queriesfile is class and retriveNomineeValues is varriable name
	 *  This method return type is List
	 *  F2 is Object 
	 */
	public List<HealthNomineeBeans> clientsNomieesretrive(Integer clientId){
		return jdbcTemplate.query(Queriesfile.retriveNomineeValues,new Object[]{clientId},new RowMapper<HealthNomineeBeans>() {

			@Override
			public HealthNomineeBeans mapRow(ResultSet rs, int arg1) throws SQLException {
				HealthNomineeBeans F2 = new HealthNomineeBeans();
				F2.setHealthNomineeId(rs.getInt(1));
				F2.setHealthsumInsured(rs.getString(2));
				F2.setHealthpriemium(rs.getString(3));
				F2.setHealthnomineeName(rs.getString(4));
				F2.setHealthrelationsWithNominee(rs.getString(5));
				F2.setPolicyId(rs.getInt(6));
				F2.setClientId(rs.getInt(7));
				return F2;
			}
		});
		
	}
	
}
