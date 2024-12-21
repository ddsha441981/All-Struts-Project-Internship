package edu.seed.service;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import edu.seed.dto.EmailSendingBean;
import edu.seed.repository.EmailSendingDao;


@Service
public class RegisterService {
	
	@Autowired(required=true)
	EmailSendingDao emailSendingDao;

	public EmailSendingBean isEmailExists(EmailSendingBean emailSending)
	{
		return emailSendingDao.isEmailExists(emailSending);
		
		
	}
}
