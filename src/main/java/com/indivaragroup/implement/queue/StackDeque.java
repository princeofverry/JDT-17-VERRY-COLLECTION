package com.indivaragroup.implement.queue;

import java.util.ArrayDeque;
import java.util.Deque;

public class StackDeque {
    public static void main(String[] args) {
        Deque stack = new ArrayDeque<>();

        // push data spt menumpuk buku
        stack.push("Buku 1");
        stack.push("Buku 2");
        stack.push("Buku 3");

        System.out.println("Tumpukan : " + stack);

        // pop data satu per satu (LIFO)
        while(!stack.isEmpty()) {
            System.out.println("Keluar : " + stack.pop());
        }
    }
}
