package com.security.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GitController {

	@GetMapping("/hai")
	public String hello() {
		return "HELLO";
	}
}
