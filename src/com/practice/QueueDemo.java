package com.practice;

import java.util.PriorityQueue;

public class QueueDemo {

    public static void main(String[] args) {
        PriorityQueue<Integer> p = new PriorityQueue<Integer>();
        for (int i=10; i>0; i--){
            p.add(i);
        }

        System.out.println(p.peek());
        p.poll();
        System.out.println("Queue after poll " + p.peek());
    }
}
