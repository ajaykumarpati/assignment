package com.winjit.assignment.model;

import org.springframework.stereotype.Component;

@Component
public class Response {

	private String reversedString;

	public String getReversedString() {
		return reversedString;
	}

	public void setReversedString(String reversedString) {
		this.reversedString = reversedString;
	}

	public Response(String reversedString) {
		super();
		this.reversedString = reversedString;
	}

	public Response() {
		super();
	}

}
