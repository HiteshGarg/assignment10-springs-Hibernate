package com.nagarro.assignment10.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.nagarro.assignment10.constant.Constants;
import com.nagarro.assignment10.dto.LoginDto;
import com.nagarro.assignment10.service.UserServiceImpl;

/**
 * This class will act as a controller for Login form. It will send the data to
 * the service layer which after validating information informs this controller
 * which redirects to home page or show error messages on login form
 * accordingly.
 * 
 * @author hiteshgarg
 */
@Controller
public class LoginController {

	/**
	 * Login dto object reference.
	 */
	@Autowired
	private LoginDto loginDto;

	/**
	 * User Service Reference.
	 */
	@Autowired
	private UserServiceImpl userServiceImpl;

	/**
	 * @param model
	 * @return
	 */
	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String doLogins(Model model) {
		System.out.println("get login");
		model.addAttribute(Constants.LOGIN_DTO_REF, loginDto);
		return Constants.LOGIN_JSP;
	}

	/**
	 * @param loginDto
	 * @return
	 */
	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public String doLogin(@Valid
			@ModelAttribute(Constants.LOGIN_DTO_REF) LoginDto loginDto, BindingResult result) {

		String returnPage = Constants.LOGIN_JSP;
		Boolean exists = false;
	
		if (!(loginDto.getUserName().isEmpty() || loginDto.getPassword()
				.isEmpty() || result.hasErrors())) {
			exists = userServiceImpl.validateUser(loginDto);
			System.out.println(exists);
			if (exists) {
				returnPage = "redirect:" + Constants.FLIGHT_HOME + ".do";
			}
		}
		return returnPage;
	}

}
