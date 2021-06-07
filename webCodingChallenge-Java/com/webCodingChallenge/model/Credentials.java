package com.webCodingChallenge.model;

public class Credentials {
	private String userName;
	private String Password;
	public Credentials() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Credentials(String userName, String password) {
		super();
		this.userName = userName;
		Password = password;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return Password;
	}
	public void setPassword(String password) {
		Password = password;
	}
	@Override
	public String toString() {
		return "Credentials [userName=" + userName + ", Password=" + Password + "]";
	}
	

}
