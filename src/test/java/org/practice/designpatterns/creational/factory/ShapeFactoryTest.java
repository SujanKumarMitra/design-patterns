package org.practice.designpatterns.creational.factory;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * @author Sujan Kumar Mitra
 * @since 2020-09-25
 */
class ShapeFactoryTest {

	ShapeFactory factory;

	@BeforeEach
	void setUp() {
		factory = new ShapeFactory();
	}

	@Test
	void shouldGiveSquareShape() {
		Shape shape = factory.getShape("square");
		assertEquals(Square.class, shape.getClass());
	}

	@Test
	void shouldGiveRectangleShape() {
		Shape shape = factory.getShape("rectangle");
		assertEquals(Rectangle.class, shape.getClass());
	}

	@Test
	void shouldGiveCircleShape() {
		Shape shape = factory.getShape("circle");
		assertEquals(Circle.class, shape.getClass());
	}

	@Test
	void shouldGiveNull() {
		Shape shape = factory.getShape("doesnotexist");
		assertNull(shape);
	}

	@Test
	void shouldWorkForAllCases() {
		String[] names = { "square", "Square", "SQUARE", "SqUaRe" };

		for (String name : names) {
			assertEquals(Square.class, factory.getShape(name).getClass());
		}
	}

}
