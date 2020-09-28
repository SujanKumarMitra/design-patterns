package org.practice.designpatterns.structural.bridge;

/**
 * @author Sujan Kumar Mitra
 * @since 2020-09-28
 */
public class RedColor implements Color {

	@Override
	public void fillWithColor(int border) {
		System.out.println("filling with red color");
	}

}
