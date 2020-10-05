package org.practice.designpatterns.behavioural.mediator;

/**
 * @author Sujan Kumar Mitra
 * @since 2020-10-05
 */
public abstract class User {

	private ChatRoom room;
	private final String name;

	public User(String name, ChatRoom room) {
		this.name = name;
		this.room = room;
		joinRoom(room);
	}

	public String getName() {
		return name;
	}

	public final void send(String message) {
		room.sendMessage(this, message);
	}

	public final void joinRoom(ChatRoom room) {
		room.joinRoom(this);
		this.room = room;
	}

	public final void leaveRoom(ChatRoom room) {
		room.leaveRoom(this);
		this.room = null;
	}
	
	public abstract boolean equals(User user);

	public abstract void onReceive(User user, String message);
}
