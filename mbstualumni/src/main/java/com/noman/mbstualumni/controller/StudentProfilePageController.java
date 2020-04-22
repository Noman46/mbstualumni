package com.noman.mbstualumni.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.noman.alumnibackend.dao.StudentImagesDao;
import com.noman.alumnibackend.dto.StudentImages;

@Controller
public class StudentProfilePageController {

	@Autowired
	public StudentImagesDao studentImagesDao;
	
	@RequestMapping(value = { "/student/studentProfilePage" })
	public ModelAndView giveStudentProfilePage(@RequestParam("applicationId") Integer applicationId,
			@RequestParam("verifiedStudentVersityId") String verifiedStudentVersityId) {

		StudentImages image = studentImagesDao.getImageCode(applicationId, verifiedStudentVersityId);
		ModelAndView studentProfilePage = new ModelAndView("studentProfilePage");
		studentProfilePage.addObject("imageCode", image.getCode());
		
		
		return studentProfilePage;

	}
}
