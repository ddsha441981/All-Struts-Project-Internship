package org.spring.client.repositries;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.spring.client.beanclasses.ClientLogin;
import org.spring.utilitytablesquery.Queriesfile;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.stereotype.Repository;

/**
 * @author Deendayal
 * @version 1.1.2
 * @since 2017
 * The Class ClientDao.
 */
@Repository
public class ClientDao {
	
	@Autowired(required=true)
	JdbcTemplate jdbcTemplate;
	
	public int clientLoginUsingNamePass(ClientLogin clientlogin){

		System.out.println("Login Dao Method Executed");
		
		return jdbcTemplate.query(Queriesfile.loginOfclient,new Object[]{clientlogin.getClientName(),clientlogin.getClientpassword()}, new ResultSetExtractor<Integer>() {
	        @Override
	        public Integer extractData(ResultSet rs) throws SQLException,
                                          DataAccessException {
		        int clientstatus=0; 
	        	while(rs.next()){
	        		clientlogin.setClientName(rs.getString(1));
	        		clientlogin.setClientpassword(rs.getString(2));
	        	
	        		clientstatus =rs.getInt("clientId");
	        	  
	           }
	        	 System.out.println("In Login Dao class Client Id is............."+clientstatus);
				return clientstatus;  
	        }
	    });
		
	}
	
	public ClientLogin clientselectDataOfProfileManage(Integer iId){
		return jdbcTemplate.queryForObject(Queriesfile.clientLoginInformationSelected, new Object[]{iId},new BeanPropertyRowMapper<ClientLogin>(ClientLogin.class));
		
	}
}
