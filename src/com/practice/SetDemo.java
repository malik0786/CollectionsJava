package com.practice;

import java.util.HashSet;
import java.util.Iterator;

public class SetDemo {
    public static void main(String[] args) {
        HashSet<String > hash = new HashSet<String>();
        hash.add("John");
        hash.add("Ash");
        hash.add("Joe");
        hash.add("Jackson");
        hash.add("Rahul");
        hash.add("Rahul");

        Iterator<String> itr = hash.iterator();
        while (itr.hasNext()){
            String str =itr.next();
            System.out.println(str);

        }
        System.out.println(hash.size());
        hash.remove("Ash");
        System.out.println("After removing Ash "+hash.size());

        if (hash.contains("Ash")){
            System.out.println("Sucesss");
        }else
            System.out.println("not sucess");
    }
}
