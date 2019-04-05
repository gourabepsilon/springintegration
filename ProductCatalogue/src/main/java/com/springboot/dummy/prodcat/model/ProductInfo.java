package com.springboot.dummy.prodcat.model;

public class ProductInfo {

	private String productId;
	private String productName;
	private String productDesc;

	public String getProductId() {
		return productId;
	}

	public void setProductId(String productId) {
		this.productId = productId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getProductDesc() {
		return productDesc;
	}

	public void setProductDesc(String productDesc) {
		this.productDesc = productDesc;
	}

	@Override
	public String toString() {
		return "ProductInfo [productId=" + productId + ", productName=" + productName + ", productDesc=" + productDesc
				+ "]";
	}

}
