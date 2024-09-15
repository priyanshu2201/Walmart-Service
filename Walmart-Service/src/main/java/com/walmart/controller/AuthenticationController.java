package com.walmart.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.walmart.model.Login;
import com.walmart.model.User;
import com.walmart.service.AuthenticationService;

@RestController
public class AuthenticationController {

	@Autowired
	private AuthenticationService authenticationService;

	@GetMapping("/test")
	public void test() {
		System.out.println("Get mapping run");
	}

	@PostMapping("/signUpUser")
	public Boolean addUser(@RequestBody User user) {

		boolean flag = authenticationService.addUser(user);

		return flag;
	}

	@PostMapping("/loginUser")
	public Boolean checkUserLogin(@RequestBody Login login) {
		System.out.println("8**********");
		boolean flag = authenticationService.checkUserLogin(login);

		return flag;
	}
	
	@PostMapping("/checkUserEmailId")
	public String checkUserEmailId(@RequestBody  String email) {
		System.out.println("dddddddddddddddddd:"+email);
		return authenticationService.checkEmailId(email);
	}
}
