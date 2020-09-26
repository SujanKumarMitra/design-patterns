package org.practice.designpatterns.creational.builder.burger;

import org.practice.designpatterns.creational.builder.Item;
import org.practice.designpatterns.creational.builder.packing.Packing;
import org.practice.designpatterns.creational.builder.packing.Wrapper;

/**
 * @author Sujan Kumar Mitra
 * @since 2020-09-26
 */
public abstract class Burger implements Item {
	public Packing getPacking() {
		return new Wrapper();
	}
}
