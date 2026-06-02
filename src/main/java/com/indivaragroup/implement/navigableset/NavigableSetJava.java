package com.indivaragroup.implement.navigableset;

import java.util.NavigableSet;
import java.util.TreeSet;

public class NavigableSetJava {
    public static void main(String[] args) {
        NavigableSet<Integer> set = new TreeSet<>();
        set.add(1);
        set.add(3);
        set.add(2);
        set.add(8);
        set.add(7);
        set.add(5);
        set.add(4);

        System.out.println("Isi NavigableSet : "+ set);
        System.out.println("Lower(6) : "+ set.lower(6) + " lebih kecil dari 6");
        System.out.println("Floor(6)  : "+ set.floor(6)  + " lebih besar atau sama dengan 6");
        System.out.println("hgher(6) : "+ set.higher(6) +  " lebih besar dari 6");
        System.out.println("ceiling(6) : "+ set.ceiling(6) + " lebih besar atau sama dengan 6");
        System.out.println("Urutan terbalik : "+ set.descendingSet());
    }
}
