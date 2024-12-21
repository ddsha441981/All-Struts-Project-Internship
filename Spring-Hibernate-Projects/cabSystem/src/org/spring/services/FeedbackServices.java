package org.spring.services;

import java.util.List;

import org.spring.dto.FeedbackBeans;
import org.spring.repositry.FeedbackDaoImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

@Service
public class FeedbackServices {

	@Autowired
	FeedbackDaoImpl feedbackDaoImpl;
	
	public int saveFeedback(FeedbackBeans feedbackBeans){
		
		return feedbackDaoImpl.saveFeedback(feedbackBeans);
	}
	
	public List<FeedbackBeans> feedbackListSelectedData(FeedbackBeans feedbackBeans){
		
		return feedbackDaoImpl.feedbackListSelectedData(feedbackBeans);
	}
	
	public List<FeedbackBeans> usingByIdofTakeFeedbackAction(Integer feedbackId){
		
		return feedbackDaoImpl.usingByIdofTakeFeedbackAction(feedbackId);
	}
	
	public int saveFeedbackActionTakenDatabase(FeedbackBeans feedbackBeans){
		
		return feedbackDaoImpl.saveFeedbackActionTakenDatabase(feedbackBeans);
	}
}
