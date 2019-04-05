package com.springboot.dummy.middleware.model;

public class Customer {

	private String custId;
	private String custName;
	private String custGender;
	private String custAge;
	private String custAddress;

	public Customer() {

	}

	public String getCustId() {
		return custId;
	}

	public void setCustId(String custId) {
		this.custId = custId;
	}

	public String getCustName() {
		return custName;
	}

	public void setCustName(String custName) {
		this.custName = custName;
	}

	public String getCustGender() {
		return custGender;
	}

	public void setCustGender(String custGender) {
		this.custGender = custGender;
	}

	public String getCustAge() {
		return custAge;
	}

	public void setCustAge(String custAge) {
		this.custAge = custAge;
	}

	public String getCustAddress() {
		return custAddress;
	}

	public void setCustAddress(String custAddress) {
		this.custAddress = custAddress;
	}

	@Override
	public String toString() {
		return "Customer [custId=" + custId + ", custName=" + custName + ", custGender=" + custGender + ", custAge="
				+ custAge + ", custAddress=" + custAddress + "]";
	}

}
