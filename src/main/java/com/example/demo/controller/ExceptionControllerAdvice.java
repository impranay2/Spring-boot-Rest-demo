package com.example.demo.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

@ControllerAdvice
public class ExceptionControllerAdvice {

	@ExceptionHandler(EmployeeNotFoundException.class)
	@ResponseBody
	public ClientErrorInformation exceptionHandler(Exception exception) {
		ClientErrorInformation errorInfo = new ClientErrorInformation();
		errorInfo.setErrorCode(HttpStatus.INTERNAL_SERVER_ERROR.value());
		errorInfo.setMessage(exception.getMessage());
		return errorInfo;
	}
	
}
