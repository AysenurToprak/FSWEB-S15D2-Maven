package org.example;

import org.example.entity.StringSet;

import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Set<String> uniqueWords = StringSet.findUniqueWords();
        System.out.println("Benzersiz kelimeler: " + uniqueWords);
    }
}