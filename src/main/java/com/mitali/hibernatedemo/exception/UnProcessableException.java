package com.mitali.hibernatedemo.exception;

import org.springframework.http.HttpStatus;

public class UnProcessableException extends RuntimeException{
	
	private static final long serialVersionUID = 1L;
	private final HttpStatus httpStatus;
	private final String message;
	
	public UnProcessableException(HttpStatus httpStatus, String message) {
		this.httpStatus = httpStatus;
		this.message = message;
	}
	public HttpStatus getHttpStatus() {
		return this.httpStatus;
	}
	
	public String getMessage() {
		return this.message;
	}
}
