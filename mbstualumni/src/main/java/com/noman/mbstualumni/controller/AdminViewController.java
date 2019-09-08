package com.noman.mbstualumni.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.noman.alumnibackend.dao.ApplicationFormDao;
import com.noman.alumnibackend.dto.ApplicationForm;

@Controller
public class AdminViewController {

	@Autowired
	public ApplicationFormDao applicationFormDao;

	@RequestMapping(value = { "/adminView" }, method = RequestMethod.GET)
	public ModelAndView getAdminView() {
		
		int i = applicationFormDao.getApplicationForms().size();
		ModelAndView mv = new ModelAndView("admin_view");
		mv.addObject("size", i );
		

		return mv;
	}
}
