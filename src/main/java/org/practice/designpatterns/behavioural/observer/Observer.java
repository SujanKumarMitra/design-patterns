package org.practice.designpatterns.behavioural.observer;

import java.util.Objects;

/**
 * @author Sujan Kumar Mitra
 * @since 2020-10-08
 */
public abstract class Observer {
	protected Subject subject;

	public Observer(Subject subject) {
		Objects.requireNonNull(subject);
		this.subject = subject;
		subject.addObserver(this);
	}

	public void setSubject(Subject subject) {
		this.subject.removeObserver(this);
		this.subject = subject;
		this.subject.addObserver(this);
	}
	
	public Subject getSubject() {
		return subject;
	}

	public void removeSubject() {
		if(this.subject == null)
			throw new UnsupportedOperationException("currently not observing any subject");
		this.subject.removeObserver(this);
		this.subject = null;
	}

	@Override
	protected void finalize() throws Throwable {
		subject.removeObserver(this);
	}

	protected abstract void update();

}
