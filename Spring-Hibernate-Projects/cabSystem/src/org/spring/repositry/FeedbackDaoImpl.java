package org.spring.repositry;

import java.util.List;

import org.spring.dto.FeedbackBeans;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class FeedbackDaoImpl {

	@Autowired
	JdbcTemplate jdbcTemplate;

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	public int saveFeedback(FeedbackBeans feedbackBeans) {

		String sql = "insert into feedback values(default,'" + feedbackBeans.getName() + "','"
				+ feedbackBeans.getEmailId() + "','" + feedbackBeans.getMobNo() + "','" + feedbackBeans.getVehicleNo()
				+ "','" + feedbackBeans.getCabArrived() + "','" + feedbackBeans.getCabCondition() + "','"
				+ feedbackBeans.getDriverSkills() + "','" + feedbackBeans.getDriverBehavior() + "','"
				+ feedbackBeans.getCabExperience() + "','" + feedbackBeans.getComplaint() + "','none')";
		return jdbcTemplate.update(sql);
	}

	public List<FeedbackBeans> feedbackListSelectedData(FeedbackBeans feedbackBeans){
		
		String sql ="select * from feedback";
		List<FeedbackBeans> feedbackList = jdbcTemplate.query(sql,new BeanPropertyRowMapper(FeedbackBeans.class));
		return feedbackList;
	}
	
	public List<FeedbackBeans> usingByIdofTakeFeedbackAction(Integer feedbackId){
		
		String sql ="select * from feedback where feedbackId=?";
		System.out.println(sql);
		List<FeedbackBeans> feedbackList =  jdbcTemplate.query(sql,new Object[]{feedbackId},new BeanPropertyRowMapper(FeedbackBeans.class));
		System.out.println(feedbackList.toString()); 
		return feedbackList;
	}
	
	public int saveFeedbackActionTakenDatabase(FeedbackBeans feedbackBeans){
		
		String sql ="update feedback set query='"+feedbackBeans.getQuery()+"' where feedbackId='"+feedbackBeans.getFeedbackId()+"'";
		System.out.println(sql);
		return jdbcTemplate.update(sql);
	}
}
