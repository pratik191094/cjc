package com.app.mfi.oe.main.model;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import javax.persistence.Lob;


@Entity
public class DocumentDetails {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int documentid;
	private String custid;
	@Lob
	private byte [] adharCard;
	@Lob
	private byte [] panCard;
	@Lob
	private byte [] photo;
	@Lob
	private byte [] signature;
	@Lob
	private byte [] addressProof;
	@Lob
	private byte [] bankStatement;
	@Lob
	private byte [] bankcheck;
	
	public int getDocumentid() {
		return documentid;
	}
	public void setDocumentid(int documentid) {
		this.documentid = documentid;
	}
	public byte[] getAdharCard() {
		return adharCard;
	}
	public void setAdharCard(byte[] adharCard) {
		this.adharCard = adharCard;
	}
	public byte[] getPanCard() {
		return panCard;
	}
	public void setPanCard(byte[] panCard) {
		this.panCard = panCard;
	}
	public byte[] getPhoto() {
		return photo;
	}
	public void setPhoto(byte[] photo) {
		this.photo = photo;
	}
	public byte[] getSignature() {
		return signature;
	}
	public void setSignature(byte[] signature) {
		this.signature = signature;
	}
	public byte[] getAddressProof() {
		return addressProof;
	}
	public void setAddressProof(byte[] addressProof) {
		this.addressProof = addressProof;
	}
	public byte[] getBankStatement() {
		return bankStatement;
	}
	public void setBankStatement(byte[] bankStatement) {
		this.bankStatement = bankStatement;
	}
	
	public byte[] getBankcheck() {
		return bankcheck;
	}
	public void setBankcheck(byte[] bankcheck) {
		this.bankcheck = bankcheck;
	}
	public String getCustid() {
		return custid;
	}
	public void setCustid(String custid) {
		this.custid = custid;
	}
	
	
}