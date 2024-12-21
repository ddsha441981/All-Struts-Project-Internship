package edu.seed.controller;

import java.math.BigDecimal;
import java.util.List;

import javax.jws.WebParam.Mode;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import edu.seed.dto.GroupBean;
import edu.seed.dto.PlacementBean;
import edu.seed.service.PlacementServices;

@Controller
public class PlacementController {
	
	
	
	
	@Autowired(required=true)
	 PlacementServices placementServices;
	
	
	
	/* This method is used to save the placement data in database
	  
	  @author : AbhaySinghSolanki
	  @param  :  Model to set object of ProjectBean class
	  @return : integer value of the service
	  @since  : 31st April 2017
  	 
	*/
	
	
	@RequestMapping("/savePlacement")
	@ResponseBody
	public int savePlacement(PlacementBean placementBean,HttpServletRequest request,HttpSession session) {
	
		int regIdSession = (Integer) request.getSession().getAttribute("userid");
		placementBean.setUserid(regIdSession);
		int placementId=placementServices.savePlacement(placementBean);
	
		return  placementId;
	}
	// end of savePlacement  details of the method ends here. 
	
	/* This method is used to save the placement data in database
	  
	  @author : AbhaySinghSolanki
	  @param  :  Model to set object of ProjectBean class
	  @return : integer value of the service
	  @since  : 31st April 2017
	 
	*/
	@RequestMapping("/placement")
	public String viewPlacement(PlacementBean placementBean,Model model,HttpServletRequest request,HttpSession session)
	{
		
		
		int userIdSession = (Integer) request.getSession().getAttribute("userid");
		placementBean.setUserid(userIdSession);
		model.addAttribute("placementBean", new PlacementBean());
		
		
		List<PlacementBean> getAllPlacements=placementServices.viewPlacement(userIdSession);

		model.addAttribute("getAllPlacements",getAllPlacements );
		
		
		return "placement";
		}
	
	
	/* This method is use to delete batch details .
	 * @param: Model to set object of PlacementBean class
	 * @return : String response body
	 * @author : Abhay singh solanki
	 * @since : 02-June-2017 */
	@RequestMapping("/deletePlacementdetails")
	@ResponseBody
	public String delete(PlacementBean placementBean,Model model,HttpServletRequest request,HttpSession session)
	{
		int regIdSession = (Integer) request.getSession().getAttribute("userid");
		placementBean.setUserid(regIdSession);
	int deletePlacement=placementServices.deletePlacement(placementBean);
		String deleted;
		if(deletePlacement>0)
			deleted="deleted";
		
		return "placement";
		
	}
	
	
}
