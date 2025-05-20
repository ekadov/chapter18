package com.eugene.javacore.chapter18;

import java.util.ArrayList;
import java.util.Spliterator;

public class SpliteratorDemo {
    public static void main(String[] args) {
        ArrayList<Double> arrayList = new ArrayList<>();

        arrayList.add(1.0);
        arrayList.add(2.0);
        arrayList.add(3.0);
        arrayList.add(4.0);
        arrayList.add(5.0);

        // Call tryAdvance to print array
        System.out.print("Initial: ");
        Spliterator<Double> spliterator = arrayList.spliterator();
        while (spliterator.tryAdvance((n) -> System.out.println(n))) ;
        System.out.println();

        // Create new array or sqrt's of arrayList
        spliterator = arrayList.spliterator();
        ArrayList<Double> sqrs = new ArrayList<>();
        while (spliterator.tryAdvance((n) -> sqrs.add(Math.sqrt(n)))) ;

        // Call forEachRemaining to print array
        System.out.print("Array: ");
        spliterator = sqrs.spliterator();
        spliterator.forEachRemaining((n) -> System.out.println(n));
        System.out.println();

    }
}
