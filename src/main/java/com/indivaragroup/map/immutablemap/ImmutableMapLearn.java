package com.indivaragroup.map.immutablemap;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class ImmutableMapLearn {
    public static void main(String[] args) {
        Map mapKosong = Collections.emptyMap();

        Map satuData = Collections.singletonMap("Key", "Value");

        Map mapModern = Map.of("k1", "v1", "k2", "v2", "k3", "v3");

        Map existingMap = new HashMap<>();
        existingMap.put("Nama", "Budi");
        existingMap.put("Kota", "Jakarta");
        Map immutableDariExisting = Collections.unmodifiableMap(existingMap);
        System.out.println("Map kosong = " + mapKosong);
        System.out.println("satuData = " + satuData);
        System.out.println("Map Modern = " + mapModern);
        System.out.println("immutableDariExisting = " + immutableDariExisting);

        try {
            mapKosong.put("x", "y");
        } catch (UnsupportedOperationException e) {
            System.out.println("mapKosong tidak diubah : " + e);
        }

        try {
            satuData.put("x", "y");
        } catch(UnsupportedOperationException e) {
            System.out.println("satuData tidak bisa diubah : " + e);
        }

        try {
            mapModern.put("x", "y");
        } catch (UnsupportedOperationException e) {
            System.out.println("mapModern tidak bisa diubah : " + e);
        }

        try {
            immutableDariExisting.put("x", "y");
        } catch (UnsupportedOperationException e) {
            System.out.println("immutableDariExisting tidak bisa diubah : " + e);
        }
    }
}
