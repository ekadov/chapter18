package com.eugene.javacore.chapter18;

import java.util.TreeSet;

public class TreeSetDemo {

    public static void main(String[] args) {
        // Create tree-set
        TreeSet<String> hashSet = new TreeSet<>();

        hashSet.add("Beta");
        hashSet.add("Alpha");
        hashSet.add("Eta");
        hashSet.add("Gamma");
        hashSet.add("Epsilon");
        hashSet.add("Omega");

        System.out.println(hashSet);
    }
}
