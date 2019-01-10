package com.okta.developer.spring_boot_postgressql;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EnableTransactionManagement
public class SpringBootPostgressqlApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootPostgressqlApplication.class, args);
	}

}

