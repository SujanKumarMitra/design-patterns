package org.practice.designpatterns.behavioural.mediator;

import java.util.Objects;

/**
 * @author Sujan Kumar Mitra
 * @since 2020-10-05
 */
public class UserImpl extends User {

	public UserImpl(String name, ChatRoom room) {
		super(name, room);
	}

	@Override
	public void onReceive(User user, String message) {
		System.out.println(user.getName() + " to " + getName() + ":: " + message);
	}

	@Override
	public boolean equals(User user) {
		return Objects.deepEquals(this, user);
	}

}
