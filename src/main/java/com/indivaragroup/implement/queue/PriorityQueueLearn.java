package com.indivaragroup.implement.queue;

import java.util.Collection;
import java.util.Collections;
import java.util.PriorityQueue;

public class PriorityQueueLearn {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        pq.offer(1);
        pq.offer(2);
        pq.offer(6);
        pq.offer(3);
        pq.offer(8);
        pq.offer(7);
        pq.offer(4);
        pq.offer(5);

        System.out.println("Priority Queue urutan internal : " + pq);

        System.out.print("Keluar dair priority queue (terkecil dulu) : " );
        while(!pq.isEmpty()) {
            System.out.print(pq.poll() + " ");
        }
        System.out.println();

        PriorityQueue<Integer> pqTerbalik = new PriorityQueue<>(Collections.reverseOrder());
        pqTerbalik.offer(3);
        pqTerbalik.offer(1);
        pqTerbalik.offer(4);
        pqTerbalik.offer(10);
        pqTerbalik.offer(5);
        pqTerbalik.offer(6);

        System.out.println("PriorityQueue reverse (urutan internal) : " + pqTerbalik);

        System.out.print("Keluar dari priority queue reverse (terbsar dulu)");
        while(!pqTerbalik.isEmpty()) {
            System.out.print(pqTerbalik.poll() + " ");
        }
        System.out.println();
    }
}
