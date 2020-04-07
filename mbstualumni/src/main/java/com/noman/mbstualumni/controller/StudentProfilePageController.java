package com.noman.mbstualumni.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class StudentProfilePageController {

	@RequestMapping(value = {"/student/studentProfilePage"})
	public ModelAndView giveStudentProfilePage() {
		ModelAndView studentProfilePage = new ModelAndView("studentProfilePage");
		return studentProfilePage;
		
	}
}
