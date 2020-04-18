package com.noman.alumnibackend.dto;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

@Entity
public class StudentJobInformation {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int jobInfoId;
	//private String versityId;
	private String companyName1;
	private String jobPosition1;
	private String jobDuration1;
	private String companyName2;
	private String jobPosition2;
	private String jobDuration2;
	private String companyName3;
	private String jobPosition3;
	private String jobDuration3;
	private String companyName4;
	private String jobPosition4;
	private String jobDuration4;
	private String favouriteQoute;
	@CreationTimestamp
	private LocalDate created_at;
	@UpdateTimestamp
	private LocalDate updated_at;
	
	
	public int getJobInfoId() {
		return jobInfoId;
	}
	public void setJobInfoId(int jobInfoId) {
		this.jobInfoId = jobInfoId;
	}
/*	public String getVersityId() {
		return versityId;
	}
	public void setVersityId(String versityId) {
		this.versityId = versityId;
	}*/
	public String getCompanyName1() {
		return companyName1;
	}
	public void setCompanyName1(String companyName1) {
		this.companyName1 = companyName1;
	}
	public String getJobPosition1() {
		return jobPosition1;
	}
	public void setJobPosition1(String jobPosition1) {
		this.jobPosition1 = jobPosition1;
	}
	public String getJobDuration1() {
		return jobDuration1;
	}
	public void setJobDuration1(String jobDuration1) {
		this.jobDuration1 = jobDuration1;
	}
	public String getCompanyName2() {
		return companyName2;
	}
	public void setCompanyName2(String companyName2) {
		this.companyName2 = companyName2;
	}
	public String getJobPosition2() {
		return jobPosition2;
	}
	public void setJobPosition2(String jobPosition2) {
		this.jobPosition2 = jobPosition2;
	}
	public String getJobDuration2() {
		return jobDuration2;
	}
	public void setJobDuration2(String jobDuration2) {
		this.jobDuration2 = jobDuration2;
	}
	public String getCompanyName3() {
		return companyName3;
	}
	public void setCompanyName3(String companyName3) {
		this.companyName3 = companyName3;
	}
	public String getJobPosition3() {
		return jobPosition3;
	}
	public void setJobPosition3(String jobPosition3) {
		this.jobPosition3 = jobPosition3;
	}
	public String getJobDuration3() {
		return jobDuration3;
	}
	public void setJobDuration3(String jobDuration3) {
		this.jobDuration3 = jobDuration3;
	}
	public String getCompanyName4() {
		return companyName4;
	}
	public void setCompanyName4(String companyName4) {
		this.companyName4 = companyName4;
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
		return "StudentJobInformation [jobInfoId=" + jobInfoId + ", companyName1=" + companyName1 + ", jobPosition1="
				+ jobPosition1 + ", jobDuration1=" + jobDuration1 + ", companyName2=" + companyName2 + ", jobPosition2="
				+ jobPosition2 + ", jobDuration2=" + jobDuration2 + ", companyName3=" + companyName3 + ", jobPosition3="
				+ jobPosition3 + ", jobDuration3=" + jobDuration3 + ", companyName4=" + companyName4 + ", jobPosition4="
				+ jobPosition4 + ", jobDuration4=" + jobDuration4 + ", favouriteQoute=" + favouriteQoute
				+ ", created_at=" + created_at + ", updated_at=" + updated_at + "]";
	}
	
	
	
	

	
	
	
	

}