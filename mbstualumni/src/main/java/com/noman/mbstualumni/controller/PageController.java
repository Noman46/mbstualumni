package com.noman.mbstualumni.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.noman.alumnibackend.dto.ApplicationForm;

@Controller
public class PageController {

	
	
	
	@RequestMapping(value = {"/getApplication"},method=RequestMethod.GET)
	public ModelAndView index() {
		
		ModelAndView mv = new ModelAndView("application");
		mv.addObject("applicationForm",new ApplicationForm());
		
		return mv;	
		}
	
	
	
	@RequestMapping(value = {"/sendApplication"},method=RequestMethod.POST)
	public String sendApplication(@ModelAttribute("applicationForm")ApplicationForm applicationForm,ModelMap model) {
		//ModelAndView mv = new ModelAndView("success");
		
		System.out.println(applicationForm.getStudentName());
		model.addAttribute("studentName", applicationForm.getStudentName());
        model.addAttribute("fatherName", applicationForm.getFatherName());
        model.addAttribute("dob", applicationForm.getStudentDOB());
        model.addAttribute("gen", applicationForm.getGender());
         
        
		
		
		return "success";	
		}
}