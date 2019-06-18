package com.yaroslav.javacore.chapter18;

import java.util.Comparator;

public class CustomComparator implements Comparator<String> {

    @Override
    public int compare(String o1, String o2) {
        String a,b;
        a = o1;
        b = o2;
        return b.compareTo(a);
    }
}
