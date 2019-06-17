package com.yaroslav.javacore.chapter18;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class IteratorDemo {

    public static void main(String[] args) {

        //Create ArrayList
        ArrayList<String> strings = new ArrayList<String>();

        //Add elements
        strings.add("C");
        strings.add("A");
        strings.add("E");
        strings.add("D");
        strings.add("F");
        strings.add("B");

        //Use iterator
        System.out.println("Base ArrayList content: ");
        Iterator<String> iterator = strings.iterator();
        while (iterator.hasNext()) {
            String element = iterator.next();
            System.out.print(element + " ");
        }
        System.out.println();

        //Change elements
        ListIterator<String> listIterator = strings.listIterator();
        while (listIterator.hasNext()) {
            String element = listIterator.next();
            listIterator.set(element + "+");
        }

        System.out.println("Changed ArrayList content: ");
        iterator = strings.iterator();
        while (iterator.hasNext()) {
            String element = iterator.next();
            System.out.print(element + " ");
        }
        System.out.println();

        //Reverse print ArrayList
        System.out.println("Changed ArrayList content reverse print: ");
        while (listIterator.hasPrevious()) {
            String element = listIterator.previous();
            System.out.print(element + " ");
        }
        System.out.println();
    }
}
