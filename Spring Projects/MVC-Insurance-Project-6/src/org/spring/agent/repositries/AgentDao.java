package org.spring.agent.repositries;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.spring.admin.beanclasses.AddnewPolicy;
import org.spring.admin.beanclasses.RegisterAgent;
import org.spring.agent.beanofAgent.Agentlogin;
import org.spring.agent.beanofAgent.PolicyHolderRegister;
import org.spring.agent.beanofAgent.PolicyregisterOfClients;
import org.spring.utilitytablesquery.Queriesfile;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCallback;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

/**
 * @author Deendayal
 * @since
 * @version 1.1.2
 */
@Repository
public class AgentDao {

	@Autowired(required=true)
	 JdbcTemplate jdbcTemplate;
	
	
	/**
	 *  agentregister table Name of Database
	 *  getlogin() method is used to Login Agent 
	 *  (Queriesfile.loginOfAgent) used to Login by checking existing  database data
	 *  Queriesfile is class and loginOfAgent is varriable name
	 *  This method return type is Integer
	 */
	
	public int getlogin(Agentlogin agentlogin){
		
		System.out.println("Login Dao Method Executed");
		
		return jdbcTemplate.query(Queriesfile.loginOfAgent,new Object[]{agentlogin.getAgentName(),agentlogin.getAgentpassword()}, new ResultSetExtractor<Integer>() {
	        @Override
	        public Integer extractData(ResultSet rs) throws SQLException,
                                          DataAccessException {
		        int status=0; 
	        	while(rs.next()){
	        	agentlogin.setAgentName(rs.getString(1));
	        	agentlogin.setAgentpassword(rs.getString(2));
	        	
	        	    status =rs.getInt("agentId");
	        	  
	           }
	        	 System.out.println("In Login Dao class Agent Id is............."+status);
				return status;  
	        }
	    });
		
	}

	/**
	 *  agentregister table Name of Database
	 *  viewAgentProfileUsingById() method is used to Retrive data from database
	 *  (Queriesfile.viewclientById) used to retrive data
	 *  Queriesfile is class and viewclientById is varriable name
	 *  This method return type is List
	 */
	public RegisterAgent viewAgentProfileUsingById(Integer agentId){
		
		 return  jdbcTemplate.queryForObject(Queriesfile.viewAgentProfileOwnLid, new Object[]{agentId},new BeanPropertyRowMapper<RegisterAgent>(RegisterAgent.class));
		  
	}
	
	
	/**
	 *  agentregister table Name of Database
	 *  fetchByIdOfAgentInfo() method is used to Retrive data from database
	 *  (Queriesfile.agentdetailsByAgentEdit) used to retrive data
	 *  Queriesfile is class and agentdetailsByAgentEdit is varriable name
	 *  This method return type is List
	 */
	public RegisterAgent fetchByIdOfAgentInfo(Integer agentId){
		
		 return  jdbcTemplate.queryForObject(Queriesfile.agentdetailsByAgentEdit, new Object[]{agentId},new BeanPropertyRowMapper<RegisterAgent>(RegisterAgent.class));
		  
	}
	
	/**
	 *  agentregister table Name of Database
	 *  updateTheirProfileByAgent() method is used to update data from database
	 *  (Queriesfile.agenteditAftersubmitingdata) used to retrive data
	 *  Queriesfile is class and agenteditAftersubmitingdata is varriable name
	 *  This method return type is object
	 */
	public Boolean updateTheirProfileByAgent(RegisterAgent agentofown){
		System.out.println("Agent Updating ownprofile after submiting Data"+agentofown.getAgentId());
		return jdbcTemplate.execute(Queriesfile.agenteditAftersubmitingdata, new PreparedStatementCallback<Boolean>() {

			@Override
			public Boolean doInPreparedStatement(PreparedStatement pstmt) throws SQLException, DataAccessException {
				
				pstmt.setString(1, agentofown.getAgentName());
				pstmt.setString(2, agentofown.getAgentemail());
				pstmt.setString(3, agentofown.getAgentpassword());
				pstmt.setString(4, agentofown.getAgentcfpassword());
				pstmt.setString(5, agentofown.getAgentaddress());
				pstmt.setString(6, agentofown.getAgentgender());
				pstmt.setString(7, agentofown.getAgentpanNo());
				pstmt.setString(8, agentofown.getAgentdob());
				pstmt.setString(9, agentofown.getAgentmobNo());
				pstmt.setString(10, agentofown.getAgentstate());
				pstmt.setString(11, agentofown.getAgentpostcode());
				pstmt.setString(12, agentofown.getAgentcountry());
				pstmt.setInt(13, agentofown.getAgentId());
				return pstmt.execute();
			}
		});
		
		
	}
	
	
	/**
	 *   clientregister table Name of Database
	 *  createtabletoregisterclient() is Method to used create a table
	 *  create table using this varriable Queriesfile.newclienttable
	 *  Queriesfile is class name
	 *  newclienttable is varriable
	 */
	public void createtabletoregisterclient(){
		
		jdbcTemplate.execute(Queriesfile.newclienttable);
		System.out.println("Table Created SuccessFUlly");
	}
	
	/**
	 *   clientregister table Name of Database
	 *  saveallofclientbyagent() is Method to used save data of the clientdata
	 *  In this Method used Preparestatement and its return type is Boolean
	 *  query fireusingthis varriable Queriesfile.clientsave
	 *  Queriesfile is class name
	 *  clientsave is varriable
	 */
	public Boolean saveallofclientbyagent(PolicyHolderRegister client){
		return jdbcTemplate.execute(Queriesfile.clientsave, new PreparedStatementCallback<Boolean>() {

			@Override
			public Boolean doInPreparedStatement(PreparedStatement pstmt) throws SQLException, DataAccessException {
				//pstmt.setInt(1, client.getClientId());
				pstmt.setString(1, client.getClientName());
				pstmt.setString(2, client.getClientemail());
				pstmt.setString(3, client.getClientpassword());
				pstmt.setString(4, client.getClientcfpassword());
				pstmt.setString(5, client.getClientaddress());
				pstmt.setString(6, client.getClientgender());
				pstmt.setString(7, client.getClientpanNo());
				//pstmt.setDate(8,new java.sql.Date(client.getClientdob().getTime()));
				pstmt.setString(8,client.getClientdob());
				pstmt.setString(9,client.getClientmobNo());
				pstmt.setString(10, client.getClientstate());
				pstmt.setString(11, client.getClientpostcode());
				pstmt.setString(12, client.getClientoccuption());
				pstmt.setString(13, client.getClientincome());
				pstmt.setString(14, client.getClientcountry());
				pstmt.setInt(15, client.getAgentId());
				
				return pstmt.execute();
			}
		});
		
	}
	
	/**
	 *  clientregister table Name of Database
	 *  viewalldataofclientbyagentbyId() method is used to Retrive data from database
	 *  (Queriesfile.viewclientById) used to retrive data
	 *  Queriesfile is class and viewclientById is varriable name
	 *  This method return type is List
	 *   C1 is Object 
	 */
	public PolicyHolderRegister viewalldataofclientbyagentbyId(Integer aId){
		System.out.println("///////////////////////Here Id is In DAO Class "+aId);
		 return  jdbcTemplate.queryForObject(Queriesfile.viewclientById, new Object[]{aId},new BeanPropertyRowMapper<PolicyHolderRegister>(PolicyHolderRegister.class));
		  

	}

	
	/**
	 *   clientspolicy table Name of Database
	 *  createtabletoregisterclient() is Method to used create a table
	 *  create table using this varriable Queriesfile.newclienttable
	 *  Queriesfile is class name
	 *  newclienttable is varriable
	 */
	public void createtableofNewPolicyOfCLientsInformations(){
		
		jdbcTemplate.execute(Queriesfile.createNewPolicyTableOfClientsInfo);
		System.out.println("Table Created SuccessFUlly");
	}
	
	/**
	 *  policy111 table Name of Database
	 *  allpolicyAddedByAdmin() method is used to Retrive data from database
	 *  (Queriesfile.allpolicydetailsAddedByAdmin) used to retrive data
	 *  Queriesfile is class and allpolicydetailsAddedByAdmin is varriable name
	 *  This method return type is List
	 *  C1 is Object 
	 */
	public List<AddnewPolicy>  allpolicyAddedByAdmin(){
		
		return jdbcTemplate.query(Queriesfile.allpolicydetailsAddedByAdmin, new RowMapper<AddnewPolicy>() {

			@Override
			public AddnewPolicy mapRow(ResultSet rs, int rownum) throws SQLException {
				AddnewPolicy C1 = new AddnewPolicy();
				C1.setPolicyId(rs.getInt(1));
				C1.setPolicyName(rs.getString(2));
				C1.setTypeofcoverage(rs.getString(3));
				C1.setDurations(rs.getString(4));
				//System.out.println("/////////////////////////"+C1.toString());
				return C1;
			}
		});
		
	}
	
	/**
	 *   clientspolicy table Name of Database
	 *  saveallofclientbyagent() is Method to used save data of the clientdata
	 *  In this Method used Preparestatement and its return type is Boolean
	 *  query fireusingthis varriable Queriesfile.clientsave
	 *  Queriesfile is class name
	 *  clientsavePolicyByAgentallInfo is varriable
	 */
	public Boolean saveclientspolicyByAgent(PolicyregisterOfClients policyclients){
		/*System.out.println("////////////////In Dao Class////////////////////////////");
		System.out.println("Here Agentid is "+policyclients.getAgentId());
		System.out.println("Here Client is "+policyclients.getClientId());
		System.out.println("Here Policy Id Is "+policyclients.getPolicyId());*/
		return jdbcTemplate.execute(Queriesfile.clientsavePolicyByAgentallInfo, new PreparedStatementCallback<Boolean>() {

			@Override
			public Boolean doInPreparedStatement(PreparedStatement pstmt) throws SQLException, DataAccessException {
				pstmt.setString(1, policyclients.getPolicyDate());
				pstmt.setString(2, policyclients.getPolicymaturityDate());
				pstmt.setString(3, policyclients.getPolicysumInsured());
				pstmt.setString(4, policyclients.getPolicypremiumAmount());
				pstmt.setString(5, policyclients.getPolicycommission());
				pstmt.setString(6, policyclients.getPaymentmethod());
				pstmt.setInt(7, policyclients.getPolicyId());
				pstmt.setInt(8, policyclients.getAgentId());
				pstmt.setInt(9, policyclients.getClientId());
				return pstmt.execute();
			}
		});
		
	}
	
	/**
	 *  clientspolicy table Name of Database
	 *  clientspolicyAddedByAgentByhim() method is used to Retrive data from database
	 *  (Queriesfile.mypolicyaddedByMe) used to retrive data
	 *  Queriesfile is class and mypolicyaddedByMe is varriable name
	 *  This method return type is List
	 */
	public List<PolicyregisterOfClients>  clientspolicyAddedByAgentByhim(Integer agentId){
		System.out.println("///////////////////////Here Id is In DAO Class "+agentId);
		//List B1 = jdbcTemplate.queryForList(Queriesfile.mypolicyaddedByMe, new Object[]{agentId},new BeanPropertyRowMapper<PolicyregisterOfClients>(PolicyregisterOfClients.class));
		return jdbcTemplate.query(Queriesfile.mypolicyaddedByMe,new Object[]{agentId}, new RowMapper<PolicyregisterOfClients>(){
			public PolicyregisterOfClients mapRow(ResultSet rs, int arg1) throws SQLException {
				PolicyregisterOfClients b=new PolicyregisterOfClients();
				b.setPolicyNo(rs.getInt(1));
				b.setPolicyDate(rs.getString(2));
				b.setPolicymaturityDate(rs.getString(3));
				b.setPolicysumInsured(rs.getString(4));
				b.setPolicypremiumAmount(rs.getString(5));
				b.setPolicycommission(rs.getString(6));
				b.setPaymentmethod(rs.getString(7));
				b.setPolicyId(rs.getInt(8));
				b.setAgentId(rs.getInt(9));
				b.setClientId(rs.getInt(10));
				b.toString();
				return b;
			}
		});
		
		 
	}

}