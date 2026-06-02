package com.indivaragroup.list.exam;

import java.util.ArrayList;
import java.util.List;

public class MutableListProblem {

    public static void printData(List data) {
        data.add("data tidak sengaja");
        System.out.println("Di dalam method: " + data);
    }

    public static void main(String[] args) {
        ArrayList data = new ArrayList<>();
        data.add("Budi");
        data.add("Ari");

        // tambah method
        System.out.println("Sebelum method dipanggil : " + data); // budi, ari

        printData(data); // budi, ari, data tidak sengaja

        System.out.println("Setelah method dipanggil : " + data); // budi, ari, data tidak disengaja
    }
}
