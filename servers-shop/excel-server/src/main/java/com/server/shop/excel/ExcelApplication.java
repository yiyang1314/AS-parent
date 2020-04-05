package com.server.shop.excel;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;



@SpringBootApplication
@EnableEurekaClient
public class ExcelApplication {
	 public static void main(String[] args) {
	        SpringApplication.run(ExcelApplication.class, args);
	    }
}
