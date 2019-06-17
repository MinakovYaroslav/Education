package com.yaroslav.javacore.chapter18;

import java.util.LinkedHashSet;

public class LinkedHashSetDemo {

    public static void main(String[] args) {

        //Create LinkedHashSet
        LinkedHashSet<String> strings = new LinkedHashSet<String>();

        //Add elements
        strings.add("One");
        strings.add("Three");
        strings.add("Two");
        strings.add("Four");
        strings.add("Five");

        System.out.println(strings);

    }
}
