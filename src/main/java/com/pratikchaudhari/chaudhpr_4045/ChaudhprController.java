package com.pratikchaudhari.chaudhpr_4045;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.pratikchaudhari.dto.SpecimenDTO;
import com.pratikchaudhari.service.ISpecimenService;


@Controller
public class ChaudhprController {

	@Autowired
	private ISpecimenService specimenServiceStub;
	
	
//	Handle the /index end point
	
	@RequestMapping(value="/index", method=RequestMethod.GET)
	public String read(Model model) {
		SpecimenDTO specimenDTO = specimenServiceStub.fetchById(36);
		model.addAttribute("specimenDTO", specimenDTO);
		return "start";
	}
	
//	Read loyalty=blue
	
	@RequestMapping(value="/index", method=RequestMethod.GET, params= {"loyalty=blue"})
	public String readBlue() {
		return "start";
	}
	
//	Read loyalty=silver
	
	@RequestMapping(value="/index", method=RequestMethod.GET, params= {"loyalty=silver"})
	public String readSilver() {
		return "start";
	}
	
//	Read Header
	
	@RequestMapping(value="/index", method=RequestMethod.GET, headers= {"content-type=text/json"})
	public String readJSON() {
		return "start";
	}
	
	@PostMapping(value="/index")
	public String create() {
		return "start";
	}
	
//	Handle the / end point
	
//	@RequestMapping("/")
//	public String index() {
//		return "start";
//	}

}
