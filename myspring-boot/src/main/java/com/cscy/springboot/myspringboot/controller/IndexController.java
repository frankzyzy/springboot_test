package com.cscy.springboot.myspringboot.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexController {

	@RequestMapping("/index/{id}")
	public String showPage(@PathVariable("id")String id) {
		int n = 0;
		return "Hello Word"+n;
	}
}
