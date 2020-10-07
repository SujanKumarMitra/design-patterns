package org.practice.designpatterns.behavioural.memento;

/**
 * This interface is used to save and restore states of objects<br>
 * Classes implementing this interface must provide implementations to
 * <ul>
 * 	<li>save the state in a {@link Memento} object
 * 	<li>restore the state from a {@link Memento} object
 * </ul>
 * 
 * @author Sujan Kumar Mitra
 * @since 2020-10-07
 * @see Memento
 */
public interface Saveable<T> {

	/**
	 * Saves the state of the object in the state
	 * 
	 * @return
	 */
	Memento<T> save();

	void restore(Memento<T> state);
}
