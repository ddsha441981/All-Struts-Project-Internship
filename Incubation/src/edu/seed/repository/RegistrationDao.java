package edu.seed.repository;

//import java.util.ArrayList;
import java.util.List;
//import java.util.Map;

import edu.seed.dto.BatchBean;
import edu.seed.dto.LoginBean;
import edu.seed.dto.RegistrationBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class RegistrationDao {

	@Autowired(required=true)
	JdbcTemplate jdbcTemplate;

	

	public void setJdbcTemp(JdbcTemplate jdbcTemp) {
		this.jdbcTemplate = jdbcTemp;
	}

	public int Registration(RegistrationBean regbean)
	{
		 String sql="(insert into register_f values ())";  
		    return jdbcTemplate.update(sql);  
		    
	}


	public Boolean register(RegistrationBean registrationBean) {
		System.out.println("------In dao------");
		Boolean registerBeanRow = null;
		try
		{
		
				/*System.out.println(registrationBean.getUserid());
				System.out.println(registrationBean.getName());
				System.out.println(registrationBean.getContactno());
				System.out.println(registrationBean.getEmail());
				System.out.println(registrationBean.getStatus());
				
				System.out.println(registrationBean.getCity());
				System.out.println(registrationBean.getIntern_type());
				System.out.println(registrationBean.getUsername());
				System.out.println(registrationBean.getPassword());
				System.out.println(registrationBean.getRoleid());
				System.out.println(registrationBean.getPm_id());
				System.out.println(registrationBean.getB_id());
				System.out.println(registrationBean.getG_id());
				System.out.println(registrationBean.getP_id());*/
		 String sql="insert into register_f (userid,name,contactno,email,status,city,intern_type,username,password,roleid,pm_id,b_id)values(userid.NEXTVAL,'"+registrationBean.getName()+"','"+registrationBean.getContactno()+"','"+registrationBean.getEmail()+"','"+registrationBean.getStatus()+"','"+registrationBean.getCity()+"','"+registrationBean.getIntern_type()+"','"+registrationBean.getUsername()+"','"+registrationBean.getPassword()+"','"+registrationBean.getRoleid()+"','"+registrationBean.getPm_id()+"','"+registrationBean.getB_id()+"')";
		 System.out.println(sql);
		 jdbcTemplate.update(sql);
		System.out.println("Inserted successfully..");
		return registerBeanRow;
		}
		catch (Exception e) {
		e.printStackTrace();
		}
		return registerBeanRow;
	}

public List<BatchBean> getBatchId(int pm_id ){
		
	String sql = "SELECT b_id,b_name FROM batch_f where pm_id='"+pm_id+"'";
	    List<BatchBean> batch_id_list  = jdbcTemplate.query(sql,new BeanPropertyRowMapper(BatchBean.class));
			return batch_id_list;
		
	}
public BatchBean batch(BatchBean batchBean) {
	System.out.println(" batch dao--");
	BatchBean batchBeanRow = null;
	try
	{
	
			System.out.println(batchBean.getB_id());
			System.out.println(batchBean.getB_name());
			System.out.println(batchBean.getB_startdate());
			System.out.println(batchBean.getB_enddate());
			System.out.println(batchBean.getB_status());
			
			System.out.println(batchBean.getPm_id());
			
	 String sql="insert into batch_f values(b_id.NEXTVAL,'"+batchBean.getB_name()+"','"+batchBean.getB_startdate()+"','"+batchBean.getB_enddate()+"','"+batchBean.getB_status()+"','"+batchBean.getPm_id()+"')";
	jdbcTemplate.update(sql);
	System.out.println("Inserted successfully..");
	return batchBeanRow;
	}
	catch (Exception e) {
	e.printStackTrace();
	}
	return batchBeanRow;
}


	

	
}
