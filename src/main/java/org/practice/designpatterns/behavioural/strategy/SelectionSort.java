package org.practice.designpatterns.behavioural.strategy;

import java.util.Comparator;

/**
 * @author Sujan Kumar Mitra
 * @since 2020-10-10
 */
public class SelectionSort implements SortStrategy {

	private SelectionSort() {
	}

	private static SelectionSort instance;

	public static SelectionSort getInstance() {
		if (instance == null)
			synchronized (SelectionSort.class) {
				if (instance == null)
					instance = new SelectionSort();
			}
		return instance;
	}

	@Override
	public <T> void sort(T[] arr, int start, int end, Comparator<T> comparator) {
		for (int i = start; i < end - 1; i++) {
			int index = getLeast(arr, i, end, comparator);
			swap(arr, i, index);
		}
	}

	private <T> int getLeast(T[] arr, int start, int end, Comparator<T> comparator) {
		int min = start;
		for (int i = start + 1; i < end; i++) {
			if (comparator.compare(arr[min], arr[i]) > 0)
				min = i;
		}
		return min;
	}

}
