package com.app.mfi.oe.main.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;


@Entity
public class Customer {
	@Id
	@GeneratedValue(strategy =  GenerationType.IDENTITY)
	private int cust_id;
	private String cname;	
	private String cmobno;
	private String remark;
	private String cust_emailid;
	private String cust_gender;
	private String cust_dob;
	private int cust_age;
	private String cust_pancard;
	private String cust_adharcard;
	private String cust_qualification;
	private String cust_occupation;
	private double cust_income;
	private String cust_Marital_Status;
	private int cust_noOffamilyMember;
	private int cust_noOfearningMember;
	private String cust_nameOfearningMember;
	private String cust_relation;
	@OneToOne(cascade = CascadeType.ALL)
	private Address cust_addr;
	
	@OneToOne(cascade = CascadeType.ALL)
	private Loan cust_loan;
	
//    @OneToOne(cascade = CascadeType.ALL)
//    private DocumentDetails document;
	
    @OneToOne(cascade=CascadeType.ALL)
    private GuarntorDetails g_details;
    
    @OneToOne(cascade=CascadeType.ALL)
    private Bank bank;

	public Bank getBank() {
		return bank;
	}

	public void setBank(Bank bank) {
		this.bank = bank;
	}

	public int getCust_id() {
		return cust_id;
	}

	public void setCust_id(int cust_id) {
		this.cust_id = cust_id;
	}

	

	public String getCname() {
		return cname;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}

	public String getCmobno() {
		return cmobno;
	}

	public void setCmobno(String cmobno) {
		this.cmobno = cmobno;
	}

	public String getCust_emailid() {
		return cust_emailid;
	}

	public void setCust_emailid(String cust_emailid) {
		this.cust_emailid = cust_emailid;
	}

	public String getCust_gender() {
		return cust_gender;
	}

	public void setCust_gender(String cust_gender) {
		this.cust_gender = cust_gender;
	}

	public String getCust_dob() {
		return cust_dob;
	}

	public void setCust_dob(String cust_dob) {
		this.cust_dob = cust_dob;
	}

	public int getCust_age() {
		return cust_age;
	}

	public void setCust_age(int cust_age) {
		this.cust_age = cust_age;
	}

	public String getCust_pancard() {
		return cust_pancard;
	}

	public void setCust_pancard(String cust_pancard) {
		this.cust_pancard = cust_pancard;
	}

	public String getCust_adharcard() {
		return cust_adharcard;
	}

	public void setCust_adharcard(String cust_adharcard) {
		this.cust_adharcard = cust_adharcard;
	}

	public String getCust_qualification() {
		return cust_qualification;
	}

	public void setCust_qualification(String cust_qualification) {
		this.cust_qualification = cust_qualification;
	}

	public String getCust_occupation() {
		return cust_occupation;
	}

	public void setCust_occupation(String cust_occupation) {
		this.cust_occupation = cust_occupation;
	}

	public double getCust_income() {
		return cust_income;
	}

	public void setCust_income(double cust_income) {
		this.cust_income = cust_income;
	}

	public String getCust_Marital_Status() {
		return cust_Marital_Status;
	}

	public void setCust_Marital_Status(String cust_Marital_Status) {
		this.cust_Marital_Status = cust_Marital_Status;
	}

	public int getCust_noOffamilyMember() {
		return cust_noOffamilyMember;
	}

	public void setCust_noOffamilyMember(int cust_noOffamilyMember) {
		this.cust_noOffamilyMember = cust_noOffamilyMember;
	}

	public int getCust_noOfearningMember() {
		return cust_noOfearningMember;
	}

	public void setCust_noOfearningMember(int cust_noOfearningMember) {
		this.cust_noOfearningMember = cust_noOfearningMember;
	}

	public String getCust_nameOfearningMember() {
		return cust_nameOfearningMember;
	}

	public void setCust_nameOfearningMember(String cust_nameOfearningMember) {
		this.cust_nameOfearningMember = cust_nameOfearningMember;
	}

	public String getCust_relation() {
		return cust_relation;
	}

	public void setCust_relation(String cust_relation) {
		this.cust_relation = cust_relation;
	}

	public Address getCust_addr() {
		return cust_addr;
	}

	public void setCust_addr(Address cust_addr) {
		this.cust_addr = cust_addr;
	}

	public Loan getCust_loan() {
		return cust_loan;
	}

	public void setCust_loan(Loan cust_loan) {
		this.cust_loan = cust_loan;
	}

//	public DocumentDetails getDocument() {
//		return document;
//	}
//
//	public void setDocument(DocumentDetails document) {
//		this.document = document;
//	}

	public GuarntorDetails getG_details() {
		return g_details;
	}

	public void setG_details(GuarntorDetails g_details) {
		this.g_details = g_details;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}
	
	
}
