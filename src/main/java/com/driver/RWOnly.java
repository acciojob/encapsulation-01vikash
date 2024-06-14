package com.driver;

public class RWOnly {
    private static String name;


    public static String getName() {
        return name;
    }

    public static void setName(String name) {
        RWOnly.name = name;
    }
}
