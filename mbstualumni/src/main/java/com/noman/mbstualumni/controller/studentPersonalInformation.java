package com.noman.mbstualumni.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.noman.alumnibackend.dao.StudentJobInformationDao;
import com.noman.alumnibackend.dto.StudentJobInformation;

@Controller
public class studentPersonalInformation {

	@Autowired
	public StudentJobInformationDao studentJobInformationDao;

	@RequestMapping(value = { "/student/personalInformation" })
	public ModelAndView giveStudentPersonalInformationPage() {

		ModelAndView studentPersonalInformation = new ModelAndView("studentPersonalInformation");
		studentPersonalInformation.addObject("studentJobInformation", new StudentJobInformation());
		return studentPersonalInformation;
	}

	@RequestMapping(value = { "/sendStudentJobInformation" }, method = RequestMethod.POST)
	public String sendStudentJobInformation(
			@ModelAttribute("studentJobInformation") StudentJobInformation studentJobInformation, ModelMap model) {
		// ModelAndView mv = new ModelAndView("success");
		// studentJobInformation.setVersityId("IT12046");
		studentJobInformationDao.saveStudentJobInformation(studentJobInformation);

		return "redirect:/jobSavedSuccessfully";
	}

	@RequestMapping(value = { "/jobSavedSuccessfully" }, method = RequestMethod.GET)
	public String jobInformationRedirected(
			@ModelAttribute("studentJobInformation") StudentJobInformation studentJobInformation, ModelMap model) {

		return "studentPersonalInformation";
	}

}
