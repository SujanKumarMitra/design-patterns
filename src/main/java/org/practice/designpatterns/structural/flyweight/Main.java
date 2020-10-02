package org.practice.designpatterns.structural.flyweight;

/**
 * @author Sujan Kumar Mitra
 * @since 2020-10-02
 */
public class Main {
	public static void main(String[] args) {
		Forest forest = new Forest();
		forest.plantTree(10, 2, "Mango", "Brown");
		forest.plantTree(5, 1, "Banana", "Green");
		forest.plantTree(7, 3, "JackFruit", "Black");
		
		forest.display();
	}
}
