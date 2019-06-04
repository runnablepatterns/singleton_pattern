package com.runnablepatterns.singletonpattern;

/**
 * 
 * @author Carlos Marin
 * Runnable Patterns (runnablepatterns.com)
 * 
 * Interface that groups all objects that can be added to cache
 *
 */
public interface ICacheable {
	
	/**
	 * Gets the key for each object.
	 * @return The key to be used to search in the cache
	 */
	public String getCacheKey();
}
