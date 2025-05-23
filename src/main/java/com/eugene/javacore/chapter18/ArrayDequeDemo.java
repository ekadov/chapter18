package com.eugene.javacore.chapter18;

import java.util.ArrayDeque;

public class ArrayDequeDemo {
    public static void main(String[] args) {
        ArrayDeque<String> arrayDeque = new ArrayDeque<>();

        arrayDeque.push("A");
        arrayDeque.push("B");
        arrayDeque.push("D");
        arrayDeque.push("E");
        arrayDeque.push("F");

        System.out.print("Get from stack: ");

        while (arrayDeque.peek() != null)
            System.out.print(arrayDeque.pop() + " ");

        System.out.println();
    }
}
