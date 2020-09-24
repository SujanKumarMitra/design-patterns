package org.practice.designpatterns.designprinciples.singleresponsibility;

/**
 * @author Sujan Kumar Mitra
 * @since 2020-09-24
 */
public class BinarySearch {
	public int search(int[] arr, int element) {
		int low = 0, high = arr.length - 1;
		while (low <= high) {
			int mid = (low + high) / 2;
			if (arr[mid] == element) {
				return mid;
			} else if (arr[mid] > element) {
				high = mid - 1;
			} else {
				low = mid + 1;
			}
		}
		return -1;
	}
}
