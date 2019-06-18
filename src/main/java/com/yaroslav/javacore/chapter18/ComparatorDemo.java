package com.yaroslav.javacore.chapter18;

        import java.util.TreeSet;

public class ComparatorDemo {

    public static void main(String[] args) {

        TreeSet<String> strings = new TreeSet<>(new CustomComparator());

        strings.add("C");
        strings.add("A");
        strings.add("E");
        strings.add("F");
        strings.add("D");
        strings.add("G");
        strings.add("R");

        strings.forEach(System.out::print);
    }
}
