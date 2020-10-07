package org.practice.designpatterns.behavioural.memento;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.NoSuchElementException;
import java.util.Objects;

/**
 * @author Sujan Kumar Mitra
 * @since 2020-10-07
 */
public class OriginatorCaretaker implements Caretaker<Originator> {

	Deque<Memento<Originator>> stack;

	public OriginatorCaretaker() {
		stack = new ArrayDeque<>();
	}

	@Override
	public void save(Memento<Originator> state) throws NullPointerException {
		Objects.requireNonNull(state);
		Objects.requireNonNull(state.getState());
		stack.push(state);
	}

	@Override
	public Memento<Originator> retrieve() throws MementoNotFoundException {
		try {
			return stack.pop();
		} catch (NoSuchElementException e) {
			throw new MementoNotFoundException(e);
		}
	}

}
