package org.practice.designpatterns.behavioural.iterator;

import java.util.Iterator;

/**
 * @author Sujan Kumar Mitra
 * @since 2020-10-03
 */
public class NotificationCollection implements Iterable<Notification> {
	Notification[] notifications;
	public static final int CAPACITY = 10;
	private int size;

	public NotificationCollection() {
		this.notifications = new Notification[CAPACITY];
		this.size = 0;
	}

	public void add(Notification notification) {
		assertNotOverflow();
		notifications[size++] = notification;
	}

	private void assertNotOverflow() {
		if (size == CAPACITY)
			throw new UnsupportedOperationException("overflow");
	}

	public Notification[] getNotifications() {
		return notifications;
	}

	public int getSize() {
		return size;
	}

	@Override
	public Iterator<Notification> iterator() {
		return new NotificationIterator(this);
	}
}
