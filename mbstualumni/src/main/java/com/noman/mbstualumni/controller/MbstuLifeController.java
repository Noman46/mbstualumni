package com.noman.mbstualumni.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MbstuLifeController {

	@RequestMapping(value= {"/student/mbstulife"})
	public ModelAndView giveMbstuLife() {
		ModelAndView mv = new ModelAndView("mbstulife");
		return mv;
		
	}
}
