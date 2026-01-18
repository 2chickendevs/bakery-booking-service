package com.twochickendevs.bakerybookingservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication(scanBasePackages = {"com.twochickendevs"})
@EnableTransactionManagement
@EnableFeignClients(basePackages = {"com.twochickendevs"})
public class BakeryBookingServiceApplication {

	static void main(String[] args) {
		SpringApplication.run(BakeryBookingServiceApplication.class, args);
	}
}
