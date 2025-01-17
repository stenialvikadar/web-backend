package com.stenial;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	@GetMapping("/bakir")
	public String index() {
		return "Greetings from Spring Boot!";
	}
	
	@GetMapping("/bakir/abcs")
	public String abcs(@RequestParam String myFirstParam) {
		return "param: " + myFirstParam;
	}

}
