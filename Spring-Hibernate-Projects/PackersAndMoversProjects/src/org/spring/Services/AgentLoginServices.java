package org.spring.Services;

import org.spring.DaoImpl.AgentLoginDao;
import org.spring.dto.AgentBeans;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AgentLoginServices {
	
	@Autowired(required = true)
	AgentLoginDao agentLoginDao;
	
	public int agentLoginMethodCall(AgentBeans agentBeans){
		
		return agentLoginDao.agentLoginMethodCall(agentBeans);
	}

}
