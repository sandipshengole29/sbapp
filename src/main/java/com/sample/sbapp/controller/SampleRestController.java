/**
 * 
 */
package com.sample.sbapp.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.Api;

/**
 * @author Sandip
 *
 */

@RestController
@Api(tags = "Sample Rest Controller")
@RequestMapping("/sampleRest")
public class SampleRestController {
	private static final Logger LOGGER = LoggerFactory.getLogger(SampleRestController.class);
	
	@GetMapping(value = "/welcome")
	private String welcomeApplication() {
		String welcomeString = "************ welcome to spring boot application ************";
		LOGGER.info(welcomeString);
		return welcomeString;
	}
}
