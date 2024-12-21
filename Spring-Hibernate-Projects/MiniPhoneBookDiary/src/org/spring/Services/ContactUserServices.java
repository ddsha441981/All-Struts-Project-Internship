package org.spring.Services;

import java.util.List;

import org.spring.BeansClass.ContactUserBeans;
import org.spring.repositry.ContactUserDaoImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ContactUserServices {

	@Autowired(required = true)
	ContactUserDaoImpl contactUserDaoImpl;
	
	public int addNewContactsSave(ContactUserBeans contactUserBeans){
		
		return contactUserDaoImpl.addNewContactsSave(contactUserBeans);
	}
	
public List<ContactUserBeans> listOfUserContactData(ContactUserBeans contactUserBeans){
		//System.out.println("In Service UserId is"+userId);
		return contactUserDaoImpl.listOfUserContactData(contactUserBeans);
	}
	
	public int deleteUsingById(Integer contactId){
		//System.out.println("In Service UserId is"+userId);
		return contactUserDaoImpl.deleteUsingById(contactId);
	}
	
	public ContactUserBeans selectedDataForEditById(Integer contactId){
		//System.out.println("In Service UserId is"+userId);
		return contactUserDaoImpl.selectedDataForEditById(contactId);
	}
	
}
