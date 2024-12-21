package org.spring.DaoImpl;

import org.spring.dto.AgentBeans;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class ForgotPasswordDao {

	@Autowired(required = true)
	JdbcTemplate jdbcTemplate;
	
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	
	public AgentBeans agentsForgotsPasswordFetch(AgentBeans agentBeans){
		AgentBeans isemailExistsRowbean = null;
		System.out.println("In Reposi class");
		String sql ="select name,emailId,autoPassword from agents where emailId='"+agentBeans.getEmailId()+"' ";
		
		 isemailExistsRowbean = (AgentBeans) jdbcTemplate.queryForObject(sql, new BeanPropertyRowMapper(AgentBeans.class));
		 return isemailExistsRowbean;
	}
}
