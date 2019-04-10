package com.rob.myrestproject.login.entry;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="loginEntry")
public class LoginEntry {

	private String userId;
	private String password;
	
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
}