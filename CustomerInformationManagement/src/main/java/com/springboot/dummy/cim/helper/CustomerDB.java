package com.springboot.dummy.cim.helper;

import java.util.HashMap;
import java.util.Map;

import com.springboot.dummy.cim.exception.ResourceNotFoundException;
import com.springboot.dummy.cim.model.CustomerInfo;

public class CustomerDB {

	private static Map<String, CustomerInfo> customerMap = null;

	private CustomerDB() {

	}

	static {
		customerMap = new HashMap<String, CustomerInfo>();

		CustomerInfo custInfo1 = CustomerInfoFactory.getCustomerInfo1();
		CustomerInfo custInfo2 = CustomerInfoFactory.getCustomerInfo2();
		CustomerInfo custInfo3 = CustomerInfoFactory.getCustomerInfo3();

		customerMap.put(custInfo1.getCustId(), custInfo1);
		customerMap.put(custInfo2.getCustId(), custInfo2);
		customerMap.put(custInfo3.getCustId(), custInfo3);
	}

	public static CustomerInfo getCustomerInfo(String custId) {

		CustomerInfo custInfo = customerMap.get(custId);

		if (null == custInfo) {
			throw new ResourceNotFoundException("custId + " + custId + " not found");
		}

		return custInfo;
	}

}
