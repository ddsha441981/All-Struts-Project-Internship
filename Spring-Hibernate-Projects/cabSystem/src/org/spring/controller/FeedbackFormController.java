package org.spring.controller;

import java.util.List;

import org.spring.dto.AddVehicleBeans;
import org.spring.dto.FeedbackBeans;
import org.spring.services.AddVehicleServices;
import org.spring.services.FeedbackServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class FeedbackFormController {

	@Autowired 
	FeedbackServices feedbackServices;
	
	@Autowired
	AddVehicleServices addVehicleServices;
	
	@RequestMapping(value="/feedbackAdd")
	public String feedbackNextPage(AddVehicleBeans addVehicleBeans,Model model){
		List<AddVehicleBeans> vehicleNoList = addVehicleServices.selectVehicleDetails(addVehicleBeans);
		model.addAttribute("vehicleNoList", vehicleNoList);
		return "feedbackForm";
	}
	
	@RequestMapping(value="/savefeedbackdetails")
	public String save(FeedbackBeans feedbackBeans){
		feedbackServices.saveFeedback(feedbackBeans);
		return "welcome";
	}
	
	@RequestMapping(value="/viewFeedbackDetailsData")
	public String allFeedbackDetails(FeedbackBeans feedbackBeans ,Model model){
		List<FeedbackBeans> feedbackList = feedbackServices.feedbackListSelectedData(feedbackBeans);
		model.addAttribute("feedbackList", feedbackList);
		return "viewsFeedbackDetails";
	}
	

	@RequestMapping(value="/feedbackActionTakenByAssuredManger/{feedbackId}")
	public String actionTaken(@PathVariable Integer feedbackId,FeedbackBeans feedbackBeans,Model model){
		
		feedbackBeans.setFeedbackId(feedbackId);
		List<FeedbackBeans> feedbackList = feedbackServices.usingByIdofTakeFeedbackAction(feedbackId);
		model.addAttribute("feedbackList", feedbackList);
		
		return "feedbackTakeAction";
	}
	

	@RequestMapping(value="/saveActionTakenStoreInDatabase")
	public String saveActionTaken(FeedbackBeans feedbackBeans){
		System.out.println(feedbackBeans.getFeedbackId());
		feedbackServices.saveFeedbackActionTakenDatabase(feedbackBeans);
		return "welcome";
	}
}
