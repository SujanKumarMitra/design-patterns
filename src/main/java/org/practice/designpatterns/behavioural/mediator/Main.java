package org.practice.designpatterns.behavioural.mediator;

import java.util.Random;

/**
 * @author Sujan Kumar Mitra
 * @since 2020-10-05
 */
public class Main {

	static Random rand;

	static {
		rand = new Random();
	}

	public static void main(String[] args) {
		ChatRoom room = new ChatRoomImpl();
		User[] users = getUsers(room);
		Runnable runnable = () -> {
			while (true) {
				int index = getRandomIndex(users.length);
				User user = users[index];
				user.send("Hi!");
				try {
					Thread.sleep(3000);
				} catch (InterruptedException e) {
					System.err.println(e);
				}
				System.out.println();
			}
		};
		Thread thread = new Thread(runnable);
		thread.start();
		try {
			thread.join();
		} catch (InterruptedException e) {
			System.err.println(e);
		}

	}

	private static int getRandomIndex(int length) {
		return rand.nextInt(length);
	}

	private static User[] getUsers(ChatRoom room) {
		User[] users = new User[5];
		int index = 0;
		users[index++] = new UserImpl("Tom", room);
		users[index++] = new UserImpl("Jerry", room);
		users[index++] = new UserImpl("Spike", room);
		users[index++] = new UserImpl("Nibbles", room);
		users[index++] = new UserImpl("Toodles", room);
		return users;
	}
}
