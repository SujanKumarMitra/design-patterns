package org.practice.designpatterns.behavioural.mediator;

import java.util.HashSet;
import java.util.Set;

/**
 * @author Sujan Kumar Mitra
 * @since 2020-10-05
 */
public class ChatRoomImpl implements ChatRoom {

	private Set<User> users;

	public ChatRoomImpl() {
		users = new HashSet<>();
	}

	@Override
	public void joinRoom(User user) {
		users.add(user);
	}

	@Override
	public void leaveRoom(User user) {
		users.remove(user);
	}

	@Override
	public void sendMessage(User user, String message) {
		users	.parallelStream()
				.filter(u -> !u.equals(user))
				.forEach(u -> u.onReceive(user, message));
	}
}
