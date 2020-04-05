package com.noman.mbstualumni.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.noman.alumnibackend.dao.StudentJobInformationDao;
import com.noman.alumnibackend.dao.StudentPersonalInformationDao;
import com.noman.alumnibackend.dto.StudentImages;
import com.noman.alumnibackend.dto.StudentJobInformation;
import com.noman.alumnibackend.dto.StudentPersonalInformation;
import com.noman.mbstualumni.util.FileUploadUtility;

@Controller
public class studentPersonalInformation {

	@Autowired
	public StudentJobInformationDao studentJobInformationDao;
	
	@Autowired
	public StudentPersonalInformationDao studentPersonalInformationDao;

	@RequestMapping(value = { "/student/personalInformation" })
	public ModelAndView giveStudentPersonalInformationPage() {

		ModelAndView studentPersonalInformation = new ModelAndView("studentPersonalInformation");

		studentPersonalInformation.addObject("studentJobInformation", new StudentJobInformation());
		studentPersonalInformation.addObject("studentPersonalInformation", new StudentPersonalInformation());
		studentPersonalInformation.addObject("studentImages", new StudentImages());
		
		
		return studentPersonalInformation;
	}

	@RequestMapping(value = { "student/sendStudentJobInformation" }, method = RequestMethod.POST)
	public String sendStudentJobInformation(
			@ModelAttribute("studentJobInformation") StudentJobInformation studentJobInformation, ModelMap model) {

		studentJobInformationDao.saveStudentJobInformation(studentJobInformation);

		return "redirect:/student/personalInformation";
	}


	
	@RequestMapping(value = {"student/sendStudentPersonalInformation"}, method = RequestMethod.POST)
	public String sendStudentPersonalInformation(@ModelAttribute("studentPersonalInformation") StudentPersonalInformation studentPersonalInformation, ModelMap model) {
		
		studentPersonalInformationDao.saveStudentPersonalInformation(studentPersonalInformation);
		return "redirect:/student/personalInformation";
	}
	
	@RequestMapping(value = {"student/sendStudentImage"}, method = RequestMethod.POST)
	public String sendStudentImage(@ModelAttribute("studentImages") StudentImages studentImages, ModelMap model,HttpServletRequest request) {
		
		if(!studentImages.getFile().getOriginalFilename().equals("")) {
			 if(!studentImages.getFile().getOriginalFilename().equals("") ){
				 FileUploadUtility.uploadFile(request, studentImages.getFile()); 
				 }
		}
		return "redirect:/student/personalInformation";
	}
	


}
