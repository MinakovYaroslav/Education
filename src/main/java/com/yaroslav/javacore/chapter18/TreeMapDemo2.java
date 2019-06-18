package com.yaroslav.javacore.chapter18;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapDemo2 {

    public static void main(String[] args) {
        TreeMap<String, Double> treeMap = new TreeMap<>(new TComp());
        treeMap.put("Yan Lee", 2323.43);
        treeMap.put("Ree Chi", 3454.34);
        treeMap.put("Hao Lee", 2323.43);
        treeMap.put("John Pain", 8797.32);
        treeMap.put("Reek Peers", 3945.45);

        Set<Map.Entry<String, Double>> set = treeMap.entrySet();

        set.forEach((e -> System.out.println(e.getKey() + ": " + e.getValue())));
    }
}
