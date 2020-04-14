package com.noman.alumnibackend.dto;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
import org.springframework.stereotype.Component;

@Entity
@Component
public class VerifiedStudent {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int verifiedStudentId;
	private int applicationId;
	private String verifiedStudentEmail;
	private String verifiedStudentPassword;
	private String verifiedStudentVersityId;
	@CreationTimestamp
	private LocalDate created_at;
	@UpdateTimestamp
	private LocalDate updated_at;
	
	
	public int getVerifiedStudentId() {
		return verifiedStudentId;
	}
	public void setVerifiedStudentId(int verifiedStudentId) {
		this.verifiedStudentId = verifiedStudentId;
	}
	public int getApplicationId() {
		return applicationId;
	}
	public void setApplicationId(int applicationId) {
		this.applicationId = applicationId;
	}
	public String getVerifiedStudentEmail() {
		return verifiedStudentEmail;
	}
	public void setVerifiedStudentEmail(String verifiedStudentEmail) {
		this.verifiedStudentEmail = verifiedStudentEmail;
	}
	public String getVerifiedStudentPassword() {
		return verifiedStudentPassword;
	}
	public void setVerifiedStudentPassword(String verifiedStudentPassword) {
		this.verifiedStudentPassword = verifiedStudentPassword;
	}
	public String getVerifiedStudentVersityId() {
		return verifiedStudentVersityId;
	}
	public void setVerifiedStudentVersityId(String verifiedStudentVersityId) {
		this.verifiedStudentVersityId = verifiedStudentVersityId;
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
		return "VerifiedStudent [verifiedStudentId=" + verifiedStudentId + ", applicationId=" + applicationId
				+ ", verifiedStudentEmail=" + verifiedStudentEmail + ", verifiedStudentPassword="
				+ verifiedStudentPassword + ", verifiedStudentVersityId=" + verifiedStudentVersityId + ", created_at="
				+ created_at + ", updated_at=" + updated_at + "]";
	}
	
	
	
	
}
