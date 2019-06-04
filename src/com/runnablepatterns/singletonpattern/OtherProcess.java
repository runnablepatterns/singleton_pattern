package com.runnablepatterns.singletonpattern;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * 
 * @author Carlos Marin
 * Runnable Patterns (runnablepatterns.com)
 * 
 * Class that emulates other processes inside the application.
 * It is used just to demonstrate how to get the information from the cache.
 *
 */
public class OtherProcess {

	/**
	 * Display the employees information
	 */
	public void processEmployees()
	{
		// get the current list of employees from cache instead of querying the database or the Web resource
		ArrayList<ICacheable> employees = ListCache.getInstance().getFromCache(new Employee().getCacheKey());
		
		// display process message
		System.out.println("Processing all employees");
		
		// iterate inside the array
		for (Iterator<ICacheable> iterator = employees.iterator(); iterator.hasNext();) {
			Employee employee = (Employee) iterator.next();
			
			// process each employee
			System.out.println(String.format("%s - %s %s", employee.getId(), employee.getFirstName(),
					employee.getLastName()));
		}
	}
}
