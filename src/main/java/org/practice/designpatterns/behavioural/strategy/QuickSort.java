package org.practice.designpatterns.behavioural.strategy;

import java.util.Comparator;

/**
 * @author Sujan Kumar Mitra
 * @since 11-10-2020
 */
public class QuickSort implements SortStrategy {

    private static QuickSort instance;

    private QuickSort() {
    }

    public static QuickSort getInstance() {
        if (instance == null)
            synchronized (InsertionSort.class) {
                if (instance == null)
                    instance = new QuickSort();
            }
        return instance;
    }

    @Override
    public <T> void sort(T[] arr, int start, int end, Comparator<T> comparator) {
        if (start < end) {
            int pivot = findPivot(arr, start, end, comparator);
            sort(arr, start, pivot, comparator);
            sort(arr, pivot + 1, end, comparator);
        }
    }

    private <T> int findPivot(T[] arr, int start, int end, Comparator<T> comparator) {
        int i = start;
        int j = start;
        while (j < end - 1) {
            if (comparator.compare(arr[j], arr[end - 1]) < 0) {
                swap(arr, i, j);
                i++;
            }
            j++;
        }
        swap(arr, i, end - 1);
        return i;
    }
}
