package com.yaroslav.javacore.chapter18;

import java.util.HashMap;
import java.util.Map;

public class MapDemo {

    public static void main(String[] args) {

        Map <String, String> books = new HashMap<>();
        books.put("Война и мир", "Лев Толстой");
        books.put("Философия Java", "Брюс Эккель");
        books.put("Преступление и наказание", "Федор Достоевский");
        books.put("Братья Карамазовы", "Федор Достоевский");
        books.put("Властелин Колец", "Джон Толкин");
        books.forEach((a,b) -> System.out.println("Название книги: " + a + ". Автор: " + b));

        books.compute("Философия Java", (a,b) -> b+", крутой чувак");
        System.out.println("_______________________");

        books.forEach((a,b) -> System.out.println("Название книги: " + a + ". Автор: " + b));
        System.out.println("_______________________");

        books.computeIfAbsent("Гарри Поттер и узник Азкабана", b -> getHarryPotterAuthor());

        books.forEach((a,b) -> System.out.println("Название книги: " + a + ". Автор: " + b));
    }

    public static String getHarryPotterAuthor() {
        return "Джоан Роулинг";
    }
}
