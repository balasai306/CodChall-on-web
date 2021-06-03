package com.webCodingChallenge.exceptions;

public class ServiceException extends Exception {

	String message;

	public ServiceException(String message) {

		super();
		this.message = message;
	}

	public String getMessage() {
		return message;
	}

}
