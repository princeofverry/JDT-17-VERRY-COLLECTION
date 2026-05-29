package com.indivaragroup.challenge.list.util;

import com.indivaragroup.challenge.list.film.Film;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class DataInitializer {
    public static Map<String, Map<String, Map<String, Map<String, List<Film>>>>> initializeData() {
        Map<String, Map<String, Map<String, Map<String, List<Film>>>>> categories = new LinkedHashMap<>();

        addFilm(
                categories,
                "TEEN YO",
                "SCHOOL GIRL",
                "UNIFORM",
                "SUMMER EDITION",
                new Film(
                        "Artist A",
                        "ABX-001",
                        LocalDate.of(2026,1,15),
                        "TEEN YO",
                        "SUMMER EDITION"
                )
        );

        addFilm(
                categories,
                "TEEN YO",
                "SCHOOL GIRL",
                "UNIFORM",
                "SUMMER EDITION",
                new Film(
                        "Artist B",
                        "ABX-002",
                        LocalDate.of(2026,2,20),
                        "TEEN YO",
                        "SUMMER EDITION"
                )
        );

        addFilm(
                categories,
                "TEEN YO",
                "COLLEGE",
                "FRESHMAN",
                "DEBUT 2026",
                new Film(
                        "Artist C",
                        "ABX-003",
                        LocalDate.of(2026,3,10),
                        "TEEN YO",
                        "DEBUT 2026"
                )
        );

        return categories;
    }

    private static void addFilm(
            Map<String, Map<String, Map<String, Map<String, List<Film>>>>> categories, String level1, String level2, String level3, String level4, Film film
    ) {
        categories
                .computeIfAbsent(level1, k -> new LinkedHashMap<>())
                .computeIfAbsent(level2, k -> new LinkedHashMap<>())
                .computeIfAbsent(level3, k -> new LinkedHashMap<>())
                .computeIfAbsent(level4, k -> new ArrayList<>())
                .add(film);
    }
}
