package com.noman.alumnibackend.dao;

import com.noman.alumnibackend.dto.ApplicationForm;

public interface VerifiedStudentDao {

	public boolean saveVerifiedStdent(ApplicationForm applicationForm);
}
