package com.isteer.lifeline.pojos;

import java.io.FileWriter;

import org.json.JSONObject;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.mulesoft.common.agent.file.File;

@JsonAutoDetect
public class BloodRequest {
	
	private long requestID;
	private String loginID;
	private String bloodGroup;
	private String donationType;
	private String whenNeeded;
	private int numUnits;
	private String patientName;
	private String contactPerson;
	private String contactNumber;
	private String doctorName;
	private String doctorContact;
	private String doctorEmailID;
	private long centerID;
	private boolean sharedInSocialMedia;
	private String personalAppeal;
	private String createdOn;
	
	public BloodRequest(){
		
		System.out.println("New Blood Request Object Created");
	}
	
	
	public String toString(){
		return loginID; 
	}


	public long getRequestID() {
		return requestID;
	}


	public void setRequestID(long requestID) {
		this.requestID = requestID;
	}


	public String getLoginID() {
		return loginID;
	}


	public void setLoginID(String loginID) {
		this.loginID = loginID;
	}


	public String getBloodGroup() {
		return bloodGroup;
	}


	public void setBloodGroup(String bloodGroup) {
		this.bloodGroup = bloodGroup;
	}


	public String getDonationType() {
		return donationType;
	}


	public void setDonationType(String donationType) {
		this.donationType = donationType;
	}


	public String getWhenNeeded() {
		return whenNeeded;
	}


	public void setWhenNeeded(String whenNeeded) {
		this.whenNeeded = whenNeeded;
	}


	public int getNumUnits() {
		return numUnits;
	}


	public void setNumUnits(int numUnits) {
		this.numUnits = numUnits;
	}


	public String getPatientName() {
		return patientName;
	}


	public void setPatientName(String patientName) {
		this.patientName = patientName;
	}


	public String getContactPerson() {
		return contactPerson;
	}


	public void setContactPerson(String contactPerson) {
		this.contactPerson = contactPerson;
	}


	public String getContactNumber() {
		return contactNumber;
	}


	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}


	public String getDoctorName() {
		return doctorName;
	}


	public void setDoctorName(String doctorName) {
		this.doctorName = doctorName;
	}


	public String getDoctorContact() {
		return doctorContact;
	}


	public void setDoctorContact(String doctorContact) {
		this.doctorContact = doctorContact;
	}


	public String getDoctorEmailID() {
		return doctorEmailID;
	}


	public void setDoctorEmailID(String doctorEmailID) {
		this.doctorEmailID = doctorEmailID;
	}


	public long getCenterID() {
		return centerID;
	}


	public void setCenterID(long centerID) {
		this.centerID = centerID;
	}


	public boolean isSharedInSocialMedia() {
		return sharedInSocialMedia;
	}


	public void setSharedInSocialMedia(boolean sharedInSocialMedia) {
		this.sharedInSocialMedia = sharedInSocialMedia;
	}


	public String getPersonalAppeal() {
		return personalAppeal;
	}


	public void setPersonalAppeal(String personalAppeal) {
		this.personalAppeal = personalAppeal;
	}


	public String getCreatedOn() {
		return createdOn;
	}


	public void setCreatedOn(String createdOn) {
		this.createdOn = createdOn;
	}
	
//	public static void main(String[] args) {
//		BloodRequest br = new BloodRequest();
//		br.setBloodGroup("B+");
//		br.setCenterID(1234);
//		br.setContactNumber("986565423545");
//		br.setContactPerson("XXX");
//		br.setCreatedOn("2015-10-07");
//		br.setDoctorContact("88745346577");
//		br.setDoctorEmailID("doctor@mail.com");
//		br.setDoctorName("Mathrubudham");
//		br.setDonationType("OnPremises");
//		br.setLoginID("jj_mail.com");
//		br.setNumUnits(3);
//		br.setPatientName("patient");
//		br.setPersonalAppeal("PLease Donate");
//		br.setRequestID("2222A");
//		br.setSharedInSocialMedia(false);
//		br.setWhenNeeded("2015-10-07");
//		
//		JSONObject obj = new JSONObject(br);
//		
//		System.out.println(obj);
//		
//	}
//	
	
}
