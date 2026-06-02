package com.indivaragroup.map.sortedmap;

import java.lang.ref.SoftReference;
import java.util.SortedMap;
import java.util.TreeMap;

public class SortedMapLearn {
    public static void main(String[] args) {
        TreeMap nilaiMahasiswa = new TreeMap<>();

        nilaiMahasiswa.put("Citra", 88);
        nilaiMahasiswa.put("Andi", 75);
        nilaiMahasiswa.put("Budi", 92);
        nilaiMahasiswa.put("Dewi", 85);

        System.out.println("Isi TreeMap: " + nilaiMahasiswa);

        System.out.println("Key pertama : " + nilaiMahasiswa.firstKey());
        System.out.println("Key terakhir : " + nilaiMahasiswa.lastKey());

        SortedMap<String, Integer> dataSebelumC = nilaiMahasiswa.headMap("C");
        System.out.println("headMap(\"C\"): " + dataSebelumC);

        SortedMap<String, Integer> dataMulaiC = nilaiMahasiswa.tailMap("C");
        System.out.println("tailMap(\"C\"): " + dataMulaiC);
    }
}
