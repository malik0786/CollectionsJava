package com.functionalInterface;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Prdicate {
    public static void main(String args[]){
        List<String> list = Arrays.asList("Geek", "GeeksQuiz", "g1", "QA", "Geek2");

        Predicate<String> p = (s -> s.startsWith("G"));

        for (String st: list) {
            if (p.test(st)){
                System.out.println(st);
            }

        }
    }
}
