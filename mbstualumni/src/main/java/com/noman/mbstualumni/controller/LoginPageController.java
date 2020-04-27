package com.noman.mbstualumni.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

import com.noman.alumnibackend.dao.VerifiedStudentDao;
import com.noman.alumnibackend.dto.VerifiedStudent;

@Controller

public class LoginPageController {

	@Autowired
	public VerifiedStudentDao verifiedStudentDao;

	@RequestMapping(value = { "/loginmbstu" })
	public ModelAndView giveLoginPage() {

		ModelAndView mv = new ModelAndView("loginmbstu");
		mv.addObject("verifiedStudent", new VerifiedStudent());
		return mv;

	}

	@RequestMapping(value = { "/student/loginToProfile" })
	public String logintoTheSystem(@ModelAttribute("VerifiedStudent") VerifiedStudent verifiedStudent,Model model) {

		VerifiedStudent getStudentFromDb = verifiedStudentDao.loginToSystemAsStudent(verifiedStudent);
		if (getStudentFromDb != null) {
			// addVerifiedStudentWithSession(verifiedStudent, session);
			// ModelAndView studentProfilePage = new ModelAndView("studentProfilePage");
			// return studentProfilePage;
			
			return "redirect:/student/studentProfilePage?" + "applicationId=" + getStudentFromDb.getApplicationId()
					+ "&verifiedStudentVersityId=" + getStudentFromDb.getVerifiedStudentVersityId();

		} else {

			return "success";
		}
	}

	/*
	 * private void addVerifiedStudentWithSession(VerifiedStudent
	 * verifiedStudent,HttpSession session){
	 * 
	 * session.setAttribute("applicationId", verifiedStudent.getApplicationId());
	 * session.setAttribute("verifiedStudentVersityId",
	 * verifiedStudent.getVerifiedStudentId());
	 * 
	 * }
	 */
}
