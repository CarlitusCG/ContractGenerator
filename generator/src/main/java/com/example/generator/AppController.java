package com.example.generator;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppController {

	@GetMapping("hello")
	public String handle() {
		return "hello world!";
	}

	@GetMapping("/")
    public String root() {
        return "App is running!";
    }
}
