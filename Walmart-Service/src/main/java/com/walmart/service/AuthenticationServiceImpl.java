package com.walmart.service;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.walmart.dao.AuthenticationRepo;
import com.walmart.model.Login;
import com.walmart.model.User;

@Service
public class AuthenticationServiceImpl implements AuthenticationService {

	@Autowired
	private AuthenticationRepo authenticationRepo;

	@Override
	public boolean addUser(User user) {

		boolean flag = false;

		if (user.getEmailId() != null || user.getPassword()!=null || user.getfName() != null || user.getlName() != null) {

			user.setEmailId(user.getEmailId().toLowerCase());
			
			List<User> list = authenticationRepo.findAll();
			long count = list.stream().filter(obj -> obj.getEmailId().equalsIgnoreCase(user.getEmailId())).count();
			System.out.println("count "+count);
			
			if (count == 0) {
				authenticationRepo.save(user);
				flag = true;
			} else {
				flag = false;
			}

		} else {
			flag = false;
		}

		return flag;
	}

	@Override
	public boolean checkUserLogin(Login login) {

		boolean flag = false;

		if (login.getPassword() != null || login.getUserName() != null) {
			List<User> list = authenticationRepo.findAll();
			
			long count = list.stream().filter(obj -> obj.getEmailId().equalsIgnoreCase(login.getUserName()) && obj.getPassword().equals(login.getPassword())  ).count();

			if (count == 0) {
				flag = false;
			} else {
				flag = true;
			}
		} else {
			flag = false;
		}

		return flag;
	}

	@Override
	public String checkEmailId(String email) {
		
		
		List<String> findUserEmailId = authenticationRepo.findUserEmailId(email);
		
		if(findUserEmailId!=null &&  findUserEmailId.size()!=0) {
			System.out.println(findUserEmailId.get(0));
			return findUserEmailId.get(0);
		}
		System.out.println(findUserEmailId);
		return null;    
	}

}
