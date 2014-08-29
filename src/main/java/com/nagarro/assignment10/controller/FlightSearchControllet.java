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
import com.nagarro.assignment10.dto.FlightSearchDto;

/**
 * This class controls the flight Search operation of the user.
 * 
 * @author hiteshgarg
 */
@Controller
public class FlightSearchControllet {

	/**
	 * Reference to flight Search dto.
	 */
	@Autowired
	private FlightSearchDto flightSearchDto;

	/**
	 * This method loads for the first time when the flight search page is
	 * loaded. This initializes the object of dto.
	 * 
	 * @param model
	 * @return
	 */
	@RequestMapping(value = Constants.FLIGHT_HOME, method = RequestMethod.GET)
	public String flightHome(Model model) {
		model.addAttribute(Constants.FLIGHT_SEARCH_DTO, flightSearchDto);
		return Constants.FLIGHT_HOME;
	}

	/**
	 * This method loads for the first time when the flight search page is
	 * loaded. This initializes the object of dto.
	 * 
	 * @param model
	 * @return
	 */
	@RequestMapping(value = Constants.FLIGHT_HOME, method = RequestMethod.POST)
	public String flightHome(@Valid
			@ModelAttribute(Constants.FLIGHT_SEARCH_DTO) FlightSearchDto flightSearchDto, BindingResult result) {

		if(result.hasErrors()){
			System.out.println(flightSearchDto.getOutputPreference());
		}
		return Constants.FLIGHT_HOME;
	}
}
