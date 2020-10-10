package org.practice.designpatterns.behavioural.strategy;

import java.util.Comparator;

/**
 * @author Sujan Kumar Mitra
 * @since 2020-10-10
 */
public class BubbleSort implements SortStrategy {

	private BubbleSort() {
	}

	private static BubbleSort instance;

	public static BubbleSort getInstance() {
		if (instance == null)
			synchronized (BubbleSort.class) {
				if (instance == null)
					instance = new BubbleSort();
			}
		return instance;
	}

	@Override
	public <T> void sort(T[] arr, int start, int end, Comparator<T> comparator) {
		for (int i = start; i < end - 1; i++)
			for (int j = start; j < end - 1; j++)
				if (comparator.compare(arr[j], arr[j + 1]) > 0)
					swap(arr, j, j + 1);
	}
}
