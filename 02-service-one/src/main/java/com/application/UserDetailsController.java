package com.application;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope
public class UserDetailsController {
	
	@Value("${dburl}")
	private String dbUrl;

	@Value("${username}")
	private String username;
	
	@Value("${password}")
	private String password;
	
	
	
	@GetMapping("/users")
	public String getUserDetails()
	{
		
		 return "{"
	                + "\"dbUrl\": \"" + dbUrl + "\","
	                + "\"username\": \"" + username + "\","
	                + "\"password\": \"" + password + "\""
	                + "}";
	    }	
	


}
