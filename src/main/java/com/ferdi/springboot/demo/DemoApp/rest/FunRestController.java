package com.ferdi.springboot.demo.DemoApp.rest;

import java.time.LocalDateTime;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {

	@GetMapping("/")
	public String sayHello() {
		return "Spring Boot. Time on server is : " + LocalDateTime.now();
	}
}
