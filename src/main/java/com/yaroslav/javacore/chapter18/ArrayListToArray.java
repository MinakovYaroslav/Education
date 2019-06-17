package com.yaroslav.javacore.chapter18;

import java.util.ArrayList;

public class ArrayListToArray {

    public static void main(String[] args) {

        //Cast ArrayList to Array

        //Create ArrayList
        ArrayList<Integer> integers = new ArrayList<Integer>();

        //Add elements to ArrayList
        for (int i = 1; i < 11; i++) {
            integers.add(i);
        }

        System.out.println("ArrayList content: " + integers);

        //Get simple Array
        Integer[] array = new Integer[integers.size()];
        array = integers.toArray(array);

        int sum = 0;

        //Sum Array elements
        for (Integer i : array) sum += i;

        System.out.println("Sum: " + sum);
    }
}
