package com.webCodingChallenge.services;

import java.util.ArrayList;
import java.util.List;

import com.webCodingChallenge.dao.DaoOperations;
import com.webCodingChallenge.dao.DaoOperationsImpl;
import com.webCodingChallenge.exceptions.DaoException;
import com.webCodingChallenge.model.User;

public class LoginCheck {
	public List<User> validateLogin(String userName, String password) {
		DaoOperations daoOperations =new DaoOperationsImpl();
		List<User> userDetails= new ArrayList<User>();
		try {
			boolean verify=daoOperations.loginCheckDao(userName,password);
		if (verify==true) {
		userDetails=daoOperations.Fetch(userName);
		for (User user : userDetails) {
			System.out.println("in services");
			System.out.println(user);
			
		}
		}
		else {
			userDetails=null;
			System.out.println("wrong credentials");
			
		}
		} catch (DaoException e) {
			// TODO Auto-generated catch block
		
		}
		
		return userDetails ;
		
		
			
		
		
	}

}
