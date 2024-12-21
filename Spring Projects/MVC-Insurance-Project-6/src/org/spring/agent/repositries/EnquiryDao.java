package org.spring.agent.repositries;
/**
 * @author Deendayal
 * @since 2017
 * @version 1.1.2
 */

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
/** This class is EnquiryDao class
 *  some methods delcared
 *  Used Logger
 */
import java.util.List;

import org.spring.admin.beanclasses.AddnewPolicy;
import org.spring.admin.beanclasses.RegisterAgent;
import org.spring.agent.beanofAgent.EnquiryofCustomers;
import org.spring.utilitytablesquery.Queriesfile;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCallback;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

@Repository
public class EnquiryDao {
	
	/** The jdbc template. */
	@Autowired
	JdbcTemplate jdbcTemplate;
	
	/**
	 * Sets the jdbc template.
	 * @param jdbcTemplate the new jdbc template
	 */
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	/**
	 *  policy111 table Name of Database
	 *  viewallOfpolicyUsingEnquiry() method is used to Retrive data from database
	 *  (Queriesfile.myEquirylistOfpolicies) used to retrive data
	 *  Queriesfile is class and myEquirylistOfpolicies is varriable name
	 *  This method return type is List
	 *  JK is Object 
	 */
	public List<AddnewPolicy> viewallOfpolicyUsingEnquiry(){
		
		return jdbcTemplate.query(Queriesfile.myEquirylistOfpolicies,new RowMapper<AddnewPolicy>() {

			@Override
			public AddnewPolicy mapRow(ResultSet rs, int arg1) throws SQLException {
				AddnewPolicy Jk = new AddnewPolicy();
				Jk.setPolicyId(rs.getInt(1));
				Jk.setPolicyName(rs.getString(2));
				return Jk;
			}
		});
		
	}
	
	/**
	 *  registeragent table Name of Database
	 *  listofAgentUsingEquiry() method is used to Retrive data from database
	 *  (Queriesfile.myAgentsselectedforEnquiry) used to retrive data
	 *  Queriesfile is class and myAgentsselectedforEnquiry is varriable name
	 *  This method return type is List
	 *  RA is Object 
	 */
	public List<RegisterAgent> listofAgentUsingEquiry(){
		return jdbcTemplate.query(Queriesfile.myAgentsselectedforEnquiry,new RowMapper<RegisterAgent>() {

			@Override
			public RegisterAgent mapRow(ResultSet rs, int arg1) throws SQLException {
				RegisterAgent RA = new RegisterAgent();
				RA.setAgentId(rs.getInt(1));
				RA.setAgentName(rs.getString(2));
				return RA;
			}
		});
		
	}
	
	/**
	 *  enquirycustomers table Name of Database
	 *  creattableofenquiry() method is used to create table  from database
	 *  (Queriesfile.tablesofenquiry) used to creating table
	 *  Queriesfile is class and tablesofenquiry is varriable name
	 *  This method return type is void
	 */
	public void creattableofenquiry(){
		
		jdbcTemplate.execute(Queriesfile.tablesofenquiry);
		System.out.println("Table Created Successfully");
	}
	
	/**
	 *  enquirycustomers table Name of Database
	 *  savecustomEnquiry() method is used to save data  into database
	 *  (Queriesfile.savecustomersenquiry) used to save data
	 *  Queriesfile is class and savecustomersenquiry is varriable name
	 *  This method return type is Boolean
	 */
	public Boolean savecustomEnquiry(EnquiryofCustomers enquiries){
		
		return jdbcTemplate.execute(Queriesfile.savecustomersenquiry,new PreparedStatementCallback<Boolean>() {

			@Override
			public Boolean doInPreparedStatement(PreparedStatement pstmt) throws SQLException, DataAccessException {
				pstmt.setString(1, enquiries.getCustomerName());
				pstmt.setString(2, enquiries.getCustomaddress());
				pstmt.setString(3, enquiries.getCustomMobNo());
				pstmt.setString(4, enquiries.getEnquirydate());
				pstmt.setInt(5, enquiries.getPolicyId());
				pstmt.setInt(6, enquiries.getAgentId());
				return pstmt.execute();
			}
		});
		
	}
	
	/**
	 *  enquirycustomers table Name of Database
	 *  savecustomEnquiry() method is used to save data  into database
	 *  (Queriesfile.savecustomersenquiry) used to save data
	 *  Queriesfile is class and savecustomersenquiry is varriable name
	 *  This method return type is Boolean
	 */
	public List<EnquiryofCustomers> viewsAgentsEnquiryDataofCustomers(Integer aId){
		
		return jdbcTemplate.query(Queriesfile.agentUsingIdSelected,new Object[]{aId},new RowMapper<EnquiryofCustomers>() {

			@Override
			public EnquiryofCustomers mapRow(ResultSet rs, int arg1) throws SQLException {
				EnquiryofCustomers EC = new EnquiryofCustomers();
				EC.setEnquiryId(rs.getInt(1));
				EC.setCustomerName(rs.getString(2));
				EC.setCustomaddress(rs.getString(3));
				EC.setCustomMobNo(rs.getString(4));
				EC.setEnquirydate(rs.getString(5));
				EC.setPolicyId(rs.getInt(6));
				EC.setAgentId(rs.getInt(7));
				
				return EC;
			}
		});
		
	}
}
