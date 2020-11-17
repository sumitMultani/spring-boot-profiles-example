package com.example.springbootprofilesexample.config;

import javax.annotation.PostConstruct;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@Profile("!test")
public class AppConfig {

	@PostConstruct
	public void print() {
		System.out.println("Welcome to my channel Gain Java Knowledge.");
	}
}
