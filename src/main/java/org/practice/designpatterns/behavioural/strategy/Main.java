package org.practice.designpatterns.behavioural.strategy;

import static java.util.Collections.shuffle;
import static java.util.stream.Collectors.toCollection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.IntStream;

/**
 * @author Sujan Kumar Mitra
 * @since 2020-10-10
 */
public class Main {
	public static void main(String[] args) {
		Integer[] array;
		ArraySorter sorter = new ArraySorter(BubbleSort.getInstance());
		
		array = getArray();
		printArray(array);
		sorter.sort(array);
		printArray(array);
		
		sorter.setStrategy(InsertionSort.getInstance());
		
		array = getArray();
		printArray(array);
		sorter.sort(array);
		printArray(array);
		
		sorter.setStrategy(SelectionSort.getInstance());
		
		array = getArray();
		printArray(array);
		sorter.sort(array);
		printArray(array);
	}

	private static void printArray(Integer[] array) {
		System.out.println(Arrays.toString(array));
	}

	public static Integer[] getArray() {
		ArrayList<Integer> list = IntStream	.range(1, 10)
											.boxed()
											.collect(toCollection(ArrayList::new));

		shuffle(list);
		return list.toArray(Integer[]::new);
	}
}
