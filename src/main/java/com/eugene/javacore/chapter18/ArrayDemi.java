package com.eugene.javacore.chapter18;

import java.util.Arrays;

public class ArrayDemi {
    public static void main(String[] args) {
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = -3 * i;
        }

        System.out.println("Initial array: ");
        display(array);
        Arrays.sort(array);
        System.out.println("Sorted: ");
        display(array);

        Arrays.fill(array, 2, 6, -1);
        System.out.println("Filled: ");
        display(array);

        Arrays.sort(array);
        System.out.println("Sorted: ");
        display(array);

        System.out.println("-9 is at the position: ");
        int index = Arrays.binarySearch(array, -9);
        System.out.println(index);
    }

    static void display(int[] array) {
        for (int i : array) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
