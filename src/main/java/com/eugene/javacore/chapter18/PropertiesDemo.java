package com.eugene.javacore.chapter18;

import java.util.Properties;
import java.util.Set;

public class PropertiesDemo {
    public static void main(String[] args) {
        Properties properties = new Properties();
        properties.put("Illinois", "Stringfl");
        properties.put("Missouri", "Jeffer");
        properties.put("Washin", "Olymp");
        properties.put("Calif", "Sacram");
        properties.put("Indiana", "Indianapolis");

        Set<?> set = properties.keySet();
        for (Object state : set) {
            System.out.println("Capital " + state + " - " + properties.getProperty((String) state) + ".");
        }

        // Find state which is not in the list
        String string = properties.getProperty("Florida", "NF");
        System.out.println("State of Florida is: " + string);
    }
}
