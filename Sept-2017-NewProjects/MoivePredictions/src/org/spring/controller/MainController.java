package org.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {

	
	
	@RequestMapping(value = "/mainPageIndex")

	public String indexPageClickingHeader() {

		System.out.println("In Controller");
		return "index";

	}
	
	@RequestMapping(value = "/")

	public String maindata() {

		System.out.println("In Controller");
		return "index";

	}

	@RequestMapping(value = "/showsPageContents")

	public String showsPage() {

		System.out.println("In Shows Controller");
		return "shows";

	}

	@RequestMapping(value = "/historyPageContents")

	public String historyPage() {

		System.out.println("In History Controller");
		return "history";

	}

	
	/*@RequestMapping(value = "/categoryMoivesContents")

	public String CatMoives() {

		System.out.println("In All Moives Controller");
		return "categoryMoives";

	}*/
	
	@RequestMapping(value = "/moivesHindiPageContents")

	public String hindiMoives() {

		System.out.println("In Hindi Moives Controller");
		return "hindiMoives";

	}

	@RequestMapping(value = "/mEnglishPageContents")

	public String englishMoives() {

		System.out.println("In English Moives Controller");
		return "englishMoives";

	}

	@RequestMapping(value = "/moivesChinesePageContents")

	public String chineseMoives() {

		System.out.println("In Chinese Moives Controller");
		return "chineseMoives";

	}

	@RequestMapping(value = "/moivesTeleguPageContents")

	public String teleguMoives() {

		System.out.println("In Telegu Moives Controller");
		return "teleguMoives";

	}
	
	@RequestMapping(value = "/singleVideoPlay")

	public String singleVideoPlay() {

		System.out.println("In Single Player Moives Controller");
		return "single";

	}
	
	@RequestMapping(value = "/uploadVideos")

	public String uploadVideosData() {

		System.out.println("In Upload Videos  Controller");
		return "upload";

	}

}
