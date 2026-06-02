package com.indivaragroup.implement.enumset;

import java.util.EnumSet;

public class EnumSetLearn {
    public static void main(String[] args) {
        EnumSet<Hari> hariKerja = EnumSet.of(
                Hari.SELASA, Hari.SELASA, Hari.RABU, Hari.KAMIS, Hari.JUMAT
        );

        EnumSet<Hari> akhirPekan = EnumSet.of(Hari.SABTU, Hari.MINGGU);
        EnumSet<Hari> semuaHari = EnumSet.allOf(Hari.class);

        System.out.println("Hari Kerja : " + hariKerja);
        System.out.println("Akhir Pekan : " + akhirPekan);
        System.out.println("Semua Hari: " + semuaHari);
    }
}
