package com.eugene.javacore.chapter18;

import java.util.Properties;
import java.util.Set;

public class PropertiesDemoDef {
    public static void main(String[] args) {
        Properties defList = new Properties();
        defList.put("Florida", "Stringfl");
        defList.put("Missouri", "Jeffer");
        Properties capitals = new Properties(defList);
        capitals.put("Washin", "Olymp");
        capitals.put("Calif", "Sacram");
        capitals.put("Indiana", "Indianapolis");

        Set<?> states = capitals.keySet();
        for (Object state : states) {
            System.out.println("Capital of " + state + " - " + capitals.getProperty((String) state) + ".");
        }

        // Now Florida is in the deFlist
        String string = capitals.getProperty("Florida");
        System.out.println("Capital of Florida is: " + string);
    }
}
