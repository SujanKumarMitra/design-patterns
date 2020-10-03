package org.practice.designpatterns.behavioural.iterator;

import java.util.Iterator;
import java.util.NoSuchElementException;

/**
 * @author Sujan Kumar Mitra
 * @since 2020-10-03
 */
public class NotificationIterator implements Iterator<Notification> {

	NotificationCollection collection;
	int currentIndex;

	public NotificationIterator(NotificationCollection notificationCollection) {
		this.collection = notificationCollection;
		currentIndex = 0;
	}

	@Override
	public boolean hasNext() {
		return currentIndex < collection.getSize();
	}

	@Override
	public Notification next() {
		if(!hasNext())
			throw new NoSuchElementException("no more elements");
		return collection.getNotifications()[currentIndex++];
	}

}
