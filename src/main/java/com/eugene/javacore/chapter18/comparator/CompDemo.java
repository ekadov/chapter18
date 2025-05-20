package com.eugene.javacore.chapter18.comparator;

import java.util.TreeSet;

public class CompDemo {
    public static void main(String[] args) {
        TreeSet<String> treeSet = new TreeSet<>(new MyComp());

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
