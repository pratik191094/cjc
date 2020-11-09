package com.app.mfi.oe.main.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Bank {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int bank_id;
	private String bank_name;
	private String bank_branch;
	private String bank_accholdername;
	private long bank_accountno;
	private String bank_ifsc;
	private String bank_acctype;
	public int getBank_id() {
		return bank_id;
	}
	public void setBank_id(int bank_id) {
		this.bank_id = bank_id;
	}
	public String getBank_name() {
		return bank_name;
	}
	public void setBank_name(String bank_name) {
		this.bank_name = bank_name;
	}
	public String getBank_branch() {
		return bank_branch;
	}
	public void setBank_branch(String bank_branch) {
		this.bank_branch = bank_branch;
	}
	public String getBank_accholdername() {
		return bank_accholdername;
	}
	public void setBank_accholdername(String bank_accholdername) {
		this.bank_accholdername = bank_accholdername;
	}
	public long getBank_accountno() {
		return bank_accountno;
	}
	public void setBank_accountno(long bank_accountno) {
		this.bank_accountno = bank_accountno;
	}
	public String getBank_ifsc() {
		return bank_ifsc;
	}
	public void setBank_ifsc(String bank_ifsc) {
		this.bank_ifsc = bank_ifsc;
	}
	public String getBank_acctype() {
		return bank_acctype;
	}
	public void setBank_acctype(String bank_acctype) {
		this.bank_acctype = bank_acctype;
	}

	
}
