package org.practice.designpatterns.behavioural.strategy;

import java.util.Comparator;

/**
 * @author Sujan Kumar Mitra
 * @since 11-10-2020
 */
public class MergeSort implements SortStrategy {

    private static MergeSort instance;

    private MergeSort() {
    }

    public static MergeSort getInstance() {
        if (instance == null)
            synchronized (InsertionSort.class) {
                if (instance == null)
                    instance = new MergeSort();
            }
        return instance;
    }

    @Override
    public <T> void sort(T[] arr, int start, int end, Comparator<T> comparator) {
        if (start < end - 1) {
            int mid = (start + end - 1) / 2;
            sort(arr, start, mid + 1, comparator);
            sort(arr, mid + 1, end, comparator);
            merge(arr, start, mid, end, comparator);
        }
    }

    @SuppressWarnings("unchecked")
    private <T> void merge(T[] arr, int start, int mid, int end, Comparator<T> comparator) {
        Object[] temp = new Object[end - start];
        int k = 0, i = start, j = mid + 1;
        while (i <= mid && j < end) {
            if (comparator.compare(arr[i], arr[j]) < 0) {
                temp[k++] = arr[i++];
            } else {
                temp[k++] = arr[j++];
            }
        }
        while (i <= mid) {
            temp[k++] = arr[i++];
        }
        while (j < end) {
            temp[k++] = arr[j++];
        }

        k = 0;
        for (i = start; i < end; i++) {
            arr[i] = (T) temp[k++];
        }
    }
}
