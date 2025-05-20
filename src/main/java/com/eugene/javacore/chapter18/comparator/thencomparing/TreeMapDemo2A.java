package com.eugene.javacore.chapter18.comparator.thencomparing;

import java.util.Comparator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapDemo2A {

    public static final String KEY_1 = "John Doe";

    public static void main(String[] args) {
        CompLastNames compLastNames = new CompLastNames();
        Comparator<String> comparator = compLastNames.thenComparing(new CompThenByFirstName());

        TreeMap<String, Double> hashMap = new TreeMap<>(comparator);

        hashMap.put(KEY_1, 321432.234);
        hashMap.put("Ralph Simmons", 32.234);
        hashMap.put("Cat Stroke", 0.234);
        hashMap.put("Boss Graham", 32.4);
        hashMap.put("Steve Mqueen", -321.234);

        Set<Map.Entry<String, Double>> set = hashMap.entrySet();

        for (Map.Entry<String, Double> me : set) {
            System.out.print(me.getKey() + ": ");
            System.out.println(me.getValue());
        }
        System.out.println();

        double balance = hashMap.get(KEY_1);
        hashMap.put(KEY_1, balance + 1000);
        System.out.println("New balance for " + KEY_1 + ": " + hashMap.get(KEY_1));
    }
}
