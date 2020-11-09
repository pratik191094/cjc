package com.app.mfi.oe.main.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Address {
	@Id
	@GeneratedValue(strategy =  GenerationType.IDENTITY)
	private int addr_id;
	private String cityname;
	private String areaname;
	private int pincode;
	
	
	public int getAddr_id() {
		return addr_id;
	}
	public void setAddr_id(int addr_id) {
		this.addr_id = addr_id;
	}
	public String getCityname() {
		return cityname;
	}
	public void setCityname(String cityname) {
		this.cityname = cityname;
	}
	public String getAreaname() {
		return areaname;
	}
	public void setAreaname(String areaname) {
		this.areaname = areaname;
	}
	public int getPincode() {
		return pincode;
	}
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
	

}
