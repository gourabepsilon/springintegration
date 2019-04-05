package com.springboot.dummy.middleware.service;

import java.util.Arrays;

import org.springframework.integration.splitter.AbstractMessageSplitter;
import org.springframework.messaging.Message;
import org.springframework.stereotype.Component;

@Component
public class CustomerSplitter extends AbstractMessageSplitter {

	private final String TOKENIZER = ",";

	public CustomerSplitter() {

	}

	@Override
	protected Object splitMessage(Message<?> message) {
		String msisdnList = message.getPayload().toString();
		String[] msisdnArr = msisdnList.split(TOKENIZER);
		return Arrays.asList(msisdnArr);
	}

}
