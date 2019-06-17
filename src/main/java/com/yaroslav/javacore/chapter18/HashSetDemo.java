package com.yaroslav.javacore.chapter18;

import java.util.HashSet;

public class HashSetDemo {

    public static void main(String[] args) {

        //Create HashSet
        HashSet<String> strings = new HashSet<String>();

        //Add elements
        strings.add("One");
        strings.add("Two");
        strings.add("Three");
        strings.add("Four");
        strings.add("Five");

        System.out.println(strings);

    }
}
