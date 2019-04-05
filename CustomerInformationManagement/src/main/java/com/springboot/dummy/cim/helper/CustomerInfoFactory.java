package com.springboot.dummy.cim.helper;

import java.util.ArrayList;
import java.util.List;

import com.springboot.dummy.cim.model.CustomerInfo;

public class CustomerInfoFactory {

	private static List<CustomerInfo> customerInfoList = null;

	static {
		customerInfoList = new ArrayList<CustomerInfo>();

		CustomerInfo custInfo1 = new CustomerInfo();
		custInfo1.setCustId("9812567865");
		custInfo1.setCustName("Gourab");
		custInfo1.setCustGender("Male");
		custInfo1.setCustAge("78");
		custInfo1.setCustAddress("India");

		CustomerInfo custInfo2 = new CustomerInfo();
		custInfo2.setCustId("9812567868");
		custInfo2.setCustName("Alex");
		custInfo2.setCustGender("Male");
		custInfo2.setCustAge("31");
		custInfo2.setCustAddress("France");

		CustomerInfo custInfo3 = new CustomerInfo();
		custInfo3.setCustId("9812567869");
		custInfo3.setCustName("Sujan");
		custInfo3.setCustGender("Female");
		custInfo3.setCustAge("29");
		custInfo3.setCustAddress("Mumbai");

		customerInfoList.add(custInfo1);
		customerInfoList.add(custInfo2);
		customerInfoList.add(custInfo3);
	}

	private CustomerInfoFactory() {

	}

	public static CustomerInfo getCustomerInfo1() {
		return customerInfoList.get(0);
	}

	public static CustomerInfo getCustomerInfo2() {
		return customerInfoList.get(1);
	}

	public static CustomerInfo getCustomerInfo3() {
		return customerInfoList.get(2);
	}

}
