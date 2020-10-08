package org.practice.designpatterns.behavioural.state.fsmdemo;

import org.practice.designpatterns.behavioural.state.State;

/**
 * @author Sujan Kumar Mitra
 * @since 2020-10-08
 */
public class FinalState implements State<Character> {

	@Override
	public State<Character> transition(Character input) {
		return this;
	}

	@Override
	public boolean isDead() {
		return false;
	}

	@Override
	public boolean isFinal() {
		return true;
	}

}
