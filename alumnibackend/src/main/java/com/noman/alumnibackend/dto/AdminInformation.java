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
	private String admin_name;
	private int gender;
	private String admin_profession_id;
	private String admin_father_name;
	@DateTimeFormat(iso = ISO.DATE)
	private LocalDate admin_DOB;
	private String admin_mobile;
	private String admin_email;
	private String admin_password;
	private String admin_username;
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
	public String getAdmin_name() {
		return admin_name;
	}
	public void setAdmin_name(String admin_name) {
		this.admin_name = admin_name;
	}
	public int getGender() {
		return gender;
	}
	public void setGender(int gender) {
		this.gender = gender;
	}
	public String getAdmin_profession_id() {
		return admin_profession_id;
	}
	public void setAdmin_profession_id(String admin_profession_id) {
		this.admin_profession_id = admin_profession_id;
	}
	public String getAdmin_father_name() {
		return admin_father_name;
	}
	public void setAdmin_father_name(String admin_father_name) {
		this.admin_father_name = admin_father_name;
	}
	public LocalDate getAdmin_DOB() {
		return admin_DOB;
	}
	public void setAdmin_DOB(LocalDate admin_DOB) {
		this.admin_DOB = admin_DOB;
	}
	public String getAdmin_mobile() {
		return admin_mobile;
	}
	public void setAdmin_mobile(String admin_mobile) {
		this.admin_mobile = admin_mobile;
	}
	public String getAdmin_email() {
		return admin_email;
	}
	public void setAdmin_email(String admin_email) {
		this.admin_email = admin_email;
	}
	public String getAdmin_password() {
		return admin_password;
	}
	public void setAdmin_password(String admin_password) {
		this.admin_password = admin_password;
	}
	public String getAdmin_username() {
		return admin_username;
	}
	public void setAdmin_username(String admin_username) {
		this.admin_username = admin_username;
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
