package com.springboot.dummy.middleware.service;

import org.springframework.messaging.Message;
import org.springframework.stereotype.Component;

@Component
public class TestChannelContent {

	public TestChannelContent() {
		
	}
	
	//@ServiceActivator(inputChannel="testContentChannel", outputChannel="agressionOutputChannel")
	public Message<?> testContent(Message<?> msg) {
			
		System.out.println("************ Start of Service Activator ************");
			
		System.out.println("correlationId " + msg.getHeaders().get("correlationId"));
		System.out.println("PayloadDetails " + msg.getPayload());
		
		
		System.out.println("************ End of Service Activator ************");
		
		return msg;
	}
	
	 

}
