package com.indivaragroup.list.exam;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ImmutableList {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        list.add("Jawa");
        list.add("Sunda");
        list.add("Apel");

        List<String> immutableList = Collections.unmodifiableList(list);

        System.out.println("Isi immutablelist : " + immutableList);

        try {
            immutableList.add("Pisang");
        } catch (UnsupportedOperationException e) {
            System.out.println("Gagal menambahkan data: " + e.getMessage());
        }
    }
}
