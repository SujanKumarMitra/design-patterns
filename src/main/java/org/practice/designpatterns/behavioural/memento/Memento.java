package org.practice.designpatterns.behavioural.memento;

/**
 * This interface is used to save the state of an object. <br>
 * Classes implementing this interface must provide an implementation to
 * retrieve saved state.
 * 
 * @author Sujan Kumar Mitra
 * @since 2020-10-07
 * @see Saveable
 */
public interface Memento<T> {
	/**
	 * Returns the saved state of the object
	 * 
	 * @return the saved state
	 */
	T getState();

}
