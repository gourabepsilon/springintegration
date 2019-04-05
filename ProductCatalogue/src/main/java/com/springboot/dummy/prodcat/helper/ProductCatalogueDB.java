package com.springboot.dummy.prodcat.helper;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.springboot.dummy.prodcat.exception.ResourceNotFoundException;
import com.springboot.dummy.prodcat.model.ProductInfo;

public class ProductCatalogueDB {

	private static Map<String, List<ProductInfo>> prodCatMap = null;

	static {
		prodCatMap = new HashMap<String, List<ProductInfo>>();
		prodCatMap.put("9812567865", ProductInfoFactory.getProductInfoList());
		prodCatMap.put("9812567868", ProductInfoFactory.getProductInfoList());
		prodCatMap.put("9812567869", ProductInfoFactory.getProductInfoList());
	}

	private ProductCatalogueDB() {

	}

	public static List<ProductInfo> getProductInfoList(String custId) throws ResourceNotFoundException {

		List<ProductInfo> productInfoList = prodCatMap.get(custId);
		if (null == productInfoList) {
			throw new ResourceNotFoundException("custId " + custId + " not found in product DB");
		}

		return productInfoList;
	}

}
