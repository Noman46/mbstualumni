package com.noman.alumnibackend.dao;

import com.noman.alumnibackend.dto.AdminInformation;

public interface AdminInformationDao {

	public AdminInformation getAdmin(String username,String password);
}
