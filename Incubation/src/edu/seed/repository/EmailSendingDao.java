package edu.seed.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import edu.seed.dto.EmailSendingBean;
@Repository
public class EmailSendingDao {

   @Autowired(required =true)
	private JdbcTemplate template;

	public JdbcTemplate getTemplate() {
		return template;
	}

	public void setTemplate(JdbcTemplate template) {
		this.template = template;
	}


/*  public String selectrecord1(EmailSending emailsend) {
		String sql = "select password from register_f where email= "+emailsend.getEmail()+"";
		 Object[] inputs = new Object[] {emailsend};
	        String emppawd = getTemplate().queryForObject(sql, inputs, String.class);
	        return "emppawd";
		
	}*/
  
  public EmailSendingBean isEmailExists(EmailSendingBean emailSending)
  {
	  EmailSendingBean isemailExistsRowbean =null;
	  String sql = "select email,password from register_f where email= "+emailSending.getEmail()+""; 
	  isemailExistsRowbean = (EmailSendingBean)template.queryForObject(sql,new BeanPropertyRowMapper(EmailSendingBean.class));
	  System.out.println(isemailExistsRowbean);
	return isemailExistsRowbean;
	  
  }
 
		
}


