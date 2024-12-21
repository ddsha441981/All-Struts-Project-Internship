package org.spring.agent.repositries;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.spring.admin.beanclasses.AddnewPolicy;
import org.spring.agent.beanofAgent.EnquiryofCustomers;
import org.spring.agent.beanofAgent.QuotationsBeans;
import org.spring.utilitytablesquery.Queriesfile;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCallback;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import oracle.net.aso.q;

/**
 * @author Deendayal
 * @since 2017
 * @version 1.1.2
 * class QuotationsDao
 */
@Repository
public class QuotationsDao {

	@Autowired
	JdbcTemplate jdbcTemplate;
	
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	
	/**
	 *  Policy111 table Name of Database
	 *  recordfetchofPolicy() is Method to used retrive data of the from database
	 *  In this Method used List and its return type is List
	 *  query fetchdataContentsOfPolicy varriable Queriesfile.fetchdataContentsOfPolicy
	 *  Queriesfile is class name
	 *  fetchdataContentsOfPolicy is varriable
	 */
	public List<AddnewPolicy> recordfetchofPolicy(){
		
		return jdbcTemplate.query(Queriesfile.fetchdataContentsOfPolicy,new RowMapper<AddnewPolicy>() {

			@Override
			public AddnewPolicy mapRow(ResultSet rs, int arg1) throws SQLException {
				AddnewPolicy JP = new AddnewPolicy();
				JP.setPolicyId(rs.getInt(1));
				JP.setPolicyName(rs.getString(2));
				return JP;
			}
		});
	}
	
	
	/**
	 *  enquirycustomers table Name of Database
	 *  fetchIdofEnquiries() is Method to used fetch data of the database
	 *  In this Method used Bean Property Row Mapper 
	 *  query selectIdUsingdata varriable Queriesfile.selectIdUsingdata
	 *  Queriesfile is class name
	 *  selectIdUsingdata is varriable
	 */
	public EnquiryofCustomers fetchIdofEnquiries(Integer enquiryId){
		return jdbcTemplate.queryForObject(Queriesfile.selectIdUsingdata,new Object[]{enquiryId},new BeanPropertyRowMapper<EnquiryofCustomers>(EnquiryofCustomers.class));
		
	}
	
	
	/**
	 *  quotation table Name of Database
	 *  newtableofQuations() is Method to used creating table in database
	 *  its return type is void
	 *  query quotationstablescreated varriable Queriesfile.quotationstablescreated
	 *  quotationstablescreated is class name
	 *  quotationstablescreated is varriable
	 */
	public void newtableofQuations(){
		 jdbcTemplate.execute(Queriesfile.quotationstablescreated);
		System.out.println("Table Created Successfully");
	}
	
	
	/**
	 *  quotation table Name of Database
	 *  savecontentsofQuotations() is Method to used save data
	 *  In this Method used Preparestatement and its return type is Boolean
	 *  query savedataOfqoutations varriable Queriesfile.savedataOfqoutations
	 *  Queriesfile is class name
	 *  savedataOfqoutations is varriable
	 */
	public Boolean savecontentsofQuotations(QuotationsBeans quotationbeans){
		return jdbcTemplate.execute(Queriesfile.savedataOfqoutations,new PreparedStatementCallback<Boolean>() {

			@Override
			public Boolean doInPreparedStatement(PreparedStatement pstmt) throws SQLException, DataAccessException {
				pstmt.setString(1, quotationbeans.getQuotationAmounts());
				pstmt.setString(2, quotationbeans.getReplydate());
				pstmt.setInt(3, quotationbeans.getEnquiryId());
				pstmt.setInt(4, quotationbeans.getPolicyId());
				return pstmt.execute();
			}
		});
	}
	
	/**
	 *  quotation table Name of Database
	 *  retriveByAgentsTofetchquotations() is Method to used Retrive data from database
	 *  In this Method used RowMapper and its return type is List
	 *  query retriveByAgentsTofetchquotations varriable Queriesfile.retriveByAgentsTofetchquotations
	 *  Queriesfile is class name
	 *  retriveByAgentsTofetchquotations is varriable
	 */
	public List<QuotationsBeans> viewContentsOfQuotationsByAgents(){
		
		return jdbcTemplate.query(Queriesfile.retriveByAgentsTofetchquotations,new RowMapper<QuotationsBeans>() {

			@Override
			public QuotationsBeans mapRow(ResultSet rs, int arg1) throws SQLException {
				QuotationsBeans E1 =  new QuotationsBeans();
				E1.setQuotationId(rs.getInt(1));
				E1.setQuotationAmounts(rs.getString(2));
				E1.setReplydate(rs.getString(3));
				E1.setPolicyId(rs.getInt(4));
				E1.setEnquiryId(rs.getInt(5));
				
				return E1;
			}
		});
	}
}
