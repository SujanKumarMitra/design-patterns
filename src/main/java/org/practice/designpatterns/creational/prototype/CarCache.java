package org.practice.designpatterns.creational.prototype;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Sujan Kumar Mitra
 * @since 2020-09-27
 */
public class CarCache {

	public Map<String, Car> cache;

	public CarCache() {
	}

	public Car getCar(String name) {
		if (cache == null) {
			synchronized (this) {
				if (cache == null)
					loadCache();
			}
		}
		return cache.get(name)
					.clone();
	}

	private void loadCache() {
		cache = new HashMap<>();
		cache.put("nano", new Nano());
		cache.put("ford", new Ford());
	}

}
