package org.practice.designpatterns.designprinciples.singleresponsibility;

/**
 * @author Sujan Kumar Mitra
 * @since 2020-09-24
 */
public class LinearSearch {

	public int search(int[] arr, int element) {
		for (int index = 0; index < arr.length; index++) {
			if (arr[index] == element)
				return index;
		}
		return -1;
	}

}
