package com.eugene.javacore.chapter18;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapDemo {

    public static final String KEY_1 = "Key 1";

    public static void main(String[] args) {
        HashMap<String, Double> hashMap = new HashMap<>();

        hashMap.put(KEY_1, 321432.234);
        hashMap.put("Key 2", 32.234);
        hashMap.put("Key 3", 0.234);
        hashMap.put("Key 4", 32.4);
        hashMap.put("Key 5", -321.234);

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
