package com.indivaragroup.iterator.exam;

import java.util.ArrayList;
import java.util.List;

public class ExampleCollectionRemove {
    public static void getCollectionToRemove() {

        List<String> buah = new ArrayList<>();
        buah.add("Apel");
        buah.add("Mangga");
        buah.add("Jeruk");
        buah.add("Pisang");

        System.out.println("Sebelum: " + buah);
        // Output: Sebelum: [Apel, Mangga, Jeruk, Pisang]

        // Menghapus berdasarkan nilai
        buah.remove("Mangga");
        System.out.println("Setelah remove Mangga: " + buah);
        // Output: Setelah remove Mangga: [Apel, Jeruk, Pisang]

        // Menghapus beberapa data sekaligus
        List<String> hapusList = List.of("Apel", "Pisang");
        buah.removeAll(hapusList);
        System.out.println("Setelah removeAll: " + buah);
        // Output: Setelah removeAll: [Jeruk]

        // Menghapus semua data
        buah.clear();
        System.out.println("Setelah clear: " + buah);
        // Output: Setelah clear: []
        System.out.println("Kosong? " + buah.isEmpty());
        // Output: Kosong? true
    }
}
