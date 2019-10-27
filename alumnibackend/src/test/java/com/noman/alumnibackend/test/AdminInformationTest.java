package com.noman.alumnibackend.test;

import org.junit.BeforeClass;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.noman.alumnibackend.dao.AdminInformtionDao;
import com.noman.alumnibackend.dao.ApplicationFormDao;
import com.noman.alumnibackend.dto.AdminInformation;
import com.noman.alumnibackend.dto.ApplicationForm;

public class AdminInformationTest {
	private static AnnotationConfigApplicationContext context;
	private static AdminInformtionDao adminInformationDao;
	private AdminInformation admininfo;
	
	@BeforeClass
	public static void init() {
		
		context = new AnnotationConfigApplicationContext();
		context.scan("com.noman.alumnibackend");
		context.refresh();
		
		
		adminInformationDao = (AdminInformtionDao)context.getBean("adminInformtionDao");
		
	}
	
}
