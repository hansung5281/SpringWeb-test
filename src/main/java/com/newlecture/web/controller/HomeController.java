package com.newlecture.web.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
	@RequestMapping("/index")
	public String asdf() {
		System.out.println("income");
		return "Hello Sung~! 변경77";
	}
	@RequestMapping("/index2")
	public String aaa() {
		System.out.println("income");
		return "Hello Sung2~!";
	}
}
