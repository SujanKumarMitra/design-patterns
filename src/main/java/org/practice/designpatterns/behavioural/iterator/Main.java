package org.practice.designpatterns.behavioural.iterator;

import java.util.Iterator;

/**
 * @author Sujan Kumar Mitra
 * @since 2020-10-03
 */
public class Main {
	public static void main(String[] args) {
		NotificationCollection collection = new NotificationCollection();
		collection.add(new Notification("NEW EMAIL"));
		collection.add(new Notification("NEW TEXT"));
		collection.add(new Notification("NEW SMS"));
		
		Iterator<Notification> iterator = collection.iterator();
		
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}
}
