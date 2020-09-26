package org.practice.designpatterns.creational.builder.colddrink;

import org.practice.designpatterns.creational.builder.Item;
import org.practice.designpatterns.creational.builder.packing.Bottle;
import org.practice.designpatterns.creational.builder.packing.Packing;

/**
 * @author Sujan Kumar Mitra
 * @since 2020-09-26
 */
public abstract class ColdDrink implements Item {
	public Packing getPacking() {
		return new Bottle();
	}
}
