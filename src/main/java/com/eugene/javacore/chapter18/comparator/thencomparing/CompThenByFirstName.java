package com.eugene.javacore.chapter18.comparator.thencomparing;

import java.util.Comparator;

public class CompThenByFirstName implements Comparator<String> {
    @Override
    public int compare(String o1, String o2) {
        int i, j;

        return o1.compareToIgnoreCase(o2);
    }
}
