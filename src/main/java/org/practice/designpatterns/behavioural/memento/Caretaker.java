package org.practice.designpatterns.behavioural.memento;

/**
 * This interface is responsible to save the {@link Memento} objects in a
 * data-structure,<br>
 * so that it can be restore easily in LIFO order.
 * 
 * @author Sujan Kumar Mitra
 * @since 2020-10-07
 */
public interface Caretaker<T> {

	/**
	 * adds the state to saved states structure
	 * 
	 * @param state
	 * @throws NullPointerException if {@link Memento} is null
	 */
	void save(Memento<T> state) throws NullPointerException;

	/**
	 * retrieves and returns last saved state
	 * 
	 * @return the last saved state
	 * @throws MementoNotFoundException if no state is saved
	 */
	Memento<T> retrieve() throws MementoNotFoundException;
}
