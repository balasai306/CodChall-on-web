package com.webCodingChallenge.services;

import java.util.ArrayList;
import java.util.List;

import com.webCodingChallenge.dao.DaoOperations;
import com.webCodingChallenge.dao.DaoOperationsImpl;
import com.webCodingChallenge.exceptions.DaoException;

public class LoginCheck {
	public List<String> validateLogin(String userName, String password) {
		DaoOperations daoOperations =new DaoOperationsImpl();
		List<String> userDetails= new ArrayList<String>();
		try {
			boolean verify=daoOperations.loginCheckDao(userName,password);
		if (verify==true) {
		userDetails=daoOperations.Fetch(userName);
		for (String string : userDetails) {
			System.out.println("in services");
			System.out.println(string);
			
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
