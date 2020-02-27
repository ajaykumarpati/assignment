package com.winjit.assignment.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.winjit.assignment.model.Response;
import com.winjit.assignment.service.Testservice;

@RestController
@RequestMapping("/winjit")
public class Controller {
	
	@Autowired
	Testservice testservice;
	
	@GetMapping(value = { "/checkPalindrome/{string}" }, produces = { "application/json"})
	public ResponseEntity<Response> checkPalindrome(@PathVariable (value = "string")String string)
	{
		Response response = testservice.checkPalindrome(string);
		return new ResponseEntity<>(response, HttpStatus.OK);
	}

}
