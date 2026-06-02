package com.indivaragroup.implement.sorted.set;

import java.util.TreeSet;

public class SortedSetLearn {
    public static void main(String[] args) {
        TreeSet<Person> people = new TreeSet<>(new PersonComparator());

        people.add(new Person("Budi", 20));
        people.add(new Person("Ari", 21));
        people.add(new Person("Joko", 30));

        System.out.println(people.toString());
    }
}
