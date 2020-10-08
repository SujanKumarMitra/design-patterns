package org.practice.designpatterns.behavioural.state;

import java.util.Objects;

/**
 * @author Sujan Kumar Mitra
 * @since 2020-10-08
 * @param <T>
 */
public class FiniteStateMachineImpl<T> implements FiniteStateMachine<T> {
	State<T> currentState;

	public FiniteStateMachineImpl(State<T> currentState) {
		this.currentState = currentState;
	}

	@Override
	public boolean parse(T[] input) {
		for (T t : input) {
			currentState = currentState.transition(t);
		}
		return currentState.isFinal();
	}

	@Override
	public State<T> getCurrentState() {
		return currentState;
	}

	public void setCurrentState(State<T> currentState) {
		Objects.requireNonNull(currentState);
		this.currentState = currentState;
	}

}
