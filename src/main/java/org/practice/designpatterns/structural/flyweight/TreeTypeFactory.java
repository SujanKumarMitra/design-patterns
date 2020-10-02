package org.practice.designpatterns.structural.flyweight;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Sujan Kumar Mitra
 * @since 2020-10-02
 */
public class TreeTypeFactory {
	private Map<String, TreeType> cache;

	public TreeTypeFactory() {
		cache = new HashMap<>();
	}

	public TreeType getTree(String name, String color) {
		TreeType type = cache.get(name);
		if (type == null) {
			type = new TreeType(name, color);
			cache.put(name, type);
		}
		return type;
	}

}
