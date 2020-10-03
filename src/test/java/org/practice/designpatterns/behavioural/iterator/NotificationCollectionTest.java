package org.practice.designpatterns.behavioural.iterator;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.function.Consumer;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * @author Sujan Kumar Mitra
 * @since 2020-10-03
 */
class NotificationCollectionTest {

	NotificationCollection collection;

	@BeforeEach
	void setUp() throws Exception {
		collection = new NotificationCollection();
	}

	@AfterEach
	void tearDown() throws Exception {
		collection = null;
		System.gc();
	}

	@Test
	void shouldThrowExceptionOnOverflow() {
		int maxCapacity = NotificationCollection.CAPACITY;
		for (int i = 1; i <= maxCapacity; i++) {
			collection.add(new Notification(null));
		}
		assertThrows(UnsupportedOperationException.class, () -> collection.add(new Notification(null)));
	}

	@Test
	void shouldThrowExceptionOnIteratingAllElementsAndCallingNext() {
		int size = 3;
		for (int i = 1; i <= size; i++) {
			collection.add(new Notification(null));
		}
		Iterator<Notification> iterator = collection.iterator();
		iterator.forEachRemaining(doNothing());
		assertThrows(NoSuchElementException.class, () -> iterator.next());
	}

	private Consumer<? super Notification> doNothing() {
		return (e) -> {
		};
	}

	@Test
	void shouldBeInSameOrderWhileIterating() {
		String[] messages = getRandomMesages();
		assertTrue(messages.length <= NotificationCollection.CAPACITY);
		NotificationCollection collection = new NotificationCollection();
		for (String message : messages) {
			collection.add(new Notification(message));
		}
		Iterator<Notification> iterator = collection.iterator();
		for (String message : messages) {
			Notification next = iterator.next();
			assertEquals(next.getMessage(), message);
		}
	}

	private String[] getRandomMesages() {
		String[] messages = { "SMS", "EMAIL", "FB" };
		return messages;
	}

}
