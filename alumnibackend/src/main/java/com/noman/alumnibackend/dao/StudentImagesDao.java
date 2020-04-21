package com.noman.alumnibackend.dao;



import com.noman.alumnibackend.dto.StudentImages;


public interface StudentImagesDao {

	public boolean addStudentImage(int applicationId,String verifiedStudentVersityId,StudentImages studentImages);
	public StudentImages getImageCode(int applicationId,String verifiedStudentVersityId);
}
