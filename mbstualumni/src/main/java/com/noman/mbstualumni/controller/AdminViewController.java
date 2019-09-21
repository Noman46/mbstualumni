package com.noman.mbstualumni.controller;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.noman.alumnibackend.dao.ApplicationFormDao;

@Controller
public class AdminViewController {

	@Autowired
	public ApplicationFormDao applicationFormDao;

	@RequestMapping(value = { "/adminView" }, method = RequestMethod.GET)
	public ModelAndView getAdminView() {

		int i = applicationFormDao.getApplicationForms().size();
		ModelAndView mv = new ModelAndView("admin_view");
		mv.addObject("size", i);

		return mv;
	}

	@RequestMapping("/test")
	public String testAjax() {

		return "test";
	}
	/*
	 * @RequestMapping("/test/date")
	 * 
	 * @ResponseBody public String getTime(){
	 * 
	 * Date d = new Date(); return d.toString();
	 * 
	 * }
	 */

	@RequestMapping(value = { "/adminView1" }, method = RequestMethod.GET)
	@ResponseBody
	public String getAdminView1() {

		Integer numberOfApplications = applicationFormDao.getApplicationForms().size();
		if (numberOfApplications > 0) {
			return numberOfApplications.toString();

		} else
			return "";
	}
	
	@RequestMapping (value = {"/listOfApplicationForm"})
	public ModelAndView giveListOfApplicationForm() {
		
		ModelAndView mv = new ModelAndView("listOfApplication");
		return mv;
		
	}
}
