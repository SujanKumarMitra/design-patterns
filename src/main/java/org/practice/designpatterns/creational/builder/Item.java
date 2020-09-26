package org.practice.designpatterns.creational.builder;

import org.practice.designpatterns.creational.builder.packing.Packing;

/**
 * @author Sujan Kumar Mitra
 * @since 2020-09-26
 */
public interface Item {
	
	String getName();
	
	double getPrice();
	
	Packing getPacking();
}
