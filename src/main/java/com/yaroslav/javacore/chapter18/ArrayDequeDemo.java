package com.yaroslav.javacore.chapter18;

import java.util.ArrayDeque;

public class ArrayDequeDemo {

    public static void main(String[] args) {

        //Create ArrayDeque
        ArrayDeque<String> strings = new ArrayDeque<String>();

        //Add elements
        strings.push("A");
        strings.push("B");
        strings.push("D");
        strings.push("E");
        strings.push("F");

        System.out.println("ArrayDeque content: " + strings);

        while (strings.peek() != null) System.out.print(strings.pop() + " ");
        System.out.println();

    }
}
