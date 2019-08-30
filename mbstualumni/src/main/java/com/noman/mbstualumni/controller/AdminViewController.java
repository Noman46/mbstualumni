package com.noman.mbstualumni.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class AdminViewController {

	@RequestMapping(value = { "/adminView" }, method = RequestMethod.GET)
	public ModelAndView getAdminView() {

		ModelAndView mv = new ModelAndView("admin_view");
		

		return mv;
	}
}
