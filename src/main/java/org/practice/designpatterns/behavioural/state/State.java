package org.practice.designpatterns.behavioural.state;

/**
 * This interface represents a state in a Finite State Machine.<br>
 * Classes implementing this interface must implement the methods.
 * <ul>
 * <li>change state on a transition</li>
 * <li>is the current state dead</li>
 * <li>is the current state alive</li>
 * </ul>
 * 
 * @author Sujan Kumar Mitra
 * @since 2020-10-08
 * @param <T>
 */
public interface State<T> {
	State<T> transition(T input);

	boolean isDead();

	boolean isFinal();
}
