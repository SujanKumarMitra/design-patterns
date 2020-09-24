package org.practice.designpatterns.designprinciples.singleresponsibility;

/**
 * @author Sujan Kumar Mitra
 * @since 2020-09-24
 */
public class ArrayUtil {

	LinearSearch linearSearchUtil;
	BinarySearch binarySearchUtil;
	MergeSort sortUtil;

	public ArrayUtil() {
		linearSearchUtil = new LinearSearch();
		binarySearchUtil = new BinarySearch();
		sortUtil = new MergeSort();
	}

	public int linearSearch(int[] arr, int element) {
		return linearSearchUtil.search(arr, element);
	}

	public int binarySearch(int[] arr, int element) {
		return linearSearchUtil.search(arr, element);
	}

	public void sort(int[] arr) {
		sortUtil.sort(arr);
	}
}
