package org.practice.designpatterns.behavioural.state.fsmdemo;

import org.practice.designpatterns.behavioural.state.State;
import org.practice.designpatterns.behavioural.state.fsmdemo.StateFactory.StateMode;

/**
 * @author Sujan Kumar Mitra
 * @since 2020-10-08
 */
public class IntermediateState implements State<Character> {

	StateFactory factory;

	public IntermediateState() {
		this.factory = StateFactory.getInstance();
	}

	@Override
	public State<Character> transition(Character input) {
		switch (input.charValue()) {
		case 'a':
			return factory.getState(StateMode.DEAD);
		case 'b':
			return factory.getState(StateMode.FINAL);
		default:
			return this;
		}
	}

	@Override
	public boolean isDead() {
		return false;
	}

	@Override
	public boolean isFinal() {
		return false;
	}

}
