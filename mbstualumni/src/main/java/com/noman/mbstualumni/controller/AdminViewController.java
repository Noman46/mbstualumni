package com.noman.mbstualumni.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.noman.alumnibackend.dao.ApplicationFormDao;
import com.noman.alumnibackend.dto.ApplicationForm;
import com.noman.alumnibackend.utility.EmailSender;

@Controller
public class AdminViewController {

	@Autowired
	public ApplicationFormDao applicationFormDao;
	@Autowired
	public EmailSender sendTheEmail;

	@RequestMapping(value = { "/adminView" }, method = RequestMethod.GET)
	public ModelAndView getAdminView() {

		int i = applicationFormDao.getApplicationForms().size();
		ModelAndView mv = new ModelAndView("admin_view");
		mv.addObject("size", i);

		return mv;
	}

	/*
	 * @RequestMapping("/test") public String testAjax() {
	 * 
	 * return "test"; }
	 * 
	 * @RequestMapping("/test/date")
	 * 
	 * @ResponseBody public String getTime(){
	 * 
	 * Date d = new Date(); return d.toString();
	 * 
	 * }
	 */

	@RequestMapping(value = { "/getApplicationFormNumber" }, method = RequestMethod.GET)
	@ResponseBody
	public String getApplicationFormNumber() {

		Integer numberOfApplications = applicationFormDao.getApplicationForms().size();
		if (numberOfApplications > 0) {
			return numberOfApplications.toString();

		} else
			return "No";
	}

	@RequestMapping(value = { "/listOfApplicationForm" })
	public ModelAndView giveListOfApplicationForm() {
		List<ApplicationForm> forms = applicationFormDao.getApplicationForms();
		// System.out.println(forms.size());
		ModelAndView mv = new ModelAndView("listOfApplication");
		mv.addObject("listofForms", forms);
		return mv;

	}

	@RequestMapping(value = { "/updateApplicationFormStatus" }, method = RequestMethod.GET)
	@ResponseBody
	public String updateApplicationFormStatusr(@RequestParam Integer applicationId) {

		applicationFormDao.updateisActive(applicationId);
		ApplicationForm form = applicationFormDao.giveApplicationFormById(applicationId);
		sendTheEmail.doSendEmailToApplicant(form);
		return "The form is verified and an Email has been sent to"+" "+form.getStudentName();
	}

}
