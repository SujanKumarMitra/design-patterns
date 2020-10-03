package org.practice.designpatterns.behavioural.interpreter;

/**
 * @author Sujan Kumar Mitra
 * @since 2020-10-03
 */
public class AndExpression implements Expression {

	Expression exp1;
	Expression exp2;

	public AndExpression(Expression exp1, Expression exp2) {
		this.exp1 = exp1;
		this.exp2 = exp2;
	}

	@Override
	public boolean interpret(String context) {
		return exp1.interpret(context) && exp2.interpret(context);
	}

}
