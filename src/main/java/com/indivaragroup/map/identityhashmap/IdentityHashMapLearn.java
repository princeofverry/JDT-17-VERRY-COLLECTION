package com.indivaragroup.map.identityhashmap;

import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.Map;

public class IdentityHashMapLearn {
    public static void main(String[] args) {
        String key1 = new String("kunci");
        String key2 = new String("kunci");

        Map<String, String> hashMap = new HashMap<>();
        hashMap.put(key1, "Nilai 1");
        hashMap.put(key2, "Nilai 2");

        Map<String, String> identityHashMap = new IdentityHashMap<>();
        identityHashMap.put(key1, "Nilai 1");
        identityHashMap.put(key2, "Nilai 2");

        System.out.println("HashMap size: " + hashMap.size());
        System.out.println("IdentityHashMap Size : " + identityHashMap.size());
    }
}
