package org.practice.designpatterns.behavioural.interpreter;

/**
 * @author Sujan Kumar Mitra
 * @since 2020-10-03
 */
public class TerminalExpression implements Expression {

	String data;

	public TerminalExpression(String data) {
		this.data = data;
	}

	@Override
	public boolean interpret(String context) {
		return context.contains(data);
	}

}
