package com.app.mfi.oe.main.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Loan {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int l_id;
	private double l_amount;
	private String l_reason;
	private String l_custname;
	private double l_rateOfintrest;
	private double l_processingfee;
	private double l_emi;
	private long l_tenure;
	private double l_paymfi;
	
	@OneToOne(cascade=CascadeType.ALL)
	private PreviousLoneDetails l_previousLD;

	public int getL_id() {
		return l_id;
	}

	public void setL_id(int l_id) {
		this.l_id = l_id;
	}

	public double getL_amount() {
		return l_amount;
	}

	public void setL_amount(double l_amount) {
		this.l_amount = l_amount;
	}

	public String getL_reason() {
		return l_reason;
	}

	public void setL_reason(String l_reason) {
		this.l_reason = l_reason;
	}

	public String getL_custname() {
		return l_custname;
	}

	public void setL_custname(String l_custname) {
		this.l_custname = l_custname;
	}

	public double getL_rateOfintrest() {
		return l_rateOfintrest;
	}

	public void setL_rateOfintrest(double l_rateOfintrest) {
		this.l_rateOfintrest = l_rateOfintrest;
	}

	public double getL_processingfee() {
		return l_processingfee;
	}

	public void setL_processingfee(double l_processingfee) {
		this.l_processingfee = l_processingfee;
	}

	public double getL_emi() {
		return l_emi;
	}

	public void setL_emi(double l_emi) {
		this.l_emi = l_emi;
	}

	public long getL_tenure() {
		return l_tenure;
	}

	public void setL_tenure(long l_tenure) {
		this.l_tenure = l_tenure;
	}

	public double getL_paymfi() {
		return l_paymfi;
	}

	public void setL_paymfi(double l_paymfi) {
		this.l_paymfi = l_paymfi;
	}

	public PreviousLoneDetails getL_previousLD() {
		return l_previousLD;
	}

	public void setL_previousLD(PreviousLoneDetails l_previousLD) {
		this.l_previousLD = l_previousLD;
	}
	
	
	
	

}
