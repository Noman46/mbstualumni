package com.noman.alumnibackend.dao;

import java.util.List;

import com.noman.alumnibackend.dto.StudentPersonalInformation;

public interface StudentPersonalInformationDao {
	
	public boolean saveStudentPersonalInformation(StudentPersonalInformation studentPersonalInformation);
	public List<Object[]> getStudentByBloodGroup(String bloodGroup);

}
