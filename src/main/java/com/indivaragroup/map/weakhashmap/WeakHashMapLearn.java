package com.indivaragroup.map.weakhashmap;

import java.util.WeakHashMap;

public class WeakHashMapLearn {
    public static void main(String[] args) {
        WeakHashMap<String, String> weakMap = new WeakHashMap<>();

        String key1 = new String("User 1");
        String key2 = new String("User 2");
        String key3 = new String("User 3");

        weakMap.put(key1, "Andi");
        weakMap.put(key2, "Budi");
        weakMap.put(key3, "Citra");

        System.out.println("Data awal : " + weakMap);

        // key yang tidak direferensikan lagi akan bisa dhapus oleh GC (garbage collections)
        key1 = null;
        key2 = null;

        System.gc();

        System.out.println("Data setelah GC : "  + weakMap);
    }
}
