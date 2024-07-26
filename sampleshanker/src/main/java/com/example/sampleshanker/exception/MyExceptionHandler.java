package com.example.sampleshanker.exception;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class MyExceptionHandler {

	@ExceptionHandler(ArithmeticException.class)
	public String Exception(ArithmeticException exception) 
	{
		return "This is arthemetic exception";
	}
}
