package org.spring.repositry;

import java.util.List;

import org.spring.BeansClass.ContactUserBeans;
import org.spring.BeansClass.UserRegisterBeans;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class AdminviewUserListDaoImpl {

	@Autowired(required =true)
	JdbcTemplate jdbcTemplate;
	
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	
public List<UserRegisterBeans>adminViewListUserList(UserRegisterBeans userRegisterBeans){
		
	String sql ="select * from user1234";
	//System.out.println("Sql Query"+sql);
	List<UserRegisterBeans> userList =  jdbcTemplate.query(sql, new BeanPropertyRowMapper(UserRegisterBeans.class));
		System.out.println("]]]]]]]]]]]]]]]]]]]]]]]]]]"+userList.toString());
	return userList;
	}

public List<ContactUserBeans>adminViewContactsListById(int userId){
	
	String sql ="select * from phoneBook where userId=?";
//	System.out.println("Sql Query"+sql);
	List<ContactUserBeans> contactList =  jdbcTemplate.query(sql,new Object[]{userId},new BeanPropertyRowMapper(ContactUserBeans.class));
	//System.out.println("]]]]]]]]]]]]]]]]]]]]]]]]]]"+contactList.toString());
	return contactList;
	}
	
}
