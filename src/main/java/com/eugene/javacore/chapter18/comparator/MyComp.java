package com.eugene.javacore.chapter18.comparator;

import java.util.Comparator;

public class MyComp implements Comparator<String> {
    @Override
    public int compare(String o1, String o2) {
        return o2.compareTo(o1);
    }
}
