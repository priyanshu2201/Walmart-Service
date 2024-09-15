package com.walmart.service;

import com.walmart.model.Login;
import com.walmart.model.User;

public interface AuthenticationService {

	public boolean addUser(User user);

	public boolean checkUserLogin(Login login);
	
	public String checkEmailId(String email);
}
