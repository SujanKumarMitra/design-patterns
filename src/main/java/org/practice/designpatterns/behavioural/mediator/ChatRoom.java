package org.practice.designpatterns.behavioural.mediator;

/**
 * @author Sujan Kumar Mitra
 * @since 2020-10-05
 */
public interface ChatRoom {
	void joinRoom(User user);
	void leaveRoom(User user);
	void sendMessage(User user, String message);
}
