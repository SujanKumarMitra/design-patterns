package org.practice.designpatterns.designprinciples.singleresponsibility;

/**
 * @author Sujan Kumar Mitra
 * @since 2020-09-24
 */
public class MergeSort {

	public void sort(int[] arr) {
		sort(arr, 0, arr.length - 1);
	}

	private void sort(int[] arr, int start, int end) {
		if (start < end) {
			int mid = (start + end) / 2;
			sort(arr, start, mid);
			sort(arr, mid + 1, end);
			merge(arr, start, mid, end);
		}
	}

	private void merge(int[] arr, int start, int mid, int end) {
		int[] temp = new int[end - start + 1];
		int index = 0;
		int s1 = start, s2 = mid + 1;
		while (s1 <= mid && s2 <= end) {
			if (arr[s1] <= arr[s2]) {
				temp[index++] = arr[s1++];
			} else {
				temp[index++] = arr[s2++];
			}
		}
		while (s1 <= mid) {
			temp[index++] = arr[s1++];
		}
		while (s2 <= end) {
			temp[index++] = arr[s2++];
		}
		index = 0;
		for (int i = start; i <= end; i++) {
			arr[i] = temp[index++];
		}
	}
}
