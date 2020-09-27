package org.practice.designpatterns.creational.prototype;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.Objects;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * @author Sujan Kumar Mitra
 * @since 2020-09-27
 */
class CarCacheTest {

	CarCache cache;
	
	@BeforeEach
	void setUp() {
		cache = new CarCache();
	}

	@Test
	void shouldPerformShallowCopy() {
		int n = 5;
		Car[] cars = new Car[n];
		for(int i=0;i<n;i++) {
			cars[i] = cache.getCar("ford");
		}
		for(int i=0;i<n-1;i++) {
			Car car1 = cars[i];
			Car car2 = cars[i+1];
			
			assertTrue(Objects.equals(car1.getName(), car2.getName()));
			assertTrue(Objects.equals(car1.getPrice(), car2.getPrice()));
			
		}
	}

}
