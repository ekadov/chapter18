package com.eugene.javacore.chapter18.comparator;

import java.util.Comparator;
import java.util.TreeSet;

public class CompDemo2 {
    public static void main(String[] args) {
        TreeSet<String> treeSet = new TreeSet<>(Comparator.reverseOrder());

        treeSet.add("C");
        treeSet.add("F");
        treeSet.add("A");
        treeSet.add("D");
        treeSet.add("B");
        treeSet.add("E");

        for (String element : treeSet) {
            System.out.print(element + " ");
        }
        System.out.println();


    }

}
