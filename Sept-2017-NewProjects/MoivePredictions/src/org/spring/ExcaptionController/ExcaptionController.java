package org.spring.ExcaptionController;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ExcaptionController {

	final public static Log logger =LogFactory.getLog(ExcaptionController.class);
	
	@ExceptionHandler(value = Exception.class)
	public String ExcaptionHandler(HttpServletRequest request , Exception exception){
		
		logger.error(" Request " +request.getRequestURI() + "Throw Excaption", exception);
		return "error";
	}
}
