package com.indivaragroup.iterator.exam;

import java.util.ArrayList;
import java.util.List;

public class ExampleCollectionAdd {

    public static void getCollectionToAdd() {

        List<String> nama = new ArrayList<>();

        // Menambah satu data
        nama.add("Budi");
        nama.add("Siti");
        nama.add("Andi");

        System.out.println("Data: " + nama);
        // Output: Data: [Budi, Siti, Andi]

        // Menambah data dari collection lain
        List<String> tambahanNama = new ArrayList<>();
        tambahanNama.add("Dewi");
        tambahanNama.add("Rudi");

        nama.addAll(tambahanNama);

        System.out.println("Setelah addAll: " + nama);
        // Output: Setelah addAll: [Budi, Siti, Andi, Dewi, Rudi]

        System.out.println("Jumlah data: " + nama.size());
        // Output: Jumlah data: 5
    }
}
