package com.eugene.javacore.chapter18;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;

public class AlgorithmsDemo {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(-8);
        list.add(20);
        list.add(-20);
        list.add(8);

        Comparator<Integer> comparator = Collections.reverseOrder();

        list.sort(comparator);

        System.out.println("The list had been sorted: ");

        for (int i : list) {
            System.out.print(i + " ");
        }

        System.out.println();

        Collections.shuffle(list);

        System.out.println("Shuffled list: " + list);

        System.out.println("Minimum: " + Collections.min(list));
        System.out.println("Maximum: " + Collections.max(list));
    }
}
