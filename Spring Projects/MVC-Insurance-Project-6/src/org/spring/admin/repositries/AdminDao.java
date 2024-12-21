package org.spring.admin.repositries;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.spring.admin.beanclasses.AddnewPolicy;
import org.spring.admin.beanclasses.AdminLoginbean;
import org.spring.admin.beanclasses.RegisterAgent;
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
 * @since getloginAdmin
 * @version 1.1.2
 */
@Repository
public class AdminDao {
	@Autowired
	JdbcTemplate jdbcTemplate;
	
	/**
	 *  admin123 table Name of Database
	 *  createAdminTable() method is used to create table for add Admin Data in Database
	 *  (Queriesfile.createtableofAdmin) used to create table
	 *  This Method return type is void
	 */
	public void createAdminTable(){
				
				jdbcTemplate.execute(Queriesfile.createtableofAdmin);
				System.out.println("Table Created SuccessFully");
	}
	
	/**
	 *  admin123 table Name of Database
	 *  saveAdminTableData() method is used to insert data in database for Register Admin One Time
	 *  (Queriesfile.savecontentOfAdmin) used to create table
	 *  This method return type is Boolean
	 */
	public Boolean saveAdminTableData(AdminLoginbean adminlogin){
		return jdbcTemplate.execute(Queriesfile.savecontentOfAdmin, new PreparedStatementCallback<Boolean>() {

			@Override
			public Boolean doInPreparedStatement(PreparedStatement pstmt) throws SQLException, DataAccessException {
				pstmt.setString(1, adminlogin.getUsername());
				pstmt.setString(2, adminlogin.getPassword());
				return pstmt.execute();
			}
		});
	}
	
	/**
	 *  admin123 table Name of Database
	 *  viewProfileofAdminById() method is used to Retrive data from database
	 *  (Queriesfile.viewAdminOwnProfile) used to retrive data
	 *  Queriesfile is class and viewAdminOwnProfile is varriable name
	 *  This method return type is List
	 *  adminbean is Object 
	 */
	public AdminLoginbean viewProfileofAdminById(Integer adminId){
		
		return jdbcTemplate.queryForObject(Queriesfile.viewAdminOwnProfile,new Object[]{adminId},new BeanPropertyRowMapper<AdminLoginbean>(AdminLoginbean.class));
	}
	
	/**
	 *  agentregister table Name of Database
	 *  getlogin() method is used to Login Agent 
	 *  (Queriesfile.loginOfAgent) used to Login by checking existing  database data
	 *  Queriesfile is class and loginOfAgent is varriable name
	 *  This method return type is Integer
	 */
	public int getloginAdmin(AdminLoginbean adminlogin){
		
		return jdbcTemplate.query(Queriesfile.loginAdminUsingLogin,new Object[]{adminlogin.getUsername(),adminlogin.getPassword()},new ResultSetExtractor<Integer>(){

			@Override
			public Integer extractData(ResultSet rs) throws SQLException, DataAccessException {
				int count = 0;
				while(rs.next()){
					adminlogin.setUsername(rs.getString(1));
					adminlogin.setPassword(rs.getString(2));
					count = rs.getInt("adminId");
					
				}
				System.out.println("In Admin Login  Count is " +count );
				return count;
			}
			
		});
	}

	/**
	 *  policy111 table Name of Database
	 *  createpolicytable() method is used to create table for add new policy
	 *  (Queriesfile.createpolicytable) used to create table
	 *  This Method return type is void
	 */
	public void createpolicytable(){
				
				jdbcTemplate.execute(Queriesfile.createpolicytable);
				System.out.println("Table Created SuccessFully");
	}
	
	/**
	 *  policy111 table Name of Database
	 *  savepolicybyAdmin() method is used to insert data in database for new policy
	 *  (Queriesfile.savepolicy) used to create table
	 *  This method return type is Boolean
	 */
	public Boolean savepolicybyAdmin(AddnewPolicy addpolicy) {
		return jdbcTemplate.execute(Queriesfile.savepolicy, new PreparedStatementCallback<Boolean>() {

			@Override
			public Boolean doInPreparedStatement(PreparedStatement pstmt) throws SQLException, DataAccessException {
				pstmt.setInt(1, addpolicy.getPolicyId());
				pstmt.setString(2, addpolicy.getPolicyName());
				pstmt.setString(3, addpolicy.getTypeofcoverage());
				pstmt.setString(4, addpolicy.getDurations());
				return pstmt.execute();
			}
		});
	}
	
	/**
	 *  policy111 table Name of Database
	 *  getallpolicyofAdmin() method is used to Retrive data from database
	 *  (Queriesfile.savepolicy) used to retrive data
	 *  Queriesfile is class and savepolicy is varriable name
	 *  This method return type is List
	 *  P1 is Object 
	 */
	public List<AddnewPolicy>  getallpolicyofAdmin(){
		
		return jdbcTemplate.query(Queriesfile.viewpolicy, new RowMapper<AddnewPolicy>() {

			@Override
			public AddnewPolicy mapRow(ResultSet rs, int rownum) throws SQLException {
				AddnewPolicy P1 = new AddnewPolicy();
				P1.setPolicyId(rs.getInt(1));
				P1.setPolicyName(rs.getString(2));
				P1.setTypeofcoverage(rs.getString(3));
				P1.setDurations(rs.getString(4));
				return P1;
			}
		});
		
	}
	
	/**
	 *  createtableOfsaveAgent this method used to create new table of Agent by Admin
	 *  (Queriesfile.createagenttable) used to create table
	 *  This Method return type is void
	 */
	public void createtableOfsaveAgent(){
		
		jdbcTemplate.execute(Queriesfile.createagenttable);
		System.out.println("Table Created SuccessFUlly");
	}
	
	/**
	 *  saveagent() this method is used to data store in database
	 *  Queriesfile.saveagentindatabase used to save data in database and its query is Queryfile
	 *  Here used preparestatement 
	 *  This Method return type Boolean
	 */
	public Boolean saveagent(RegisterAgent registeragent) {
		
		return jdbcTemplate.execute(Queriesfile.saveagentindatabase, new PreparedStatementCallback<Boolean>() {

			@Override
			public Boolean doInPreparedStatement(PreparedStatement pstmt) throws SQLException, DataAccessException {
				pstmt.setInt(1, registeragent.getAgentId());
				pstmt.setString(2, registeragent.getAgentName());
				pstmt.setString(3, registeragent.getAgentemail());
				pstmt.setString(4, registeragent.getAgentpassword());
				pstmt.setString(5, registeragent.getAgentcfpassword());
				pstmt.setString(6, registeragent.getAgentaddress());
				pstmt.setString(7, registeragent.getAgentgender());
				pstmt.setString(8, registeragent.getAgentpanNo());
				
				pstmt.setString(9, registeragent.getAgentdob());
				pstmt.setString(10, registeragent.getAgentmobNo());
				pstmt.setString(11, registeragent.getAgentstate());
				pstmt.setString(12, registeragent.getAgentpostcode());
				pstmt.setString(13, registeragent.getAgentcountry());
				return pstmt.execute();
			}
		});
	}
	
	/**
	 *  agentregister table Name of Database
	 *  getallAgentofAdmin() method is used to Retrive data from database
	 *  (Queriesfile.viewallagent) used to retrive data
	 *  Queriesfile is class and savepolicy is varriable name
	 *  This method return type is List
	 *  R1 is Object 
	 */
	public List<RegisterAgent>  getallAgentofAdmin(){
		
		return jdbcTemplate.query(Queriesfile.viewallagent, new RowMapper<RegisterAgent>() {

			@Override
			public RegisterAgent mapRow(ResultSet rs, int rownum) throws SQLException {
				RegisterAgent R1 = new RegisterAgent();
				R1.setAgentId(rs.getInt(1));
				R1.setAgentName(rs.getString(2));
				R1.setAgentemail(rs.getString(3));
				R1.setAgentpassword(rs.getString(4));
				R1.setAgentcfpassword(rs.getString(5));
				R1.setAgentaddress(rs.getString(6));
				R1.setAgentgender(rs.getString(7));
				R1.setAgentpanNo(rs.getString(8));
				//R1.setAgentdob(rs.getDate(9));
				R1.setAgentdob(rs.getString(9));
				R1.setAgentmobNo(rs.getString(10));
				R1.setAgentstate(rs.getString(11));
				R1.setAgentpostcode(rs.getString(12));
				R1.setAgentcountry(rs.getString(13));
				return R1;
			}
		});
		
	}

	/**
	 *  clientregister table Name of Database
	 *  viewofPolicyhoderContents() method is used to Retrive data from database
	 *  (Queriesfile.viewallofPolicyHoderClient) used to retrive data
	 *  Queriesfile is class and viewallofPolicyHoderClient is varriable name
	 *  This method return type is List
	 *  policyhoderObj is Object 
	 */
	public List<PolicyHolderRegister>  viewofPolicyhoderContents(){
		
		return jdbcTemplate.query(Queriesfile.viewallofPolicyHoderClient, new RowMapper<PolicyHolderRegister>() {

			@Override
			public PolicyHolderRegister mapRow(ResultSet rs, int rownum) throws SQLException {
				PolicyHolderRegister policyhoderObj = new PolicyHolderRegister();
				policyhoderObj.setClientId(rs.getInt(1));
				policyhoderObj.setClientName(rs.getString(2));
				policyhoderObj.setClientemail(rs.getString(3));
				policyhoderObj.setClientpassword(rs.getString(4));
				policyhoderObj.setClientcfpassword(rs.getString(5));
				policyhoderObj.setClientaddress(rs.getString(6));
				policyhoderObj.setClientgender(rs.getString(7));
				policyhoderObj.setClientpanNo(rs.getString(8));
				policyhoderObj.setClientdob(rs.getString(9));
				policyhoderObj.setClientmobNo(rs.getString(10));
				policyhoderObj.setClientstate(rs.getString(11));
				policyhoderObj.setClientpostcode(rs.getString(12));
				policyhoderObj.setClientoccuption(rs.getString(13));
				policyhoderObj.setClientincome(rs.getString(14));
				policyhoderObj.setClientcountry(rs.getString(15));
				policyhoderObj.setAgentId(rs.getInt(16));
				
				return policyhoderObj;
			}
		});
		
	}
	
	/**
	 *  clientregister table Name of Database
	 *  deleteInfoClient() method is used to delete data from database
	 *  (Queriesfile.deleteClientByAdminUsingId) used to delete data
	 *  Queriesfile is class and deleteClientByAdminUsingId is varriable name
	 */
	public PolicyHolderRegister fetchByIdOfClientsInfo(Integer clientId){
		System.out.println("Now Method Is in Dao Class of Admin"+clientId);
		return jdbcTemplate.queryForObject(Queriesfile.clientInformationselectByAdmin,new Object[]{clientId},new BeanPropertyRowMapper<PolicyHolderRegister>(PolicyHolderRegister.class));
		
	}
	
	/**
	 *  clientregister table Name of Database
	 *  updateClientByAdmin() method is used to Update data from database
	 *  (Queriesfile.updateclientsdetails) used to update data
	 *  Queriesfile is class and updateclientsdetails is varriable name 
	 */
	public Boolean updateClientByAdmin(PolicyHolderRegister holderregister){
		System.out.println("Update Method Is in Dao Class of Admin"+holderregister.getClientId());
		
		return jdbcTemplate.execute(Queriesfile.updateclientsdetails,new PreparedStatementCallback<Boolean>() {

			@Override
			public Boolean doInPreparedStatement(PreparedStatement pstmt) throws SQLException, DataAccessException {
				pstmt.setString(1, holderregister.getClientName());
				pstmt.setString(2, holderregister.getClientemail());
				pstmt.setString(3, holderregister.getClientpassword());
				pstmt.setString(4, holderregister.getClientcfpassword());
				pstmt.setString(5, holderregister.getClientaddress());
				pstmt.setString(6, holderregister.getClientgender());
				pstmt.setString(7, holderregister.getClientpanNo());
				pstmt.setString(8, holderregister.getClientdob());
				pstmt.setString(9, holderregister.getClientmobNo());
				pstmt.setString(10, holderregister.getClientstate());
				pstmt.setString(11, holderregister.getClientpostcode());
				pstmt.setString(12, holderregister.getClientoccuption());
				pstmt.setString(13, holderregister.getClientincome());
				pstmt.setString(14, holderregister.getClientcountry());
				pstmt.setInt(15,holderregister.getClientId());
				return pstmt.execute();
			}
		});
		
	}
	
	
	/**
	 *  clientregister table Name of Database
	 *  deleteInfoClient() method is used to delete data from database
	 *  (Queriesfile.deleteClientByAdminUsingId) used to delete data
	 *  Queriesfile is class and deleteClientByAdminUsingId is varriable name
	 *  This method return type is Integer
	 *  status is int 
	 */
	public int deleteInfoClient(Integer clientId){
		int status = 0;
		status = jdbcTemplate.update(Queriesfile.deleteClientByAdminUsingId/*,new Object[]{clientId}*/);
		return status;
		
	}
	
	/**
	 *  clientspolicy table Name of Database
	 *  clientspolicyAddedByAgentByhim() method is used to Retrive data from database
	 *  (Queriesfile.mypolicyaddedByMe) used to retrive data
	 *  Queriesfile is class and mypolicyaddedByMe is varriable name
	 *  This method return type is List
	 */
	public List<PolicyregisterOfClients>  adminclientspolicyAddedByAgentByhim(){
		
		//List B1 = jdbcTemplate.queryForList(Queriesfile.mypolicyaddedByMe, new Object[]{agentId},new BeanPropertyRowMapper<PolicyregisterOfClients>(PolicyregisterOfClients.class));
		return jdbcTemplate.query(Queriesfile.allpolicyByAdminDeleteView, new RowMapper<PolicyregisterOfClients>(){
			public PolicyregisterOfClients mapRow(ResultSet rs, int arg1) throws SQLException {
				PolicyregisterOfClients Q=new PolicyregisterOfClients();
				Q.setPolicyNo(rs.getInt(1));
				Q.setPolicyDate(rs.getString(2));
				Q.setPolicymaturityDate(rs.getString(3));
				Q.setPolicysumInsured(rs.getString(4));
				Q.setPolicypremiumAmount(rs.getString(5));
				Q.setPolicycommission(rs.getString(6));
				Q.setPaymentmethod(rs.getString(7));
				Q.setPolicyId(rs.getInt(8));
				Q.setAgentId(rs.getInt(9));
				Q.setClientId(rs.getInt(10));
				Q.toString();
				return Q;
			}
		});
	}
	
	/**
	 *  clientregister table Name of Database
	 *  deleteInfoClient() method is used to delete data from database
	 *  (Queriesfile.deleteClientByAdminUsingId) used to delete data
	 *  Queriesfile is class and deleteClientByAdminUsingId is varriable name
	 */
	public PolicyregisterOfClients retriveOfPoliciesOfClients(Integer policyNo){
		System.out.println("Now Method Is in Dao Class of Admin"+policyNo);
		return jdbcTemplate.queryForObject(Queriesfile.retrivepolicycontents,new Object[]{policyNo},new BeanPropertyRowMapper<PolicyregisterOfClients>(PolicyregisterOfClients.class));
		
	}
	

	/**
	 *  clientspolicy table Name of Database
	 *  updatepolicyAddedByAgentByAdmin() method is used to Update data from database
	 *  (Queriesfile.updateclientsPolicyByAdmin123) used to update data
	 *  Queriesfile is class and updateclientsPolicyByAdmin123 is varriable name 
	 */
	public Boolean updatepolicyAddedByAgentByAdmin(PolicyregisterOfClients clientsregisterpolicyEdit){
		System.out.println("Update Method Is in Dao Class of Admin"+clientsregisterpolicyEdit.getPolicyNo());
		
		return jdbcTemplate.execute(Queriesfile.updateclientsPolicyByAdmin123,new PreparedStatementCallback<Boolean>() {

			@Override
			public Boolean doInPreparedStatement(PreparedStatement pstmt) throws SQLException, DataAccessException {
				pstmt.setString(1, clientsregisterpolicyEdit.getPolicyDate());
				pstmt.setString(2, clientsregisterpolicyEdit.getPolicymaturityDate());
				pstmt.setString(3, clientsregisterpolicyEdit.getPolicysumInsured());
				pstmt.setString(4, clientsregisterpolicyEdit.getPolicypremiumAmount());
				pstmt.setString(5, clientsregisterpolicyEdit.getPolicycommission());
				pstmt.setString(6, clientsregisterpolicyEdit.getPaymentmethod());
				pstmt.setInt(7, clientsregisterpolicyEdit.getPolicyNo());
				return pstmt.execute();
			}
		});
		
	}
	

}
