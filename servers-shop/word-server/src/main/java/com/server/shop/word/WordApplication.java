package com.server.shop.word;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;


@SpringBootApplication
@EnableEurekaClient
public class WordApplication {
	 public static void main(String[] args) {
	        SpringApplication.run(WordApplication.class, args);
	    }
}
