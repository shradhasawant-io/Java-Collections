package com.example;

import java.util.PriorityQueue;

public class PriorityQueueI {
    public static void main(String[] args) {
        //Min Heap
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.offer(10);
        pq.offer(30);
        pq.offer(20);
        pq.offer(30);
        pq.offer(50);
        pq.offer(60);
        pq.offer(60);
        System.out.println(pq);

        System.out.println(pq.poll());
        System.out.println(pq.poll());
        System.out.println(pq.poll());
        System.out.println(pq.poll());
        System.out.println(pq.poll());
        System.out.println(pq.poll());
        System.out.println(pq.poll());
        System.out.println(pq.poll());

        //Max Heap
        PriorityQueue<Integer> pq2 = new PriorityQueue<>((a,b) -> b-a);
        pq2.offer(10);
        pq2.offer(30);
        pq2.offer(20);
        pq2.offer(40);
        pq2.offer(50);
        pq2.offer(60);

        System.out.println(pq2.poll());
        System.out.println(pq2.poll());
        System.out.println(pq2.poll());
        System.out.println(pq2.poll());
        System.out.println(pq2.poll());
        System.out.println(pq2.poll());
    }
}
