package org.spring.pdfdownload;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PdfController {

	@RequestMapping(value = "/booksContents")
	public String pdffileRedirect(){
		
		return "";
				
	}
}
