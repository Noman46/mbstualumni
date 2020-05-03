package com.noman.mbstualumni.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.noman.alumnibackend.dao.StudentImagesDao;
import com.noman.alumnibackend.dao.StudentPostDao;
import com.noman.alumnibackend.dto.StudentPost;

@Controller

public class StudentProfilePageController {

	@Autowired
	public StudentImagesDao studentImagesDao;
	@Autowired
	public StudentPostDao studentPostDao;
	
	@RequestMapping(value = { "/student/studentProfilePage" })
	public ModelAndView giveStudentProfilePage(@RequestParam("applicationId") Integer applicationId,
			@RequestParam("verifiedStudentVersityId") String verifiedStudentVersityId) {

		String imageCode = studentImagesDao.getImageCode(applicationId, verifiedStudentVersityId);
		ModelAndView studentProfilePage = new ModelAndView("studentProfilePage");
		studentProfilePage.addObject("imageCode", imageCode);
		
		
		return studentProfilePage;

	}
	
	
	// To save The Student Post.
	@RequestMapping(value = "/student/savePost", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Boolean> saveStudentPost(
			@RequestBody StudentPost studentPost,HttpServletRequest request) {
         
		studentPostDao.saveStudentPost(studentPost);
		System.out.println("For Studnt Post -----");
		return new ResponseEntity<Boolean>(true, HttpStatus.CREATED);
	}
}
