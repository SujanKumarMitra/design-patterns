package org.practice.designpatterns.behavioural.strategy;

import java.util.Comparator;

/**
 * @author Sujan Kumar Mitra
 * @since 2020-10-10
 */
public class ArraySorter {
	SortStrategy strategy;

	public ArraySorter(SortStrategy strategy) {
		this.strategy = strategy;
	}

	public void setStrategy(SortStrategy strategy) {
		this.strategy = strategy;
	}

	public <T> void sort(T arr[], Comparator<T> comparator) {
		strategy.sort(arr, comparator);
	}

	public <T extends Comparable<T>> void sort(T arr[]) {
		strategy.sort(arr);
	}

}
