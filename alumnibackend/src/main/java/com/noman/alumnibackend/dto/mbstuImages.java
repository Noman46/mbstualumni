package com.noman.alumnibackend.dto;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.hibernate.annotations.CreationTimestamp;

@Entity
public class mbstuImages {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int mbstuImageId;
	private String imageCode;
	private int likes;
	@CreationTimestamp
	private LocalDateTime created_at;
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
	
	
	


}
