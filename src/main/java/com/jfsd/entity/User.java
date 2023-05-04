package com.jfsd.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

@Entity
public class User {

	@Id
	@NotNull
	private String userid;
	@NotNull
	private String uname;
	@NotNull
	private String pwd;
	@NotNull
	private String gender;
	@NotNull
	private String address;
	@NotNull
	private String phone;
	@NotNull
	private String role;
	public String getUserid() {
		return userid;
	}
	public void setUserid(String userid) {
		this.userid = userid;
	}
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	@Override
	public String toString() {
		return "User [userid=" + userid + ", uname=" + uname + ", pwd=" + pwd + ", gender=" + gender + ", address="
				+ address + ", phone=" + phone + ", role=" + role + "]";
	}
	public boolean isPresent() {
		// TODO Auto-generated method stub
		return false;
	}
	
	
	
}
