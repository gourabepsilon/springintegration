package com.springboot.dummy.middleware.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.integration.support.MessageBuilder;
import org.springframework.messaging.Message;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.PollableChannel;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.dummy.middleware.model.CustomerDetails;

@RestController
@RequestMapping("api/customerMgmt")
public class CustomerManagementApi {

	@Autowired
	@Qualifier("customerInputChannel")
	private MessageChannel customerInputChannel;

	@Autowired
	@Qualifier("customerOutputChannel")
	private PollableChannel customerOutputChannel;

	public CustomerManagementApi() {

	}

	@GetMapping("/customer/{msisdnList}")
	public List<CustomerDetails> getCustomerDetails(@PathVariable(value = "msisdnList") final String msisdnList) {

		Message<String> message = MessageBuilder.withPayload(msisdnList).build();
		System.out.println("Sending to channel");
		customerInputChannel.send(message);
		System.out.println("Sent to channel");

		Message<?> m = customerOutputChannel.receive();
		System.out.println("CorrelationId " + m.getHeaders().get("correlationId"));
		System.out.println("Payload " + m.getPayload().getClass().getName());

		@SuppressWarnings("unchecked")
		ArrayList<CustomerDetails> custDetailsList = (ArrayList<CustomerDetails>) m.getPayload();

		return custDetailsList;
	}

}
