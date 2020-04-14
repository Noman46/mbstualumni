package com.noman.mbstualumni.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.noman.alumnibackend.dto.ApplicationForm;

@Controller
public class LoginPageController {

	@RequestMapping(value = {"/loginmbstu"})
	public ModelAndView giveLoginPage() {
		
		ModelAndView mv = new ModelAndView("loginmbstu");
		mv.addObject("applicationForm", new ApplicationForm());
		return mv;
		
	}
	
	@RequestMapping(value = {"/student/loginToProfile"})
	public ModelAndView logintoTheSystem() {
		ModelAndView studentProfilePage = new ModelAndView("studentProfilePage");
		return studentProfilePage;
	}
}
