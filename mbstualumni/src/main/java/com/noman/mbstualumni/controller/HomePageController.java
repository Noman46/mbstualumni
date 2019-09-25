package com.noman.mbstualumni.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomePageController {

	@RequestMapping(value = {"/"})
	public ModelAndView giveHomePage() {
		
		
		ModelAndView home = new ModelAndView("home");
		return home;
	}
}
