package com.noman.mbstualumni.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.noman.alumnibackend.dao.AdminInformationDao;
import com.noman.alumnibackend.dto.AdminInformation;

@Controller
public class AdminLoginController {
     
	@Autowired
	public AdminInformationDao adminInfoDao;
	
	
	
	@RequestMapping(value = { "/testlog" })
	public String getTest() {
		
		AdminInformation ad = adminInfoDao.getAdmin("Uname", "8828828");
		System.out.println(ad.getAdminFatherName());
		return "";
	}
}
