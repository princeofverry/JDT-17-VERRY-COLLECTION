package com.indivaragroup.implement.sorted.set;

import com.sun.source.tree.Tree;

import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSetJava {
    public static void main(String[] args) {
        SortedSet<Integer> angka = new TreeSet<>();

        angka.add(2);
        angka.add(98);
        angka.add(10);
        angka.add(4);
        angka.add(12);
        angka.add(1);

        System.out.println("DATA TERURUT : " + angka);

        TreeSet<Integer> treeSet = (TreeSet<Integer>) angka;
        System.out.println("NILAI TERKECIL : " + treeSet.first());
        System.out.println("NILAI TERBESAR : " + treeSet.last());

        System.out.println("headSet(5): " + treeSet.headSet(5));
        System.out.println("TailSet(5) :" + treeSet.tailSet(5) );
        System.out.println("SubSet(3, 8) : " + treeSet.subSet(3, 8));
    }
}
