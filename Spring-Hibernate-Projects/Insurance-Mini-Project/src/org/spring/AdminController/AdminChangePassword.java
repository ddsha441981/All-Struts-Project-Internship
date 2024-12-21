package org.spring.AdminController;

import javax.servlet.http.HttpServletRequest;

import org.spring.AdminBeans.AdminChangePwdBeans;
import org.spring.AdminDaoImpl.AdminPasswordChangeDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.sun.istack.internal.logging.Logger;

@Controller
public class AdminChangePassword {

	public static Logger  logger = Logger.getLogger(AdminChangePassword.class); 
	
	@Autowired(required = true)
	AdminPasswordChangeDao passwordChangeDao;
	
	@RequestMapping(value ="/changeOwnPasswordByAdmin",method = RequestMethod.POST)
	
	public String changePassword(AdminChangePwdBeans changePwdBeans,Model model,HttpServletRequest request){
	
		logger.info("Admin Change Password Method SuccessFully Executed");
		System.out.println("Here ChangePassword method executed");
		int userId = (int) request.getSession().getAttribute("adminId");
		changePwdBeans.setUserId(userId);
		System.out.println("Here ChangePassword UserId Is"+userId);
		passwordChangeDao.adminPasswordChangeAndUpdates(changePwdBeans);
		
		logger.info("Admin Password SuccessFully Changed");
		
		model.addAttribute("msg", "Admin Password SuccessFully Changed");
		return "adminProfile";
	}
}
