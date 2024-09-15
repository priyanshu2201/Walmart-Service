package com.walmart.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class User {  // signup

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	@Column
	private String fName;
	@Column
	private String lName;
	@Column
	private String emailId;
	@Column
	private char gender;
	@Column
	private String password;
	
	
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	public User(int id, String fName, String lName, String emailId, char gender, String password) {
		super();
		this.id = id;
		this.fName = fName;
		this.lName = lName;
		this.emailId = emailId;
		this.gender = gender;
		this.password=password;
	}
	
	
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getfName() {
		return fName;
	}
	public void setfName(String fName) {
		this.fName = fName;
	}
	public String getlName() {
		return lName;
	}
	public void setlName(String lName) {
		this.lName = lName;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public char getGender() {
		return gender;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	@Override
	public String toString() {
		return "SignUp [id=" + id + ", fName=" + fName + ", lName=" + lName + ", emailId=" + emailId + ", gender="
				+ gender + "]";
	}
	
	
}
