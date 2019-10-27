package com.noman.alumnibackend.dao;

import com.noman.alumnibackend.dto.AdminInformation;

public interface AdminInformtionDao {

	
	public AdminInformation getAdminInformation(String username, String password);
}
