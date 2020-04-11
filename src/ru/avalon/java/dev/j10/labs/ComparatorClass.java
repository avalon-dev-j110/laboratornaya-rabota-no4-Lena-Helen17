package ru.avalon.java.dev.j10.labs;

import java.util.Comparator;

public class ComparatorClass implements Comparator {
    @Override
    public int compare(Object o1, Object o2) {
        String s1 = (String) o1;
        String s2 = (String) o2;
        if(s1.compareTo(s2) > 0) {
            return -5;}
        else if (s1.compareTo(s2) < 0) {
            return 6;
        } else
        return 0;
    }
}
