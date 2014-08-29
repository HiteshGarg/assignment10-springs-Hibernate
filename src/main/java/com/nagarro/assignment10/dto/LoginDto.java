package com.nagarro.assignment10.dto;

import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.stereotype.Repository;

/**
 * This class stores the value of userName and password that user enters.
 * 
 * @author hiteshgarg
 */
@Repository
public class LoginDto {

	/**
	 * User UserName.
	 */
	@NotEmpty
	@NotNull
	private String userName;

	/**
	 * User Password.
	 */
	@NotEmpty
	@NotNull
	private String password;

	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * @param password
	 *            the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	/**
	 * @return the userName
	 */
	public String getUserName() {
		return userName;
	}

	/**
	 * @param userName
	 *            the userName to set
	 */
	public void setUserName(String userName) {
		this.userName = userName;
	}
}
