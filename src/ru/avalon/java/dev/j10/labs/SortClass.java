package ru.avalon.java.dev.j10.labs;

import java.util.Arrays;
import java.util.Comparator;

public class SortClass implements Sort {
    @Override
    public void sort(Object[] array) {
        for (int i = 0; array.length > i; i++) {
            for (int j = 1; array.length > j; j++) {
                if (array[j].hashCode() > array[j-1].hashCode()) {
                    Object bufer = array[j];
                    array[j] = array[j-1];
                    array[j-1] = bufer;

                }
            }
        }

    }

    @Override
    public void sort(Comparable[] array) {
       Arrays.sort(array);
    }

    @Override
    public void sort(Object[] array, Comparator comparator) {
        Arrays.sort(array, comparator);
    }
}
