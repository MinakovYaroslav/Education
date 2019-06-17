package com.yaroslav.javacore.chapter18;

import java.util.TreeSet;

public class TreeSetDemo {

    public static void main(String[] args) {

        //Create TreeSet
        TreeSet<String> strings = new TreeSet<String>();

        //Add elements
        strings.add("C");
        strings.add("A");
        strings.add("D");
        strings.add("B");
        strings.add("E");

        System.out.println(strings);
        System.out.println(strings.subSet("A", true, "C", true));
    }
}
