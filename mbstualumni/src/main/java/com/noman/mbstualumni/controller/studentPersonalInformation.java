package com.noman.mbstualumni.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class studentPersonalInformation {
	
	
	@RequestMapping(value = {"/student/personalInformation"})
	public ModelAndView giveStudentPersonalInformationPage() {
		
		
		ModelAndView studentPersonalInformation = new ModelAndView("studentPersonalInformation");
		return studentPersonalInformation;
	}

}
