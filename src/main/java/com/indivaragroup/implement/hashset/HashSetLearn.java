package com.indivaragroup.implement.hashset;

import java.util.HashSet;

public class HashSetLearn {
    public static void main(String[] args) {
        HashSet<String> buah = new HashSet<>();

        buah.add("Apel");
        buah.add("Pisang");
        buah.add("Mangga");
        buah.add("Buahlil");
        buah.add("tetst");
        buah.add("Apel"); // ga bisa duplikat jadi ga kepanggil

        System.out.println("Isi hashset " + buah);
        System.out.println("Mengandung Pisang? " + buah.contains("Pisang"));
        System.out.println("Jumlah data unik: " + buah.size());
    }
}
