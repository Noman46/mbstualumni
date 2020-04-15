package com.noman.mbstualumni.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.noman.alumnibackend.dao.VerifiedStudentDao;
import com.noman.alumnibackend.dto.ApplicationForm;
import com.noman.alumnibackend.dto.VerifiedStudent;

@Controller
public class LoginPageController {

	@Autowired
	public VerifiedStudentDao verifiedStudentDao;
	
	@RequestMapping(value = {"/loginmbstu"})
	public ModelAndView giveLoginPage() {
		
		ModelAndView mv = new ModelAndView("loginmbstu");
		mv.addObject("verifiedStudent", new VerifiedStudent());
		return mv;
		
	}
	
	@RequestMapping(value = {"/student/loginToProfile"})
	public ModelAndView logintoTheSystem(@ModelAttribute("VerifiedStudent") VerifiedStudent verifiedStudent) {
		
		VerifiedStudent getStudentFromDb = verifiedStudentDao.loginToSystemAsStudent(verifiedStudent);
		if(getStudentFromDb != null) {
			ModelAndView studentProfilePage = new ModelAndView("studentProfilePage");
			return studentProfilePage;
			
		}
		else {
			ModelAndView success = new ModelAndView("success");
			return success;
		}
			
		
		
	}
}
