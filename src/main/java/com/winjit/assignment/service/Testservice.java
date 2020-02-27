package com.winjit.assignment.service;

import org.springframework.stereotype.Service;

import com.winjit.assignment.model.Response;

@Service
public class Testservice {

	public Response checkPalindrome(String string) 
	{
		Response response = null;
		StringBuilder tempStr = new StringBuilder("");
		int length = string.length();
		
		for(int i = length - 1; i >= 0; i--)
        {
			tempStr = tempStr.append(string.charAt(i));
        }
		
		if(tempStr.toString().equalsIgnoreCase(string))
		{
			response = new Response("Palindrome");
		}
		else
        {
			response = new Response("Not Palindrome");
        }
		
		return response;
	}

	
}
