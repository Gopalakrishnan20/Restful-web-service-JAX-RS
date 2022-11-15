package com.mphasis.jersey.messenger.domain;

import java.util.Date;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class User {

	private int userId;
	private String name;
	private String username;
	private String email;
	private String mobile;
	private Date dob;
	public User(int userId, String name, String username, String email, String mobile, Date dob) {
		super();
		this.userId = userId;
		this.name = name;
		this.username = username;
		this.email = email;
		this.mobile = mobile;
		this.dob = dob;
	}
	public User() {
		super();
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	@Override
	public String toString() {
		return "User [userId=" + userId + ", name=" + name + ", username=" + username + ", email=" + email + ", mobile="
				+ mobile + ", dob=" + dob + "]";
	}
	
	
}
