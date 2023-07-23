package com.spring.crud.request;

public class UserRequest {

	private String userName;

	private String organistationName;

	private String courseName;

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getOrganistationName() {
		return organistationName;
	}

	public void setOrganistationName(String organistationName) {
		this.organistationName = organistationName;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

}
