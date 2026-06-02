package com.indivaragroup.implement.linkhashset;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetLearn {
    public static void main(String[] args) {
        Set<String> hashSet = new HashSet<>();
        Set<String> linkHashSet = new LinkedHashSet<>();

        String[] buah = {"Pisang", "Mangga", "Apel", "Jeruk"};
        for(String item : buah) {
            hashSet.add(item);
            linkHashSet.add(item);
        }

        System.out.println("HashTet : " + hashSet);
        System.out.println("LinkHasSet : " + linkHashSet); // tidk random seperti hashset
    }
}
