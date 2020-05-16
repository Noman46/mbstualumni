package com.noman.alumnibackend.dao;

import java.util.List;

import com.noman.alumnibackend.dto.StudentPost;

public interface StudentPostDao {

	public boolean saveStudentPost(StudentPost studentPost); 
	public List<Object[]> getPosts();
}
