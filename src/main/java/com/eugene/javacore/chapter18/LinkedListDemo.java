package com.eugene.javacore.chapter18;

import java.util.LinkedList;

public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();

        list.add("F");
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        list.add("G");
        list.addLast("Z");
        list.addFirst("A");

        list.add(1, "A2");

        System.out.println("Initial: " + list);

        list.remove("F");
        list.remove(2);

        System.out.println("list: " + list);

        list.removeFirst();
        list.removeLast();

        System.out.println("list: " + list);

        var val = list.get(2);
        list.set(2, val + " edited");
        System.out.println("list final: " + list);
    }
}
