package com.noman.mbstualumni.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.noman.alumnibackend.dao.MbstuImagesDao;
import com.noman.alumnibackend.dto.MbstuImages;

@Controller
public class MbstuLifeController {

	@Autowired
	public MbstuImagesDao mbstuImagesDao;
	
	@RequestMapping(value= {"/student/mbstulife"})
	public ModelAndView giveMbstuLife() {
		
		List<Object[]> mbstuImages = mbstuImagesDao.getAllTheMbstuImages();
		ModelAndView mv = new ModelAndView("mbstulife");
		mv.addObject("mbstuImages", mbstuImages);
		return mv;
		
	}
}
