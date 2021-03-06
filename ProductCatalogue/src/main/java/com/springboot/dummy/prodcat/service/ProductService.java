package com.springboot.dummy.prodcat.service;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.dummy.prodcat.helper.ProductCatalogueDB;
import com.springboot.dummy.prodcat.model.ProductInfo;

@RestController
@RequestMapping("prodsvc")
public class ProductService {

	@GetMapping("/productList/{custId}")
	public List<ProductInfo> getProductListByCustId(@PathVariable(value = "custId") String custId) {

		List<ProductInfo> productInfoList = ProductCatalogueDB.getProductInfoList(custId);
		System.out.println("productInfoList " + productInfoList);
		return productInfoList;
	}
}
