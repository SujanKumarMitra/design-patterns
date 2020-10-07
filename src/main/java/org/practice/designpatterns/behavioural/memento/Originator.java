package org.practice.designpatterns.behavioural.memento;

/**
 * @author Sujan Kumar Mitra
 * @since 2020-10-07
 */
public class Originator implements Saveable<Originator> {

	private int foo;
	private String bar;

	public Originator(int foo, String bar) {
		this.foo = foo;
		this.bar = bar;
	}

	private Originator(Originator o) {
		this.foo = o.foo;
		this.bar = o.bar;
	}

	@Override
	public Memento<Originator> save() {
		return new OriginatorMemento(new Originator(this));
	}

	@Override
	public void restore(Memento<Originator> state) {
		Originator previousState = state.getState();
		this.foo = previousState.foo;
		this.bar = previousState.bar;
	}

	public int getFoo() {
		return foo;
	}

	public void setFoo(int foo) {
		this.foo = foo;
	}

	public String getBar() {
		return bar;
	}

	public void setBar(String bar) {
		this.bar = bar;
	}

	@Override
	public String toString() {
		return "Originator [foo=" + foo + ", bar=" + bar + "]";
	}

	private class OriginatorMemento implements Memento<Originator> {

		final Originator state;

		public OriginatorMemento(Originator state) {
			this.state = state;
		}

		@Override
		public Originator getState() {
			return state;
		}

	}

}
