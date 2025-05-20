package com.eugene.javacore.chapter18.comparator;

import java.util.Comparator;

public class TComp implements Comparator<String> {
    @Override
    public int compare(String o1, String o2) {
        int i, j, k;

        // Find lastName starting index
        i = o1.lastIndexOf(' ');
        j = o2.lastIndexOf(' ');
        k = o1.substring(i).compareTo(o2.substring(j));

        // Equal lastNames, check all
        if (k == 0) {
            return o1.compareTo(o2);
        } else return k;
    }
}
