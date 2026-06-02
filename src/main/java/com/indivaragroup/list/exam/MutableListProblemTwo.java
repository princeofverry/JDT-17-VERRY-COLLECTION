package com.indivaragroup.list.exam;

import java.util.ArrayList;
import java.util.List;

public class MutableListProblemTwo {
    public static List getData() {
        List data = new ArrayList<>();
        data.add("apel");
        data.add("Mangga");
        data.add("Jeruk");
        return data;
    }

    public static void main(String[] args) {
        List data = getData();

        System.out.println("Data awal : " + data);

        // menambahkan data di mutable list
        data.add("Pisang");

        System.out.println("Setelah diubah : " + data);
    }
}
