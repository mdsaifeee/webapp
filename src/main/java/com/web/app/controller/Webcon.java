package com.web.app.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Webcon {

	@GetMapping(value = "/show")
	public String show() {
		return "Hi, This is Saifudeen";
	}
}
