package org.practice.designpatterns.behavioural.strategy;

import java.util.Comparator;

/**
 * @author Sujan Kumar Mitra
 * @since 2020-10-10
 */
public class InsertionSort implements SortStrategy {

    private static InsertionSort instance;

    private InsertionSort() {
    }

    public static InsertionSort getInstance() {
        if (instance == null)
            synchronized (InsertionSort.class) {
                if (instance == null)
                    instance = new InsertionSort();
            }
        return instance;
    }

    @Override
    public <T> void sort(T[] arr, int start, int end, Comparator<T> comparator) {
        for (int i = start; i < end; i++) {
            T t = arr[i];
            int j = i - 1;
            while (j >= start && comparator.compare(arr[j], t) > 0) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = t;
        }
    }

}
