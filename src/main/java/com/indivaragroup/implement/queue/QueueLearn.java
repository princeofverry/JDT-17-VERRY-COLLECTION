package com.indivaragroup.implement.queue;

import java.util.ArrayDeque;
import java.util.Queue;

public class QueueLearn {
    public static void main(String[] args) {
        Queue antrian = new ArrayDeque<>();

        antrian.offer("PELANGGAN A");
        antrian.offer("PELANGGAN B");
        antrian.offer("PELANGGAN C");

        System.out.println("Antrian : " + antrian);
        System.out.println("Palng depan : " + antrian.peek());

        while(!antrian.isEmpty()) {
            System.out.println("Melayani: " + antrian.poll());
        }
    }
}
