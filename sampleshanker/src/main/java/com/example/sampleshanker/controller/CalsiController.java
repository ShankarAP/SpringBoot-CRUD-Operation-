package com.example.sampleshanker.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/calci")
public class CalsiController {

	@GetMapping("/add/{a}/{b}")
	public String add(@PathVariable int a,@PathVariable int b) {
		return "the addition of "+ a +" & "+b +" "+ " is  "+(a+b);
	}
	
	@GetMapping("/sub/{a}/{b}")
	public String sub(@PathVariable int a,@PathVariable int b) {
		return "The subtraction of "+ a +" & "+b +" "+ " is  "+(a-b);
	}
	
	
	@GetMapping("/mul/{a}/{b}")
	public String mul(@PathVariable int a,@PathVariable int b) {
		return "The multiplication of "+ a +" & "+b +" "+ " is  "+(a*b);
	}
	
	@GetMapping("/div/{a}/{b}")
	public String div(@PathVariable int a,@PathVariable int b) {
		return "The division of "+ a +" & "+b +" "+ " is  "+(a/b);
	}
}
