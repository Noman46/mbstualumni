package com.noman.mbstualumni.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class StudentProfilePageController {

	@RequestMapping(value = {"/student/studentProfilePage"})
	public ModelAndView giveStudentProfilePage(@RequestParam("applicationId")Integer applicationId,
			                                   @RequestParam("verifiedStudentVersityId")String verifiedStudentVersityId){
		System.out.println(applicationId);
		System.out.println(verifiedStudentVersityId);
		ModelAndView studentProfilePage = new ModelAndView("studentProfilePage");
		return studentProfilePage;
		
	}
}
