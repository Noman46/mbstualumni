package com.noman.mbstualumni.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.noman.alumnibackend.dto.ApplicationForm;

@Controller
public class PageController {

	
	
	
	@RequestMapping(value = {"/", "/home","/index"},method=RequestMethod.GET)
	public String index(Model model) {
		model.addAttribute("applicationForm",new ApplicationForm());
		ModelAndView mv = new ModelAndView("application");
		return "application";	
		}
	
}
