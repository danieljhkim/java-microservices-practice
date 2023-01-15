package com.practice.rest.webservices.restwebservices.helloworld;

public class HelloWorldBean {
	private String message;
	private String mm;
	
	public HelloWorldBean(String message, String m) {
		this.message = message;
		this.mm = m;
	}
	
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	
	public String getMm() {
		return mm;
	}

	public void setMm(String mm) {
		this.mm = mm;
	}

	@Override
	public String toString() {
		return "HelloWorldBean [message=" + message + "]";
	}
}
