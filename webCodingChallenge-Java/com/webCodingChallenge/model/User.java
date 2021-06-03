package com.webCodingChallenge.model;

public class User {
	private int id;
	private String name;
	private String mobileNum;
	private String email;
	private String city;
	private String state;
	private String country;
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	public User(int id, String name, String mobileNum, String email, String city, String state, String country) {
		super();
		this.id = id;
		this.name = name;
		this.mobileNum = mobileNum;
		this.email = email;
		this.city = city;
		this.state = state;
		this.country = country;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMobileNum() {
		return mobileNum;
	}
	public void setMobileNum(String mobileNum) {
		this.mobileNum = mobileNum;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", mobileNum=" + mobileNum + ", email=" + email + ", city=" + city
				+ ", state=" + state + ", country=" + country + "]";
	}
	
	

}
