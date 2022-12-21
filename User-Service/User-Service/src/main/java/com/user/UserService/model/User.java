package com.user.UserService.model;

//import java.time.LocalDate;
import java.util.List;

//import org.apache.tomcat.jni.Address;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Document(collection="user")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {

	private int id;
	private String  fullName;
	private String gender;
	private String emailId;
	private Long mobileNumber;
	private String role;
	private String password;
	private  List<Address> address;



public User() {

}



	public User(int id, String fullName, String gender, String emailId, Long mobileNumber, String role, String password,
		List<Address> address) {
	super();
	this.id = id;
	this.fullName = fullName;
	this.gender = gender;
	this.emailId = emailId;
	this.mobileNumber = mobileNumber;
	this.role = role;
	this.password = password;
	this.address = address;
}



	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public Long getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(Long mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public List<Address> getAddress() {
		return address;
	}


	public void setAddress(List<Address> address) {
		this.address = address;
	}



}

