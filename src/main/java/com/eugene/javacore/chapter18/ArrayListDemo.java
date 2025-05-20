package com.eugene.javacore.chapter18;

import java.util.ArrayList;

public class ArrayListDemo {
    public static void main(String[] args) {
        //создать списочный массив
        ArrayList<String> al = new ArrayList<>();
        System.out.println(
                "Initial size of al:" + al.size());
        //ввести элементы в списочный массив
        al.add("C");
        al.add("A");
        al.add("E");
        al.add("B");
        al.add("D");
        al.add("F");
        al.add(1, "A2");
        System.out.println(
                "The size of al after filling:" +
                        al.size());
        //вывести списочный массив
        System.out.println("al:" + al);
        //удалить элементы из списочного массива
        al.remove("F");
        al.remove(2);
        System.out.println(
                "The size of al after deleting:" +
                        al.size());
        System.out.println("al:" + al);
    }

}
