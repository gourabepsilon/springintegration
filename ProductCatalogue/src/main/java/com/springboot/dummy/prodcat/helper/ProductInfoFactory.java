package com.springboot.dummy.prodcat.helper;

import java.util.ArrayList;
import java.util.List;

import com.springboot.dummy.prodcat.model.ProductInfo;

public class ProductInfoFactory {

	private static List<ProductInfo> productInfoList = null;

	static {
		productInfoList = new ArrayList<ProductInfo>();

		ProductInfo prodInfo1 = new ProductInfo();
		prodInfo1.setProductId("100");
		prodInfo1.setProductName("data");
		prodInfo1.setProductDesc("Data");

		ProductInfo prodInfo2 = new ProductInfo();
		prodInfo2.setProductId("101");
		prodInfo2.setProductName("voice");
		prodInfo2.setProductDesc("Voice");

		productInfoList.add(prodInfo1);
		productInfoList.add(prodInfo2);
	}

	private ProductInfoFactory() {

	}

	public static List<ProductInfo> getProductInfoList() {

		return productInfoList;
	}
	
	public static void main(String[] args) {
		
		System.out.println(ProductInfoFactory.getProductInfoList());
	}

}
