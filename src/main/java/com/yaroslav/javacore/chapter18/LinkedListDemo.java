package com.yaroslav.javacore.chapter18;

import java.util.LinkedList;

public class LinkedListDemo {

    public static void main(String[] args) {

        //Create LinkedList
        LinkedList<String> strings = new LinkedList<String>();

        //Add elements to LinkedList
        strings.add("F");
        strings.add("B");
        strings.add("D");
        strings.add("E");
        strings.add("C");
        strings.addLast("Z");
        strings.addFirst("A");
        strings.add(1, "A2");

        System.out.println("LinkedList content: " + strings);

        //Remove elements from LinkedList
        strings.remove("F");
        strings.remove(2);

        System.out.println("LinkedList content after removing: " + strings);

        //Remove first and last element
        strings.removeFirst();
        strings.removeLast();

        System.out.println("LinkedList content after removing first and last element: "+ strings);

        //Get and set value
        String val = strings.get(2);
        strings.set(2, val + " changed");

        System.out.println("linkedList content after change: " + strings);


    }
}
