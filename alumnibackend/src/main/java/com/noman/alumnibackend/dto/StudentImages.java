package com.noman.alumnibackend.dto;

import java.io.Serializable;
//import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.UUID;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Transient;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
import org.springframework.web.multipart.MultipartFile;

@Entity
public class StudentImages implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int studentImageId;
	private int applicationId;
	private String verifiedStudentVersityId;
	private String code;

	public String getCode() {
		return code;
	}

	public int getApplicationId() {
		return applicationId;
	}

	public void setApplicationId(int applicationId) {
		this.applicationId = applicationId;
	}

	public String getVerifiedStudentVersityId() {
		return verifiedStudentVersityId;
	}

	public void setVerifiedStudentVersityId(String verifiedStudentVersityId) {
		this.verifiedStudentVersityId = verifiedStudentVersityId;
	}

	public void setCode(String code) {
		this.code = code;
	}
	public StudentImages() {
		
		this.code = "STU" + UUID.randomUUID().toString().substring(26).toUpperCase();
		
	}

	@Transient
	private MultipartFile File;

	@CreationTimestamp
	private LocalDateTime created_at;

	@UpdateTimestamp
	private LocalDateTime updated_at;

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

	public LocalDateTime getCreated_at() {
		return created_at;
	}

	public void setCreated_at(LocalDateTime created_at) {
		this.created_at = created_at;
	}

	public LocalDateTime getUpdated_at() {
		return updated_at;
	}

	public void setUpdated_at(LocalDateTime updated_at) {
		this.updated_at = updated_at;
	}

	@Override
	public String toString() {
		return "StudentImages [studentImageId=" + studentImageId + ", File=" + File + ", created_at=" + created_at
				+ ", updated_at=" + updated_at + "]";
	}

}