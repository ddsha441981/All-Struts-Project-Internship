package org.spring.repositry;

import java.util.List;

import org.spring.BeansClass.ContactUserBeans;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class ContactUserDaoImpl {

	@Autowired(required = true)
	JdbcTemplate jdbcTemplate;
	
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	
	public int addNewContactsSave(ContactUserBeans contactUserBeans){
		
		System.out.println("In Repositry of Contact List"+contactUserBeans.getUserId());
		String sql ="insert into phoneBook values(seq2.nextVal,'"+contactUserBeans.getFirstName()+"','"+contactUserBeans.getLastName()+"','"+contactUserBeans.getEmail()+"','"+contactUserBeans.getMobNo()+"','"+contactUserBeans.getUserId()+"')";
		
		return jdbcTemplate.update(sql);
		
	}
	
	public List<ContactUserBeans> listOfUserContactData(ContactUserBeans contactUserBeans){
		//System.out.println("%%%%%%%%%%%%%%%%%%%%%%"+contactUserBeans.getUserId());
		String sql="(select * from phoneBook where userId='"+contactUserBeans.getUserId()+"' )";
		//System.out.println("%%%%%%%%%%%%%%%%%%%%%%"+sql);
	
		 List<ContactUserBeans> contactList =  jdbcTemplate.query(sql,new BeanPropertyRowMapper(ContactUserBeans.class));
		//System.out.println("66666666666666666666666666666666"+ contactList.toString());
		 return contactList;
	}
	
	public int deleteUsingById(int contactId){
		int status = 0;
		
		String sql="delete from phoneBook where contactId='"+contactId+"'";
		
		System.out.println("%%%%%%%%%%%%%%%%%%%%%%"+sql);
	
		status = jdbcTemplate.update(sql);
		System.out.println("Heree Sataus Is "+status);
		return status;
		
	}
	
	public ContactUserBeans selectedDataForEditById(int contactId){
		
		String sql="select * from phoneBook where contactId=?";
		
		System.out.println("%%%%%%%%%%%%%%%%%%%%%%"+sql);
		return jdbcTemplate.queryForObject(sql, new Object[]{contactId},new BeanPropertyRowMapper<ContactUserBeans>(ContactUserBeans.class));
		
	}
	
}
