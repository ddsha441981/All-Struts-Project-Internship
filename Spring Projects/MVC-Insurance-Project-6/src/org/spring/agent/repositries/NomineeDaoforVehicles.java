package org.spring.agent.repositries;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.spring.admin.beanclasses.AddnewPolicy;
import org.spring.agent.beanofAgent.HealthNomineeBeans;
import org.spring.agent.beanofAgent.VehiclesNomineeBeans;
import org.spring.utilitytablesquery.Queriesfile;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCallback;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

/**
 * @author Deendayal
 * @since 2017
 * @version 1.1.2
 */
/** This class is NomineeDaoforVehicles class
 *  some methods delcared
 *  Used Logger
 */
@Repository
public class NomineeDaoforVehicles {
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
	public List<AddnewPolicy> contentretriveofPoliciesfromDatabase(){
		return jdbcTemplate.query(Queriesfile.nomineeVehiclesFetchPolicy,new RowMapper<AddnewPolicy>() {

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
	public void createtableofNomineeDetailsOfVehicles(){
		jdbcTemplate.execute(Queriesfile.myNomineesTablesForVehicles);
	}
	
	/**
	 *  healthnominee table Name of Database
	 *  saveDeatilsOfNominees() method is used to Save data in database
	 *  (Queriesfile.storeContentsOfNominees) used to save table
	 *  Queriesfile is class and storeContentsOfNominees is varriable name
	 *  This method return type is Boolean
	 */
	public Boolean contentsofVehiclsNominee(VehiclesNomineeBeans vehiclesNominee){
		return jdbcTemplate.execute(Queriesfile.datasaveforVehicles,new PreparedStatementCallback<Boolean>() {

			@Override
			public Boolean doInPreparedStatement(PreparedStatement pstmt) throws SQLException, DataAccessException {
				
				pstmt.setString(1, vehiclesNominee.getHealthsumInsured());
				pstmt.setString(2, vehiclesNominee.getHealthpriemium());
				pstmt.setString(3, vehiclesNominee.getHealthnomineeName());
				pstmt.setString(4, vehiclesNominee.getHealthrelationsWithNominee());
				pstmt.setInt(5, vehiclesNominee.getPolicyId());
				pstmt.setInt(6, vehiclesNominee.getClientId());
	
				return pstmt.execute();
			}
		});
	}
	/*
	*//**
	 *  healthNominee table Name of Database
	 *  listofAgentUsingEquiry() method is used to Retrive data from database
	 *  (Queriesfile.retriveNomineeValues) used to retrive data
	 *  Queriesfile is class and retriveNomineeValues is varriable name
	 *  This method return type is List
	 *  R2 is Object 
	 */
	public List<VehiclesNomineeBeans> clientsNomieesretrive(Integer clientId){
		return jdbcTemplate.query(Queriesfile.retriveNomineeValuesforVehcles,new Object[]{clientId},new RowMapper<VehiclesNomineeBeans>() {

			@Override
			public VehiclesNomineeBeans mapRow(ResultSet rs, int arg1) throws SQLException {
				VehiclesNomineeBeans R2 = new VehiclesNomineeBeans();
				R2.setHealthNomineeId(rs.getInt(1));
				R2.setHealthsumInsured(rs.getString(2));
				R2.setHealthpriemium(rs.getString(3));
				R2.setHealthnomineeName(rs.getString(4));
				R2.setHealthrelationsWithNominee(rs.getString(5));
				R2.setPolicyId(rs.getInt(6));
				R2.setClientId(rs.getInt(7));
				return R2;
			}
		});
		
	}
}
