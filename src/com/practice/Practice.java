package com.practice;

import java.util.ArrayList;
import java.util.Iterator;

public class Practice {

    public static void main(String[] args){
        ArrayList<String> al = new ArrayList<String>();
        al.add("jin");
        al.add("jack");
        al.add("joe");
        al.add("jackson");

        Iterator<String> it = al.iterator();
        while (it.hasNext()){
            String s = it.next();
            System.out.println(s);
            if (s.equals("joe")){
                it.remove();
            }
        }


        System.out.println("after removing joe======" + al);

        for (String str: al) {
            System.out.println(str);
        }
    }
}
