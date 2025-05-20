package com.eugene.javacore.chapter18;

import java.util.HashSet;

public class HashSetDemo {

    public static void main(String[] args) {
        // Create hash-set
        HashSet<String> hashSet = new HashSet<>();

        hashSet.add("Beta");
        hashSet.add("Alpha");
        hashSet.add("Eta");
        hashSet.add("Gamma");
        hashSet.add("Epsilon");
        hashSet.add("Omega");

        System.out.println(hashSet);
    }
}
