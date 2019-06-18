package com.yaroslav.javacore.chapter18;

import java.util.Comparator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class ComparatorDemo2A {

    public static void main(String[] args) {
        CompLastNames cln = new CompLastNames();
        Comparator<String> comparator = cln.thenComparing(new CompThenByFirstName());

        TreeMap<String, Double> treeMap = new TreeMap<>(cln.thenComparing(String::compareToIgnoreCase));
        treeMap.put("John Pain", 8797.32);
        treeMap.put("Yan Lee", 2323.43);
        treeMap.put("Hao Lee", 2323.43);
        treeMap.put("Ree Chi", 3454.34);
        treeMap.put("Reek Peers", 3945.45);

        Set<Map.Entry<String, Double>> set = treeMap.entrySet();

        set.forEach((e -> System.out.println(e.getKey() + ": " + e.getValue())));
    }
}
