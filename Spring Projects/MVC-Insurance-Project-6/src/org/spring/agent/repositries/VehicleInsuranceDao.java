package org.spring.agent.repositries;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.spring.agent.beanofAgent.PolicyHolderRegister;
import org.spring.agent.beanofAgent.PolicyHoldersandAgentdata;
import org.spring.agent.beanofAgent.PolicyregisterOfClients;
import org.spring.agent.beanofAgent.VehicleInsuranceBean;
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
 * @version 1.1.2
 * @since 2017
 * * The Class VehicleInsuranceRepos.
 */
@Repository
public class VehicleInsuranceDao {
	@Autowired(required=true)
	JdbcTemplate jdbcTemplate;
	

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	
	
	/**
	 *  vehicles table Name of Database
	 *  viewalldataofclientbyagentbyId() method is used to Retrive data from database
	 *  (Queriesfile.viewclientById) used to retrive data
	 *  Queriesfile is class and viewclientById is varriable name
	 *  This method return type is List
	 *   C1 is Object 
	 */
	public PolicyHoldersandAgentdata usingJoinsretriveData(Integer clientId){
		System.out.println("///////////////////////Here Id is In DAO Class "+clientId);
		 return  jdbcTemplate.queryForObject(Queriesfile.viewclientsAgentsdata, new Object[]{clientId},new BeanPropertyRowMapper<PolicyHoldersandAgentdata>(PolicyHoldersandAgentdata.class));
		  

	}
	
	/**
	 *  vehicles table Name of Database
	 *  TableOfvehicle() method is used to create table in database
	 *  (Queriesfile.vehicletable) used to create table in database
	 *  Queriesfile is class and vehicletable is varriable name
	 *  This method return type is void
	 */
	public void TableOfvehicle(){
		
		jdbcTemplate.execute(Queriesfile.vehicletable);
		System.out.println("Table Created SuccessFully");
	}
	
	public Boolean saveContentsOfVehicles(VehicleInsuranceBean vehiclesContents){
		return jdbcTemplate.execute(Queriesfile.saveContentsVehiclesData,new PreparedStatementCallback<Boolean>() {

			@Override
			public Boolean doInPreparedStatement(PreparedStatement pstmt) throws SQLException, DataAccessException {
				pstmt.setString(1, vehiclesContents.getFromdate());
				pstmt.setString(2, vehiclesContents.getTodate());
				pstmt.setString(3, vehiclesContents.getDateofregister());
				pstmt.setString(4, vehiclesContents.getManufacturedate());
				pstmt.setString(5, vehiclesContents.getRegisterno());
				pstmt.setString(6, vehiclesContents.getUsedfuel());
				pstmt.setString(7, vehiclesContents.getEngineNo());
				pstmt.setString(8, vehiclesContents.getCublic());
				pstmt.setString(9, vehiclesContents.getChassisNo());
				pstmt.setString(10, vehiclesContents.getMake());
				pstmt.setString(11, vehiclesContents.getModel());
				pstmt.setString(12, vehiclesContents.getIdv());
				pstmt.setString(13, vehiclesContents.getThirdparty());
				pstmt.setString(14, vehiclesContents.getServicetax());
				pstmt.setString(15, vehiclesContents.getTodate());
				pstmt.setString(16, vehiclesContents.getPaymentMethod());
				pstmt.setInt(17, vehiclesContents.getAgentId());
				pstmt.setInt(18, vehiclesContents.getClientId());
				return  pstmt.execute();
			}
		} ); 
	}
	
	/**
	 *  vehicles table Name of Database
	 *  viewalldataofclientbyagentbyId() method is used to Retrive data from database
	 *  (Queriesfile.viewclientById) used to retrive data
	 *  Queriesfile is class and viewclientById is varriable name
	 *  This method return type is List
	 *   VC is Object 
	 */
	public List<VehicleInsuranceBean>  selectRecordInListFormat(Integer agentId){
		System.out.println("///////////////////////Here Id is In DAO Class "+agentId);
		
		return jdbcTemplate.query(Queriesfile.recordSelectedFromDatabase,new Object[]{agentId},new RowMapper<VehicleInsuranceBean>() {

			@Override
			public VehicleInsuranceBean mapRow(ResultSet rs, int arg1) throws SQLException {
				VehicleInsuranceBean VC = new VehicleInsuranceBean();
				VC.setVehicleId(rs.getInt(1));
				VC.setTodate(rs.getString(2));
				VC.setFromdate(rs.getString(3));
				VC.setDateofregister(rs.getString(4));
				VC.setManufacturedate(rs.getString(5));
				VC.setRegisterno(rs.getString(6));
				VC.setUsedfuel(rs.getString(7));
				VC.setEngineNo(rs.getString(8));
				VC.setCublic(rs.getString(9));
				VC.setChassisNo(rs.getString(10));
				VC.setMake(rs.getString(11));
				VC.setModel(rs.getString(12));
				VC.setIdv(rs.getString(13));
				VC.setThirdparty(rs.getString(14));
				VC.setServicetax(rs.getString(15));
				VC.setTotal(rs.getString(16));
				VC.setPaymentMethod(rs.getString(17));
				VC.setAgentId(rs.getInt(18));
				VC.setClientId(rs.getInt(19));
				//VC.toString();
				return VC;
			}
		});
		  

	}
	
	
}
