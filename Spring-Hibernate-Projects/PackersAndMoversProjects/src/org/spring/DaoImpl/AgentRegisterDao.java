package org.spring.DaoImpl;

import org.spring.dto.AgentBeans;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class AgentRegisterDao {
	
	@Autowired(required = true)
	
	JdbcTemplate jdbcTemplate;
	
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	
	public int saveRegisterDataForAgent(AgentBeans agentBeans){
		int count = 0;
		System.out.println("In Agent Register Repositry");
		System.out.println("////////"+agentBeans.getService_Id());
		String sql ="insert into agents values(seqA.nextVal,'"+agentBeans.getName()+"','"+agentBeans.getAutoPassword()+"','"+agentBeans.getEmailId()+"','"+agentBeans.getName_org()+"','"+agentBeans.getMobNo()+"','"+agentBeans.getPhone()+"','"+agentBeans.getPincode()+"','"+agentBeans.getCity()+"','"+agentBeans.getState()+"','"+agentBeans.getService_Id()+"','"+agentBeans.getAddress()+"','agent')";
		
		System.out.println(sql);
		//return  jdbcTemplate.update(sql,agentBeans.getName(),agentBeans.getEmailId(),agentBeans.getAutoPassword(),agentBeans.getName_org(),agentBeans.getMobNo(),agentBeans.getPhone(),agentBeans.getPincode(),agentBeans.getCity(),agentBeans.getState(),agentBeans.getService_Id(),agentBeans.getAddress(),"agent");
		return jdbcTemplate.update(sql); 
	}

}
