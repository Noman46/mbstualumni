package com.noman.mbstualumni.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class LoginPageController {

	@RequestMapping(value = {"/loginmbstu"})
	public ModelAndView login() {
		
		ModelAndView mv = new ModelAndView("loginmbstu");
		return mv;
		
	}
}
