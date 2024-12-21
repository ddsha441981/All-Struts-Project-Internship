package org.spring.Services;

import org.spring.DaoImpl.AgentRegisterDao;
import org.spring.dto.AgentBeans;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AgentRegisterService {
	
	@Autowired(required = true)
	AgentRegisterDao agentRegisterDao;
	
	public int saveRegisterDataForAgent(AgentBeans agentBeans){
		
		System.out.println("Agent Services");
		
		return agentRegisterDao.saveRegisterDataForAgent(agentBeans);
	}

}
