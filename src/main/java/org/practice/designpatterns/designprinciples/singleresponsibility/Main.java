package org.practice.designpatterns.designprinciples.singleresponsibility;

import java.util.Arrays;

/**
 * @author Sujan Kumar Mitra
 * @since 2020-09-24
 */
public class Main {
	public static void main(String[] args) {
		int[] arr = { 10, 40, 30, 20, 50 };
		int element = 20;
		ArrayUtil util = new ArrayUtil();

		System.out.println("20 is present at " + util.linearSearch(arr, element));

		System.out.println("Before Sorting");
		System.out.println(Arrays.toString(arr));
		util.sort(arr);
		System.out.println("After Sorting");
		System.out.println(Arrays.toString(arr));

		System.out.println("20 is present at " + util.binarySearch(arr, element));
	}
}
