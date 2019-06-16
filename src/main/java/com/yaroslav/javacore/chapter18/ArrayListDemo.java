package com.yaroslav.javacore.chapter18;

import java.util.ArrayList;

public class ArrayListDemo {

    public static void main(String[] args) {

        //Create ArrayList of Strings
        ArrayList<String> strings = new ArrayList<String>();
        System.out.println("Base size ArrayList: " + strings.size());

        //Add elements in ArrayList
        for (int i = 0; i < 10; i++) {
            strings.add("Number " + i);
        }

        //Print ArrayList
        System.out.println("Size ArrayList after adding: " + strings.size());

        //Remove elements from ArrayList
        strings.remove("Number 1");
        strings.remove(2);

        System.out.println("Size ArrayList after removing: " + strings.size());

        System.out.println("ArrayList content: " + strings);

    }


}
