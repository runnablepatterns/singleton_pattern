package com.runnablepatterns.singletonpattern;

/**
 * 
 * @author Carlos Marin
 * Runnable Patterns (runnablepatterns.com)
 * 
 * Employee class to hold employee information
 *
 */
public class Employee implements ICacheable{
	
	/**
	 * Stores ID details
	 */
	private String id;
	
	/**
	 * Stores first name details
	 */
	private String firstName;
	
	/**
	 * Stores last name details
	 */
	private String lastName;
	
	/**
	 * Default constructor
	 */
	public Employee()
	{
		// call overloaded constructor
		this("0", "", "");
	}
	
	/**
	 * Overloaded constructor to create employees
	 * @param _id Employee ID
	 * @param _firstName Employee First Name 
	 * @param _lastName Employee Last Name
	 */
	public Employee(String _id, String _firstName, String _lastName) {
		// set the variables
		setId(_id);
		setFirstName(_firstName);
		setLastName(_lastName);
	}

	/**
	 * Get Employee id details
	 * @return Employee ID
	 */
	public String getId() {
		return id;
	}

	/**
	 * Set Employee id details
	 * @param id Employee ID
	 */
	public void setId(String id) {
		this.id = id;
	}

	/**
	 * Get Employee first name details
	 * @return Employee First Name
	 */
	public String getFirstName() {
		return firstName;
	}

	/**
	 * Set Employee first name details
	 * @param firstName Employee First Name
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	/**
	 * Get Employee last name details
	 * @return Employee Last Name
	 */
	public String getLastName() {
		return lastName;
	}

	/**
	 * Set Employee last name details
	 * @param lastName Employee Last Name
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	@Override
	public String getCacheKey() {
		return "employees";
	}
}
