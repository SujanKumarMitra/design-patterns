package org.practice.designpatterns.behavioural.state;

/**
 * @author Sujan Kumar Mitra
 * @since 2020-10-08
 * @param <T>
 */
public interface FiniteStateMachine<T> {

	boolean parse(T[] input);
	State<T> getCurrentState();
	void setCurrentState(State<T> currentState);

}