package com.docker.SpringbootDocker.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Home {

	@GetMapping("/home")
	public String home() {
		return "<h1>Welcome to Home page</h1>";
	}

	@GetMapping("/contact")
	public String contact() {
		return "<h1>Contact Fahad</h1>";
	}

	@GetMapping("/about")
	public String about() {
		return "<h1>Welcome to About page</h1>";
	}
}
