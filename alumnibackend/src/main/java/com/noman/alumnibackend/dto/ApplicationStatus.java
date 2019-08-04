package com.noman.alumnibackend.dto;

import java.util.Date;

public class ApplicationStatus {
	
	private int applicationStatusId;
	private int applicationId;
	private String versityId;
	private boolean applicationStatus;
	private Date applicationCheckedDate;
	public int getApplicationStatusId() {
		return applicationStatusId;
	}
	public void setApplicationStatusId(int applicationStatusId) {
		this.applicationStatusId = applicationStatusId;
	}
	public int getApplicationId() {
		return applicationId;
	}
	public void setApplicationId(int applicationId) {
		this.applicationId = applicationId;
	}
	public String getVersityId() {
		return versityId;
	}
	public void setVersityId(String versityId) {
		this.versityId = versityId;
	}
	public boolean isApplicationStatus() {
		return applicationStatus;
	}
	public void setApplicationStatus(boolean applicationStatus) {
		this.applicationStatus = applicationStatus;
	}
	public Date getApplicationCheckedDate() {
		return applicationCheckedDate;
	}
	public void setApplicationCheckedDate(Date applicationCheckedDate) {
		this.applicationCheckedDate = applicationCheckedDate;
	}
	
	

}
