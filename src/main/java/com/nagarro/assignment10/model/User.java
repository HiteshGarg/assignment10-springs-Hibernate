package com.nagarro.assignment10.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * User pojo class. Contains user name and password of user.
 * 
 * @author hiteshgarg
 */
@Entity
@Table(name = "login")
public class User {

	/**
	 * User name of user.
	 */
	@Id
	@Column(name = "userName")
	private String userName;

	/**
	 * Password of user.
	 */
	@Column(name = "password")
	private String password;

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

}
