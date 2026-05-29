package com.indivaragroup.list.exam;

import java.util.ArrayList;
import java.util.List;

public class ExampleList {

    public static void getExampleList() {

        // Membuat ArrayList
        List<String> mahasiswa = new ArrayList<>();

        // Menambah data
        mahasiswa.add("Budi");
        mahasiswa.add("Siti");
        mahasiswa.add("Andi");
        mahasiswa.add("Budi"); // boleh duplikat!

        System.out.println("Data: " + mahasiswa);
        // Output: Data: [Budi, Siti, Andi, Budi]

        // Akses berdasarkan index
        System.out.println("Index 0: " + mahasiswa.get(0)); // Budi
        System.out.println("Index 2: " + mahasiswa.get(2)); // Andi

        // Ubah data di index tertentu
        mahasiswa.set(1, "Dewi");
        System.out.println("Setelah set: " + mahasiswa);
        // Output: Setelah set: [Budi, Dewi, Andi, Budi]

        // Hapus berdasarkan index
        mahasiswa.remove(0);
        System.out.println("Setelah remove index 0: " + mahasiswa);
        // Output: Setelah remove index 0: [Dewi, Andi, Budi]

        System.out.println("Jumlah: " + mahasiswa.size()); // 3
    }
}
