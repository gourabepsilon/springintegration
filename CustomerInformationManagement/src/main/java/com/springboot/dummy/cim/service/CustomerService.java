package com.springboot.dummy.cim.service;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.dummy.cim.helper.CustomerDB;
import com.springboot.dummy.cim.model.CustomerInfo;

@RestController
@RequestMapping("custsvc")
public class CustomerService {

	public CustomerService() {

	}

	@GetMapping("/customer/{custId}")
	public CustomerInfo getCustomerByCustId(@PathVariable(value = "custId") String custId) {
		CustomerInfo custInfo = CustomerDB.getCustomerInfo(custId);
		System.out.println("custInfo " + custInfo);
		return custInfo;
	}

}
