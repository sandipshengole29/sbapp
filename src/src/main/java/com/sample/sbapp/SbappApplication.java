package com.sample.sbapp;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
public class SbappApplication {

	public static void main(String[] args) {
		final Logger LOGGER = LoggerFactory.getLogger(SbappApplication.class);
		LOGGER.info("***====*** Starting sameple spring boot application ***====***");
		SpringApplication.run(SbappApplication.class, args);
	}

}
