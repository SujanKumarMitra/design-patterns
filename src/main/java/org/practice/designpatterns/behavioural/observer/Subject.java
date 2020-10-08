package org.practice.designpatterns.behavioural.observer;

import java.util.function.Supplier;

/**
 * @author Sujan Kumar Mitra
 * @since 2020-10-08
 */
public interface Subject {

	Supplier<?> getState();

	boolean addObserver(Observer observer);

	boolean removeObserver(Observer observer);

	void notifyObservers();
}
