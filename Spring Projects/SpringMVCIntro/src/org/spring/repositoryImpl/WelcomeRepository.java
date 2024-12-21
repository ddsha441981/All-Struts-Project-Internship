package org.spring.repositoryImpl;

import org.spring.bean.User;
import org.springframework.stereotype.Repository;

@Repository
public class WelcomeRepository {
	
	
	public void saveData(User user){
		System.out.println("Name : "+user.getName());
		System.out.println("Contact : "+user.getContact());
		System.out.println("Email : "+user.getEmail());
		System.out.println("This is to save data");
	}
}
