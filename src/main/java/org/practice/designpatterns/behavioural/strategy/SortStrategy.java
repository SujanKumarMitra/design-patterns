package org.practice.designpatterns.behavioural.strategy;

import java.util.Comparator;

/**
 * @author Sujan Kumar Mitra
 * @since 2020-10-10
 */
public interface SortStrategy {

	/**
	 * Sorts the given ranged array based on comparator logic
	 * 
	 * @param <T>        type of array elements
	 * @param arr        the array
	 * @param start      start index <b>(inclusive)</b>
	 * @param end        end index <b>(exclusive)</b>
	 * @param comparator comparison logic of elements
	 */
	<T> void sort(T[] arr, int start, int end, Comparator<T> comparator);

	/**
	 * Sorts the whole array (0-arr.length) based on comparator logic
	 * 
	 * @param <T>        type of array elements
	 * @param arr        the array
	 * @param comparator comparison logic of elements
	 */
	default <T> void sort(T[] arr, Comparator<T> comparator) {
		sort(arr, 0, arr.length, comparator);
	}

	default <T extends Comparable<T>> void sort(T[] arr) {
		sort(arr, T::compareTo);
	}

	default <T extends Comparable<T>> void sort(T[] arr, int start, int end) {
		sort(arr, start, end, T::compareTo);
	}

	/**
	 * Helper method to swap positions to two elements in array
	 * 
	 * @param <T>  type of array elements
	 * @param arr  the array
	 * @param pos1 first index position <b>(inclusive)</b>
	 * @param pos2 second index position <b>(inclusive)</b>
	 */
	default <T> void swap(T[] arr, int pos1, int pos2) {
		T temp = arr[pos1];
		arr[pos1] = arr[pos2];
		arr[pos2] = temp;
	}

}
