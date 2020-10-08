package org.practice.designpatterns.behavioural.observer;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

/**
 * @author Sujan Kumar Mitra
 * @since 2020-10-08
 */
public abstract class AbstractSubject implements Subject {
	
	Set<Observer> observers;
	
	public AbstractSubject() {
		this.observers = new HashSet<>();
	}

	@Override
	public boolean addObserver(Observer observer) {
		Objects.requireNonNull(observer);
		return observers.add(observer);
	}

	@Override
	public boolean removeObserver(Observer observer) {
		Objects.requireNonNull(observer);
		return observers.remove(observer);
	}

	@Override
	public void notifyObservers() {
		observers.forEach(Observer::update);
	}

}
