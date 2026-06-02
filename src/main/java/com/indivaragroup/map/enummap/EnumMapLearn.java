package com.indivaragroup.map.enummap;

import com.indivaragroup.implement.enumset.Hari;

import java.util.EnumMap;
import java.util.Map;

public class EnumMapLearn {
    public static void main(String[] args) {
        EnumMap<Hari, String> jadwal = new EnumMap<>(Hari.class);

        jadwal.put(Hari.SENIN, "Miting");
        jadwal.put(Hari.RABU, "Workshop");
        jadwal.put(Hari.JUMAT, "Review");

        for(Map.Entry<Hari, String> entry : jadwal.entrySet()){
            System.out.println(entry.getKey() + " = " + entry.getValue());
        }

        System.out.println("Jadwal Rabu: " + jadwal.get(Hari.RABU));

        System.out.println("Apakah ada jadwal di KAMIS? " + jadwal.containsKey(Hari.KAMIS) );
    }
}
