package com.webCodingChallenge.dao;

import java.util.List;

import com.webCodingChallenge.exceptions.DaoException;
import com.webCodingChallenge.model.User;

public interface DaoOperations {
	boolean loginCheckDao(String userName, String password) throws DaoException;

	List<User> Fetch(String userName) throws DaoException;



}
