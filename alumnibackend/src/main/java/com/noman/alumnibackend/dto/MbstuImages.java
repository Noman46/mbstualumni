package com.noman.alumnibackend.dto;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.UUID;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Transient;

import org.hibernate.annotations.CreationTimestamp;
import org.springframework.web.multipart.MultipartFile;

@Entity
public class MbstuImages implements Serializable{
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int mbstuImageId;
	private String imageCode;
	private int likes;
	
	@Transient
	private MultipartFile File;
	@CreationTimestamp
	private LocalDateTime created_at;
	
	
	//Constructor
	
	public MbstuImages() {
		
		this.imageCode = "MBSTU" + UUID.randomUUID().toString().substring(26).toUpperCase();
		
	}
	
	
	
	
	
	
	
	
	
	
	
	// SET & GET
	public int getMbstuImageId() {
		return mbstuImageId;
	}
	public void setMbstuImageId(int mbstuImageId) {
		this.mbstuImageId = mbstuImageId;
	}
	public String getImageCode() {
		return imageCode;
	}
	public void setImageCode(String imageCode) {
		this.imageCode = imageCode;
	}
	public int getLikes() {
		return likes;
	}
	public void setLikes(int likes) {
		this.likes = likes;
	}
	public LocalDateTime getCreated_at() {
		return created_at;
	}
	public void setCreated_at(LocalDateTime created_at) {
		this.created_at = created_at;
	}

	public MultipartFile getFile() {
		return File;
	}

	public void setFile(MultipartFile file) {
		File = file;
	}
	
	
	
	


}
