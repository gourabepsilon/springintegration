package com.springboot.dummy.cim;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.springboot.dummy.cim.service")
public class CustomerInformationManagementApplication {

	public static void main(String[] args) {
		SpringApplication.run(CustomerInformationManagementApplication.class, args);
	}

}
