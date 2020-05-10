package com.cg.go.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;


@ControllerAdvice
public class MyControllerAdvice extends ResponseEntityExceptionHandler{
	
	@ExceptionHandler(Exception.class)
	public final ResponseEntity<ErrorMessage> userNotFound(Exception ex){
		ErrorMessage exceptionResponse = new ErrorMessage("User not found");
		return new ResponseEntity<ErrorMessage>(exceptionResponse, HttpStatus.OK);
	}
	

	
class ErrorMessage{
	private String message;
	
	public ErrorMessage(String message) {
		super();
		this.message = message;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public ErrorMessage() {
		super();
	}
}
}
