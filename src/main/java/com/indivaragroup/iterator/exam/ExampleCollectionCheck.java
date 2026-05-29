package com.indivaragroup.iterator.exam;

import java.util.ArrayList;
import java.util.List;

public class ExampleCollectionCheck {

    public static void getCollectionToCheck(String[] args) {

        List<String> buah = new ArrayList<>();
        buah.add("Apel");
        buah.add("Mangga");
        buah.add("Jeruk");

        // Cek apakah data ada
        boolean adaMangga = buah.contains("Mangga");
        System.out.println("Ada Mangga? " + adaMangga);
        // Output: Ada Mangga? true

        boolean adaDurian = buah.contains("Durian");
        System.out.println("Ada Durian? " + adaDurian);
        // Output: Ada Durian? false

        // Cek apakah semua data ada
        List<String> cekList = List.of("Apel", "Jeruk");
        boolean semuaAda = buah.containsAll(cekList);
        System.out.println("Apel & Jeruk ada? " + semuaAda);
        // Output: Apel & Jeruk ada? true

        // Cek ukuran dan kekosongan
        System.out.println("Jumlah data: " + buah.size());
        // Output: Jumlah data: 3
        System.out.println("Kosong? " + buah.isEmpty());
        // Output: Kosong? false
    }
}
