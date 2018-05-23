package com.rest.beans;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Member {
	private String name;
	private String phone;
	private String email;
	
	
	
	public Member() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Member(String name, String phone, String email) {
		super();
		this.name = name;
		this.phone = phone;
		this.email = email;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
}
