package com.runnablepatterns.singletondemo;

import java.util.ArrayList;

import com.runnablepatterns.singletonpattern.Employee;
import com.runnablepatterns.singletonpattern.ICacheable;
import com.runnablepatterns.singletonpattern.ListCache;
import com.runnablepatterns.singletonpattern.OtherProcess;

/**
 * 
 * @author Carlos Marin
 * Runnable Patterns (runnablepatterns.com)
 * 
 * Demo class to demonstrate Singleton Pattern usage
 *
 */
public class SingletonPatternDemo {

	public static void main(String[] args) {
		
		// call the class access point
		ListCache myCache = ListCache.getInstance();
		
		// create the list of employees
		ArrayList<ICacheable> employeeList = new ArrayList<>();
		employeeList.add(new Employee("1", "Carlos", "Marin"));
		employeeList.add(new Employee("2", "Emp2Name", "Emp2Last"));
		employeeList.add(new Employee("3", "Emp3Name", "Emp3Last"));
		employeeList.add(new Employee("4", "Emp4Name", "Emp4Last"));
		employeeList.add(new Employee("5", "Emp5Name", "Emp5Last"));
		
		// add the list to the cache
		myCache.addToCache("employees", employeeList);
		
		// process the employees
		new OtherProcess().processEmployees();
	}

}
