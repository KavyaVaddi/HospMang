package com.example.controller;

//import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControllerExample {

	@RequestMapping("/welcome")
	public String welcome() {
		return "welcome to Spring mvc";
	}
}
