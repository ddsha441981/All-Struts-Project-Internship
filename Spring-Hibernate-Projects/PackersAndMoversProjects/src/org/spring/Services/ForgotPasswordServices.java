package org.spring.Services;

import org.spring.DaoImpl.ForgotPasswordDao;
import org.spring.dto.AgentBeans;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ForgotPasswordServices {

	@Autowired(required = true)
	ForgotPasswordDao forgotPasswordDao;
	
	public AgentBeans agentsForgotsPasswordFetch(AgentBeans agentBeans){
		
		return forgotPasswordDao.agentsForgotsPasswordFetch(agentBeans);
	}
}
