package com.springboot.dummy.middleware.transformer;

import java.util.Arrays;
import java.util.List;

import org.springframework.messaging.Message;
import org.springframework.stereotype.Component;

import com.springboot.dummy.middleware.model.Customer;
import com.springboot.dummy.middleware.model.CustomerDetails;
import com.springboot.dummy.middleware.model.Product;

@Component
public class CustomerTransformer {

	public CustomerDetails toCustomerDetails(Message<?> message) {

		System.out.println("Start forming CustomerDetails");

		CustomerDetails customerDetails = new CustomerDetails();

		@SuppressWarnings("unchecked")
		List<Object> list = (List<Object>) message.getPayload();

		customerDetails.setCustId(message.getHeaders().get("correlationId").toString());
		customerDetails.setCustomer((Customer) list.get(0));
		customerDetails.setProductList(Arrays.asList((Product[]) list.get(1)));

		System.out.println("Formed Customer Details");
		return customerDetails;
	}

}
