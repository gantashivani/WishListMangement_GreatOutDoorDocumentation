package com.cg.go.exceptions;

@SuppressWarnings("serial")
public class UserIdNotFound extends Exception {
	public UserIdNotFound(String errorMsg){
		super(errorMsg);
	}
}