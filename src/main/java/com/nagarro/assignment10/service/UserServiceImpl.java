package com.nagarro.assignment10.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nagarro.assignment10.dao.UserDaoImpl;
import com.nagarro.assignment10.dto.LoginDto;
import com.nagarro.assignment10.model.User;

/**
 * This is a service class for user and perform login validation and flight
 * search related operations.
 * 
 * @author hiteshgarg
 */
@Service
public class UserServiceImpl {

	@Autowired
	private UserDaoImpl userDaoImpl;

	/**
	 * This method validates the user on login and return true or false to its
	 * controller.
	 * 
	 * @param loginDto
	 *            dto class that store user name and password
	 * @return whether user is validated or not(Boolean)
	 */
	@Transactional
	public Boolean validateUser(LoginDto loginDto) {
		User user = null;
		Boolean exists = false;
		user = userDaoImpl.getUser(loginDto);
		if (null != user) {
			exists = true;
		}
		return exists;
	}

}
