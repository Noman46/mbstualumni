package com.noman.alumnibackend.dto;


import java.sql.Timestamp;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class ApplicationForm {
    
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int applicationId;
	private String studentName;
	private String fatherName;
	private String motherName;
	
	
	private Timestamp studentDOB;
	
	private String studentemail;
	private String phone;
	private String hscBoard;
	private String hscRoll;
	private String versitySession;
	private String versityId;
	private boolean isActive;
	private Timestamp created_at;
	private Timestamp updated_at;
	
	
	public boolean isActive() {
		return isActive;
	}
	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}
	public Timestamp getCreated_at() {
		return created_at;
	}
	public void setCreated_at(Timestamp created_at) {
		this.created_at = created_at;
	}
	public Timestamp getUpdated_at() {
		return updated_at;
	}
	public void setUpdated_at(Timestamp updated_at) {
		this.updated_at = updated_at;
	}
	
	
	
	public int getApplicationId() {
		return applicationId;
	}
	public void setApplicationId(int applicationId) {
		this.applicationId = applicationId;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public String getFatherName() {
		return fatherName;
	}
	public void setFatherName(String fatherName) {
		this.fatherName = fatherName;
	}
	public String getMotherName() {
		return motherName;
	}
	public void setMotherName(String motherName) {
		this.motherName = motherName;
	}
	public Timestamp getStudentDOB() {
		return studentDOB;
	}
	public void setStudentDOB(Timestamp studentDOB) {
		this.studentDOB = studentDOB;
	}
	public String getStudentemail() {
		return studentemail;
	}
	public void setStudentemail(String studentemail) {
		this.studentemail = studentemail;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getHscBoard() {
		return hscBoard;
	}
	public void setHscBoard(String hscBoard) {
		this.hscBoard = hscBoard;
	}
	public String getHscRoll() {
		return hscRoll;
	}
	public void setHscRoll(String hscRoll) {
		this.hscRoll = hscRoll;
	}
	public String getVersitySession() {
		return versitySession;
	}
	public void setVersitySession(String versitySession) {
		this.versitySession = versitySession;
	}
	public String getVersityId() {
		return versityId;
	}
	public void setVersityId(String versityId) {
		this.versityId = versityId;
	}
	

}
