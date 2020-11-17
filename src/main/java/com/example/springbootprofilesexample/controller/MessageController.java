package com.example.springbootprofilesexample.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MessageController {

	@Value("${my.message}")
	private String message;
	
	@GetMapping("/message")
	public String getMessage() {
		return message;
	}
}
