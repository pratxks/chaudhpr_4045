package com.pratikchaudhari.chaudhpr_4045;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ChaudhprController {
	
	@RequestMapping("/start")
	public String start() {
		return "start";
	}
	
	@RequestMapping("/")
	public String index() {
		return "start";
	}

}
