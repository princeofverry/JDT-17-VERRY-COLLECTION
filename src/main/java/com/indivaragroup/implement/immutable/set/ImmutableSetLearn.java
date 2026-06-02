package com.indivaragroup.implement.immutable.set;

import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Set;

public class ImmutableSetLearn {
    public static void main(String[] args) {
        // ksong
        Set setKosong = Collections.emptySet();

        Set setSatu = Collections.singleton("Apel");

        Set setModern = Set.of("Apel", "Manggal", "Jeruk");

        Set excitingSet = new LinkedHashSet<>();
        excitingSet.add("Manggo");
        excitingSet.add("Jeruk");
        excitingSet.add("Keren");

        Set<String> immutableSet = Collections.unmodifiableSet(excitingSet);

        System.out.println(setKosong);
        System.out.println(setSatu);
        System.out.println(setModern);
        System.out.println(immutableSet);

//        immutableSet.add("Joko"); penyebab error
//        System.out.println(immutableSet);
    }
}
