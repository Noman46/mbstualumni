package com.noman.alumnibackend.dto;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Transient;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
import org.springframework.web.multipart.MultipartFile;

@Entity
public class StudentImages {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int studentImageId;
	
	@Transient
	private MultipartFile File;
	
	@CreationTimestamp
	private LocalDate created_at;
	
	@UpdateTimestamp
	private LocalDate updated_at;

	
	
	public int getStudentImageId() {
		return studentImageId;
	}

	public void setStudentImageId(int studentImageId) {
		this.studentImageId = studentImageId;
	}

	public MultipartFile getFile() {
		return File;
	}

	public void setFile(MultipartFile file) {
		File = file;
	}

	public LocalDate getCreated_at() {
		return created_at;
	}

	public void setCreated_at(LocalDate created_at) {
		this.created_at = created_at;
	}

	public LocalDate getUpdated_at() {
		return updated_at;
	}

	public void setUpdated_at(LocalDate updated_at) {
		this.updated_at = updated_at;
	}

	@Override
	public String toString() {
		return "StudentImages [studentImageId=" + studentImageId + ", File=" + File + ", created_at=" + created_at
				+ ", updated_at=" + updated_at + "]";
	}
	
	
	
	
	
}