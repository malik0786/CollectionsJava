package com.practice;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapDemo {
    public static void main(String[] args) {

        Map<String,Integer> map = new HashMap<>();
        map.put("Roll no", 12);
        map.put("Class", 6);
        map.put("Admission no",2143562);



        for (Map.Entry<String,Integer> e : map.entrySet()){
            System.out.println(e.getKey()+"  "+e.getValue());
        }
    }
}
