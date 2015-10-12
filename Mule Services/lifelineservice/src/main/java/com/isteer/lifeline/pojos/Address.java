package com.isteer.lifeline.pojos;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonAutoDetect
public class Address implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private long addressId;
	private String addressLine;
	private String city;
	private String pINCode;
	private String state;
	private String country;
	private String landMark;
	private double latitude;
	private double longitude;
    
	
	
	public long getAddressId() {
		return addressId;
	}



	public void setAddressId(long addressId) {
		this.addressId = addressId;
	}



	public String getAddressLine() {
		return addressLine;
	}



	public void setAddressLine(String addressLine) {
		this.addressLine = addressLine;
	}



	public String getCity() {
		return city;
	}



	public void setCity(String city) {
		this.city = city;
	}



	public String getpINCode() {
		return pINCode;
	}



	public void setpINCode(String pINCode) {
		this.pINCode = pINCode;
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



	public String getLandMark() {
		return landMark;
	}



	public void setLandMark(String landMark) {
		this.landMark = landMark;
	}



	public double getLatitude() {
		return latitude;
	}



	public void setLatitude(double latitude) {
		this.latitude = latitude;
	}



	public double getLongitude() {
		return longitude;
	}



	public void setLongitude(double longitude) {
		this.longitude = longitude;
	}



	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public String toString(){
		return addressLine+","+city+","+country+","+pINCode;
	}

	@JsonAnySetter
	public void handleUnknown(String key, Object value) {
	   System.out.println("Key ::: " + key);
	}

}
