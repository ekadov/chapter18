package com.eugene.javacore.chapter18.comparator.thencomparing;

import java.util.Comparator;

public class CompLastNames implements Comparator<String> {
    @Override
    public int compare(String o1, String o2) {
        int i, j;

        // Find starting index for lastName
        i = o1.lastIndexOf(' ');
        j = o2.lastIndexOf(' ');

        return o1.substring(i).compareToIgnoreCase(o2.substring(j));
    }
}
