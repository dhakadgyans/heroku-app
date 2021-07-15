package com.gyan.spring.auth;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class HerokuController {
	
	RestTemplate rt = new RestTemplate();
	@GetMapping("/")
	public String gethome() {
		return "Welcome to Heroku App";
	}
	@GetMapping("/name/{name}")
	public String gethome1(@PathVariable String name) {
		
		return "<h2>Hello "+name+"</h2><h3><br>Welcome to my First Heroku App.</h3>";
	}
	
	@GetMapping("/name/{name}/{year}")
	public String gethome2(@PathVariable String name, @PathVariable int year) {
		
		int age= rt.getForObject("https://age-calculator-app.herokuapp.com/birth-year/"+year, Integer.class);
		return "<h2>So, "+name+" <br><br>Here is your age. "+"</h2><h1><br>"+age+" years !!!</h1>";
	}
}
