package com.springboot.dummy.middleware.model;

import java.util.List;

public class CustomerDetails {

	private String custId;
	private Customer customer;
	private List<Product> productList;

	public CustomerDetails() {

	}

	public String getCustId() {
		return custId;
	}

	public void setCustId(String custId) {
		this.custId = custId;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public List<Product> getProductList() {
		return productList;
	}

	public void setProductList(List<Product> productList) {
		this.productList = productList;
	}

	@Override
	public String toString() {
		return "CustomerDetails [custId=" + custId + ", customer=" + customer + ", productList=" + productList + "]";
	}

}
