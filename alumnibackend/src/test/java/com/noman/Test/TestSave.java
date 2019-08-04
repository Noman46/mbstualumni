package com.noman.Test;



import java.sql.Timestamp;
import java.util.Date;

import com.noman.alumnibackend.dao.ApplicationFormDao;
import com.noman.alumnibackend.daoImpl.ApplicationFormDaoImpl;
import com.noman.alumnibackend.dto.ApplicationForm;

public class TestSave {

	public static void main(String[] args) {
		
	   
		ApplicationFormDao aD = new ApplicationFormDaoImpl();
		ApplicationForm app = new ApplicationForm();
	
		
		
		app.setHscBoard("Barishal");
		app.setHscRoll("IT-12030");
		app.setVersitySession("276276");
		app.setVersityId("76576");
	
		System.out.println(aD.saveApplicationForm(app));
		

	}

}
