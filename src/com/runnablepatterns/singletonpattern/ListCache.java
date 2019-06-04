package com.runnablepatterns.singletonpattern;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * 
 * @author Carlos Marin
 * Runnable Patterns (runnablepatterns.com)
 * 
 * Singleton Class that holds the cache for list objects
 *
 */
public class ListCache {
	
	/**
	 * Define a private static variable to use to hold the class reference
	 */
	private volatile static ListCache singletonCache;
	
	/**
	 * Contains the cache values to be stored
	 */
	private Map<String, ArrayList<ICacheable>> cacheValues = new HashMap<String, ArrayList<ICacheable>>();
	
	/**
	 * Private constructor according to step 1
	 */
	private ListCache() {		
	}
	
	/**
	 * Create the single access point for this class
	 * @return The single and unique instance of this class
	 */
	public static ListCache getInstance() {
		// if the instance is not created yet
		if(singletonCache == null)
		{
			// create synchronized block
			synchronized (ListCache.class) {
				if(singletonCache == null) {
					// create the instance
					singletonCache = new ListCache();
				}
			}
		}
		
		// return the single instance
		return singletonCache;
	}
	
	/**
	 * Adds a new value to the cache using the specified key
	 * @param key Key text to identify the value in the cache
	 * @param value The value to add to the cache
	 */
	public synchronized void addToCache(String key, ArrayList<ICacheable> value) {
		// add list to cache
		this.cacheValues.put(key, value);
	}
	
	/**
	 * Search in the cache using the specified key
	 * @param key Key to use to search inside the cache
	 * @return The value that holds the specified key
	 */
	public ArrayList<ICacheable> getFromCache(String key) {
		// search the value using the key
		return this.cacheValues.get(key);
	}
}
