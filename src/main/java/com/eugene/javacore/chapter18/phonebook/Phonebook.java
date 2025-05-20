package com.eugene.javacore.chapter18.phonebook;

import java.io.*;
import java.util.Properties;

public class Phonebook {
    public static void main(String[] args) {
        Properties ht = new Properties();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String name, number;
        FileInputStream fin = null;
        boolean changed = false;

        // Open file phonebook.dat
        try {
            fin = new FileInputStream("phonebook.dat");
        } catch (FileNotFoundException ignore) {
        }

        // IF the book is created, load it
        try {
            if (fin != null) {
                ht.load(fin);
                fin.close();
            }
        } catch (IOException e) {
            System.out.println("Error reading file");
        }


    }
}
