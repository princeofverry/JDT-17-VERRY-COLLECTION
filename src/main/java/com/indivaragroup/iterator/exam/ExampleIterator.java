package com.indivaragroup.iterator.exam;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ExampleIterator {

    public static void getExampleIterator() {

        // Membuat list buah-buahan
        List buah = new ArrayList<>();
        buah.add("Apel");
        buah.add("Mangga");
        buah.add("Jeruk");

        // Menggunakan for-each loop (karena List implement Iterable)
        for (Object item : buah) {
            System.out.println("Buah: " + item);
        }

        // Output:
        // Buah: Apel
        // Buah: Mangga
        // Buah: Jeruk

        // Mendapatkan Iterator dari List
        Iterator<String> iterator = buah.iterator();

        // Iterasi menggunakan Iterator
        while (iterator.hasNext()) {
            String item = iterator.next();

            // Hapus "Mangga" saat iterasi berlangsung
            if (item.equals("Mangga")) {
                iterator.remove(); // aman dihapus saat iterasi
            } else {
                System.out.println("Buah: " + item);
            }
        }
    }
}
