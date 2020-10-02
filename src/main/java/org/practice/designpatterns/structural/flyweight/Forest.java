package org.practice.designpatterns.structural.flyweight;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Sujan Kumar Mitra
 * @since 2020-10-02
 */
public class Forest {
	List<Tree> trees;
	TreeTypeFactory factory;

	public Forest() {
		this.trees = new ArrayList<>();
		factory = new TreeTypeFactory();
	}

	public void plantTree(int fruits, int size, String name, String color) {
		TreeType treeType = factory.getTree(name, color);
		Tree tree = new Tree(fruits, color, treeType);
		trees.add(tree);
	}

	public void display() {
		trees.forEach(System.out::println);
	}
}
