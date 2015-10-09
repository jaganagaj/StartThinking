package com.isteer.lifeline.pojos;

import java.io.Serializable;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.databind.annotation.JacksonStdImpl;


@JsonAutoDetect
public class UserRequest implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String loginID;
	private String name;
	private String DateofBirth;
	private String bloodGroup;
	private String lastDonatedOn;
	private String emailID;
	private String contactNumber;
	private String authProvider;
	private Address addressIDWork;
	private Address addressIDHome;
	private String createdOn;
	private String updatedOn; 
	
	
	public UserRequest(){
		super();
	}
	

	public String getLoginID() {
		return loginID;
	}

	public void setLoginID(String loginID) {
		this.loginID = loginID;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDateofBirth() {
		return DateofBirth;
	}

	public void setDateofBirth(String dateofBirth) {
		DateofBirth = dateofBirth;
	}

	public String getBloodGroup() {
		return bloodGroup;
	}

	public void setBloodGroup(String bloodGroup) {
		this.bloodGroup = bloodGroup;
	}

	public String getLastDonatedOn() {
		return lastDonatedOn;
	}

	public void setLastDonatedOn(String lastDonatedOn) {
		this.lastDonatedOn = lastDonatedOn;
	}

	public String getEmailID() {
		return emailID;
	}

	public void setEmailID(String emailID) {
		this.emailID = emailID;
	}

	public String getContactNumber() {
		return contactNumber;
	}

	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}

	public String getAuthProvider() {
		return authProvider;
	}

	public void setAuthProvider(String authProvider) {
		this.authProvider = authProvider;
	}

	public Address getAddressIDWork() {
		return addressIDWork;
	}

	public void setAddressIDWork(Address addressIDWork) {
		this.addressIDWork = addressIDWork;
	}

	public Address getAddressIDHome() {
		return addressIDHome;
	}

	public void setAddressIDHome(Address addressIDHome) {
		this.addressIDHome = addressIDHome;
	}

	public String getCreatedOn() {
		return createdOn;
	}

	public void setCreatedOn(String createdOn) {
		this.createdOn = createdOn;
	}

	public String getUpdatedOn() {
		return updatedOn;
	}

	public void setUpdatedOn(String updatedOn) {
		this.updatedOn = updatedOn;
	}
	
	@JsonAnySetter
	public void handleUnknown(String key, Object value) {
	   System.out.println("Key ::: " + key);
	}
	
	public String toString(){
		return loginID+","+name+","+bloodGroup+","+ DateofBirth +","+ lastDonatedOn +"," + emailID +"," + contactNumber 
				+"," +authProvider + "," + addressIDWork + "," + addressIDHome + "," + createdOn + "," + updatedOn;
	}

}
