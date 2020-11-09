package com.app.mfi.oe.main.model;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class PreviousLoneDetails {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int loan_id;
	private double loan_ammount;
	private double pending_emi;
	private long remaining_ammount;
	private String bk_name;
	private String bk_IFSC_Code;
	
	public int getLoan_id() {
		return loan_id;
	}
	public void setLoan_id(int loan_id) {
		this.loan_id = loan_id;
	}
	public double getLoan_ammount() {
		return loan_ammount;
	}
	public void setLoan_ammount(double loan_ammount) {
		this.loan_ammount = loan_ammount;
	}
	public double getPending_emi() {
		return pending_emi;
	}
	public void setPending_emi(double pending_emi) {
		this.pending_emi = pending_emi;
	}
	public long getRemaining_ammount() {
		return remaining_ammount;
	}
	public void setRemaining_ammount(long remaining_ammount) {
		this.remaining_ammount = remaining_ammount;
	}
	public String getBk_name() {
		return bk_name;
	}
	public void setBk_name(String bk_name) {
		this.bk_name = bk_name;
	}
	public String getBk_IFSC_Code() {
		return bk_IFSC_Code;
	}
	public void setBk_IFSC_Code(String bk_IFSC_Code) {
		this.bk_IFSC_Code = bk_IFSC_Code;
	}
	
	
}
