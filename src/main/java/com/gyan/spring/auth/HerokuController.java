package com.gyan.spring.auth;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HerokuController {
	@GetMapping("/")
	public String gethome() {
		return "Welcome to Heroku App";
	}
	@GetMapping("/name/{name}")
	public String gethome1(@PathVariable String name) {
		return "Welcome to Heroku App---> "+name;
	}
}
