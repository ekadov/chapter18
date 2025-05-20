package com.eugene.javacore.chapter18.address;

import java.util.LinkedList;

public class MailingList {
    public static void main(String[] args) {
        LinkedList<Address> addresses = new LinkedList<>();

        addresses.add(new Address("Name 1", "Street 1", "City 1", "State 1", "Code 1"));
        addresses.add(new Address("Name 2", "Street 2", "City 2", "State 2", "Code 2"));
        addresses.add(new Address("Name 3", "Street 3", "City 3", "State 3", "Code 3"));

        for (Address address : addresses) {
            System.out.println(address + "\n");
        }
        System.out.println();

    }
}
