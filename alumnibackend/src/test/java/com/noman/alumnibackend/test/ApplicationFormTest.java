package com.noman.alumnibackend.test;



import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.noman.alumnibackend.dao.ApplicationFormDao;
import com.noman.alumnibackend.dto.ApplicationForm;

public class ApplicationFormTest {

	private static AnnotationConfigApplicationContext context;
	private static ApplicationFormDao applicationFormDao;
	private ApplicationForm form;
	
	@BeforeClass
	public static void init() {
		
		context = new AnnotationConfigApplicationContext();
		context.scan("com.noman.alumnibackend");
		context.refresh();
		
		
		applicationFormDao = (ApplicationFormDao)context.getBean("applicationFormDao");
		
	}
	
/*	@Test
	public void testSaveApplicationForm() {
		
		form = new ApplicationForm();
		form.setHscBoard("Dhaka");
		form.setHscRoll("121504");
		form.setVersitySession("2011-2012");
		form.setVersityId("IT-12046");
		assertEquals("Successfull", true, applicationFormDao.saveApplicationForm(form));
	}
	*/
/*	@Test
	public void testGetApplicationForm() {
		
		//List<ApplicationForm> list = applicationFormDao.getApplicationForms();
		assertEquals("Successfull", 4,applicationFormDao.getApplicationForms().size());
		//System.out.println(list.size());
	}*/
	
	@Test
	public void testGiveApplicationForm() {
		
		//List<ApplicationForm> list = applicationFormDao.getApplicationForms();
		/*assertEquals("Successfull", ,applicationFormDao.getApplicationForms().size());*/
		//System.out.println(list.size());
		form = applicationFormDao.giveApplicationFormById(36);
		System.out.println(form.getFatherName());
	}
	
	
	
}