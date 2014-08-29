package com.nagarro.assignment10.dto;

import javax.validation.constraints.Pattern;

import org.springframework.stereotype.Repository;

import com.nagarro.assignment10.constant.Constants;

/**
 * This dto contains the values of the user input while searching for the
 * flights.
 * 
 * @author hiteshgarg
 */
@Repository
public class FlightSearchDto {

	/**
	 * Entered Arrival Location.
	 */
	@Pattern(regexp="[A-Z][a-z]{3}", message=Constants.INCORRET_LOCATION_FORMAT)
	private String arrLoc;
	
	/**
	 * Entered Departure Location.
	 */
	@Pattern(regexp="[A-Z][a-z]{3}", message=Constants.INCORRET_LOCATION_FORMAT)
	private String depLoc;
	
	/**
	 * Entered Date of Flight.
	 */
	private String flightDate;
	
	/**
	 * Entered flight class.
	 */
	private String flightClass;
	
	/**
	 * Entered Output preference.
	 */
	private String outputPreference;

	/**
	 * @return the arrLoc
	 */
	public String getArrLoc() {
		return arrLoc;
	}

	/**
	 * @param arrLoc
	 *            the arrLoc to set
	 */
	public void setArrLoc(String arrLoc) {
		this.arrLoc = arrLoc;
	}

	/**
	 * @return the depLoc
	 */
	public String getDepLoc() {
		return depLoc;
	}

	/**
	 * @param depLoc
	 *            the depLoc to set
	 */
	public void setDepLoc(String depLoc) {
		this.depLoc = depLoc;
	}

	/**
	 * @return the flightDate
	 */
	public String getFlightDate() {
		return flightDate;
	}

	/**
	 * @param flightDate
	 *            the flightDate to set
	 */
	public void setFlightDate(String flightDate) {
		this.flightDate = flightDate;
	}

	/**
	 * @return the flightClass
	 */
	public String getFlightClass() {
		return flightClass;
	}

	/**
	 * @param flightClass
	 *            the flightClass to set
	 */
	public void setFlightClass(String flightClass) {
		this.flightClass = flightClass;
	}

	/**
	 * @return the outputPreference
	 */
	public String getOutputPreference() {
		return outputPreference;
	}

	/**
	 * @param outputPreference
	 *            the outputPreference to set
	 */
	public void setOutputPreference(String outputPreference) {
		this.outputPreference = outputPreference;
	}
}
