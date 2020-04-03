package com.noman.alumnibackend.dto;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

@Entity
public class StudentPersonalInformation {

	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int personalInfoId;
	private String studentHobby;
	private String studentBlog;
	private String studentVlog;
	private String studentBloodGroup;
	private String studentGit;
	private String studentFb;
	private String studentLinkedin;
	private String studentIn;
	private String studentTwt;
	private String studentBooks;
	private String jobPosition4;
	private String jobDuration4;
	private String favouriteQoute;
	@CreationTimestamp
	private LocalDate created_at;
	@UpdateTimestamp
	private LocalDate updated_at;
	
	
	
	
	public int getPersonalInfoId() {
		return personalInfoId;
	}
	public void setPersonalInfoId(int personalInfoId) {
		this.personalInfoId = personalInfoId;
	}
	public String getStudentHobby() {
		return studentHobby;
	}
	public void setStudentHobby(String studentHobby) {
		this.studentHobby = studentHobby;
	}
	public String getStudentBlog() {
		return studentBlog;
	}
	public void setStudentBlog(String studentBlog) {
		this.studentBlog = studentBlog;
	}
	public String getStudentVlog() {
		return studentVlog;
	}
	public void setStudentVlog(String studentVlog) {
		this.studentVlog = studentVlog;
	}
	public String getStudentBloodGroup() {
		return studentBloodGroup;
	}
	public void setStudentBloodGroup(String studentBloodGroup) {
		this.studentBloodGroup = studentBloodGroup;
	}
	public String getStudentGit() {
		return studentGit;
	}
	public void setStudentGit(String studentGit) {
		this.studentGit = studentGit;
	}
	public String getStudentFb() {
		return studentFb;
	}
	public void setStudentFb(String studentFb) {
		this.studentFb = studentFb;
	}
	public String getStudentLinkedin() {
		return studentLinkedin;
	}
	public void setStudentLinkedin(String studentLinkedin) {
		this.studentLinkedin = studentLinkedin;
	}
	public String getStudentIn() {
		return studentIn;
	}
	public void setStudentIn(String studentIn) {
		this.studentIn = studentIn;
	}
	public String getStudentTwt() {
		return studentTwt;
	}
	public void setStudentTwt(String studentTwt) {
		this.studentTwt = studentTwt;
	}
	public String getStudentBooks() {
		return studentBooks;
	}
	public void setStudentBooks(String studentBooks) {
		this.studentBooks = studentBooks;
	}
	public String getJobPosition4() {
		return jobPosition4;
	}
	public void setJobPosition4(String jobPosition4) {
		this.jobPosition4 = jobPosition4;
	}
	public String getJobDuration4() {
		return jobDuration4;
	}
	public void setJobDuration4(String jobDuration4) {
		this.jobDuration4 = jobDuration4;
	}
	public String getFavouriteQoute() {
		return favouriteQoute;
	}
	public void setFavouriteQoute(String favouriteQoute) {
		this.favouriteQoute = favouriteQoute;
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
		return "StudentPersonalInformation [personalInfoId=" + personalInfoId + ", studentHobby=" + studentHobby
				+ ", studentBlog=" + studentBlog + ", studentVlog=" + studentVlog + ", studentBloodGroup="
				+ studentBloodGroup + ", studentGit=" + studentGit + ", studentFb=" + studentFb + ", studentLinkedin="
				+ studentLinkedin + ", studentIn=" + studentIn + ", studentTwt=" + studentTwt + ", studentBooks="
				+ studentBooks + ", jobPosition4=" + jobPosition4 + ", jobDuration4=" + jobDuration4
				+ ", favouriteQoute=" + favouriteQoute + ", created_at=" + created_at + ", updated_at=" + updated_at
				+ "]";
	}
	
	
	
	
}
