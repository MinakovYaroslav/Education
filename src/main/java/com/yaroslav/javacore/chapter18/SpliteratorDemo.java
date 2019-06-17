package com.yaroslav.javacore.chapter18;

import java.util.ArrayList;
import java.util.Spliterator;

public class SpliteratorDemo {

    public static void main(String[] args) {

        ArrayList<Double> doubles = new ArrayList<Double>();

        doubles.add(1.0);
        doubles.add(2.0);
        doubles.add(3.0);
        doubles.add(4.0);
        doubles.add(5.0);

        System.out.println("List content: ");
        Spliterator<Double> spliterator = doubles.spliterator();
        while (spliterator.tryAdvance(System.out::println));
        System.out.println();

        spliterator = doubles.spliterator();
        final ArrayList<Double> sqrs = new ArrayList<Double>();
        while (spliterator.tryAdvance(d -> sqrs.add(Math.sqrt(d))));

        System.out.println("Sqrs content: ");
        spliterator = sqrs.spliterator();
        spliterator.forEachRemaining(System.out::println);
        System.out.println();
    }
}
