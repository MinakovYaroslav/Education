package com.yaroslav.javacore.chapter18;

import java.util.ArrayList;

public class ForEachDemo {

    public static void main(String[] args) {
        ArrayList<Integer> integers = new ArrayList<Integer>();

        integers.add(1);
        integers.add(2);
        integers.add(3);
        integers.add(4);
        integers.add(5);

        System.out.print("Base content: ");

        for (Integer i : integers) {
            System.out.print(i + " ");
        }
        System.out.println();

        //Sum
        int sum = 0;

        for (Integer i : integers) {
            sum += i;
        }

        System.out.println("Sum: " + sum);

    }
}
