package com.indivaragroup.map.hashmap;

import java.util.HashMap;
import java.util.Map;

public class HashMapLearn {
    public static void main(String[] args) {
        HashMap<String, Integer> nilaiMahasiswa = new HashMap<>();

        nilaiMahasiswa.put("Joko", 45);
        nilaiMahasiswa.put("Budi", 80);
        nilaiMahasiswa.put("Andi", 75);

        System.out.println("NILAI SEMUA : ");
        System.out.println(nilaiMahasiswa);

        System.out.println("Nilai Budi : " + nilaiMahasiswa.get("Budi"));

        // update nilai
        nilaiMahasiswa.put("Joko", 75);
        System.out.println("Apakah nilai joko ada? " + nilaiMahasiswa.containsKey("Joko"));

        nilaiMahasiswa.remove("Andi");

        System.out.println("Data setelah update dan hapus: ");
        for (Map.Entry<String, Integer> entry : nilaiMahasiswa.entrySet()) {
            System.out.println(entry.getKey() + " = " + entry.getValue());
        }
    }

}
