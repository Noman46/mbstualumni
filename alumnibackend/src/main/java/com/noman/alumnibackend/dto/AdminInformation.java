package com.noman.alumnibackend.dto;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.DateTimeFormat.ISO;

@Entity
public class AdminInformation {
	
	public AdminInformation() {
		
	}
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int adminId;
	private String adminName;
    private String gender;
    private String adminProfessionId;
    private String adminFatherName;
    @DateTimeFormat(iso = ISO.DATE)
    private LocalDate adminDob;
    private String adminMobile;
    private String adminEmail;
    private String adminPassword;
    private String adminUsername;
    @CreationTimestamp
	private LocalDate created_at;
	@UpdateTimestamp
	private LocalDate updated_at;
	public int getAdminId() {
		return adminId;
	}
	public void setAdminId(int adminId) {
		this.adminId = adminId;
	}
	public String getAdminName() {
		return adminName;
	}
	public void setAdminName(String adminName) {
		this.adminName = adminName;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getAdminProfessionId() {
		return adminProfessionId;
	}
	public void setAdminProfessionId(String adminProfessionId) {
		this.adminProfessionId = adminProfessionId;
	}
	public String getAdminFatherName() {
		return adminFatherName;
	}
	public void setAdminFatherName(String adminFatherName) {
		this.adminFatherName = adminFatherName;
	}
	public LocalDate getAdminDob() {
		return adminDob;
	}
	public void setAdminDob(LocalDate adminDob) {
		this.adminDob = adminDob;
	}
	public String getAdminMobile() {
		return adminMobile;
	}
	public void setAdminMobile(String adminMobile) {
		this.adminMobile = adminMobile;
	}
	public String getAdminEmail() {
		return adminEmail;
	}
	public void setAdminEmail(String adminEmail) {
		this.adminEmail = adminEmail;
	}
	public String getAdminPassword() {
		return adminPassword;
	}
	public void setAdminPassword(String adminPassword) {
		this.adminPassword = adminPassword;
	}
	public String getAdminUsername() {
		return adminUsername;
	}
	public void setAdminUsername(String adminUsername) {
		this.adminUsername = adminUsername;
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
	
	
   

}
