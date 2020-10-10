package org.practice.designpatterns.behavioural.visitor;

/**
 * @author Sujan Kumar Mitra
 * @since 2020-10-10
 */
public interface ShoppingCartVisitor {
	int visit(Book book);
	int visit(Fruit book);
}
