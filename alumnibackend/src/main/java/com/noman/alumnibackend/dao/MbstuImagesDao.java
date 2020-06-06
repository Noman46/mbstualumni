package com.noman.alumnibackend.dao;

import java.util.List;

import com.noman.alumnibackend.dto.MbstuImages;

public interface MbstuImagesDao {

	public boolean addMbstuImage(MbstuImages image);
	public List<Object[]> getAllTheMbstuImages();
}
