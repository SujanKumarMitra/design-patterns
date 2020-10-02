package org.practice.designpatterns.structural.flyweight;

/**
 * @author Sujan Kumar Mitra
 * @since 2020-10-02
 */
public class Tree {
	int fruits;
	String size;
	TreeType treeType;

	public Tree(int fruits, String size, TreeType treeType) {
		this.fruits = fruits;
		this.size = size;
		this.treeType = treeType;
	}

	@Override
	public String toString() {
		return "Tree [fruits=" + fruits + ", size=" + size + ", treeType=" + treeType + "]";
	}

}
