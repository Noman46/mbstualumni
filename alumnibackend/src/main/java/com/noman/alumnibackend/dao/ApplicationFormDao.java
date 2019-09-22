package com.noman.alumnibackend.dao;

import java.util.List;


import com.noman.alumnibackend.dto.ApplicationForm;

public interface ApplicationFormDao {

	public boolean saveApplicationForm(ApplicationForm applicationForm);
	public List<ApplicationForm> getApplicationForms();
	
} 
