package com.Capgemini.BookstoreManagement.Entity;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import org.springframework.beans.factory.annotation.Autowired;

@Entity
public class Customer {
	
	@Id
	private int customerId;
	
	private String email; 
	private String mobileNumber;
	private String fullName;
	private String password;
	@OneToOne
	private Address address;
	private LocalDate registerOn;
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	public String getFullName() {
		return fullName;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public LocalDate getRegisterOn() {
		return registerOn;
	}
	public void setRegisterOn(LocalDate registerOn) {
		this.registerOn = registerOn;
	}
	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + ", email=" + email + ", mobileNumber=" + mobileNumber
				+ ", fullName=" + fullName + ", password=" + password + ", address=" + address + ", registerOn="
				+ registerOn + "]";
	}
	
	//user id, and password.  email. fname,lname, location. 
	
	

}
