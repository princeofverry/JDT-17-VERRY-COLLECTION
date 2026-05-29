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

        addFilm(categories, "TEEN YO", "SCHOOL GIRL", "UNIFORM", "SUMMER EDITION", new Film("Artist A", "ABX-001", LocalDate.of(2026,1,15), "TEEN YO", "SUMMER EDITION"));
        addFilm(categories, "TEEN YO", "SCHOOL GIRL", "UNIFORM", "SUMMER EDITION", new Film("Artist B", "ABX-002", LocalDate.of(2026,2,20), "TEEN YO", "SUMMER EDITION"));
        addFilm(categories, "TEEN YO", "COLLEGE", "FRESHMAN", "DEBUT 2026", new Film("Artist C", "ABX-003", LocalDate.of(2026,3,10), "TEEN YO", "DEBUT 2026"));

        addFilm(categories, "TEEN YO", "COLLEGE", "SENIOR", "CAMPUS QUEEN", new Film("Artist D", "ABX-004", LocalDate.of(2026,4,5), "TEEN YO", "CAMPUS QUEEN"));
        addFilm(categories, "TEEN YO", "COLLEGE", "SENIOR", "CAMPUS QUEEN", new Film("Artist E", "ABX-005", LocalDate.of(2026,4,12), "TEEN YO", "CAMPUS QUEEN"));
        addFilm(categories, "TEEN YO", "SPORT", "SWIMMER", "POOL PARTY", new Film("Artist F", "ABX-006", LocalDate.of(2026,5,1), "TEEN YO", "POOL PARTY"));
        addFilm(categories, "TEEN YO", "SPORT", "TENNIS", "SUMMER CUP", new Film("Artist G", "ABX-007", LocalDate.of(2026,5,18), "TEEN YO", "SUMMER CUP"));

        addFilm(categories, "MATURE", "OFFICE LADY", "SECRETARY", "WORK HARD", new Film("Artist H", "ABX-008", LocalDate.of(2026,6,3), "MATURE", "WORK HARD"));
        addFilm(categories, "MATURE", "OFFICE LADY", "MANAGER", "BOARD ROOM", new Film("Artist I", "ABX-009", LocalDate.of(2026,6,15), "MATURE", "BOARD ROOM"));
        addFilm(categories, "MATURE", "HOUSEWIFE", "MARRIED", "HOME ALONE", new Film("Artist J", "ABX-010", LocalDate.of(2026,7,2), "MATURE", "HOME ALONE"));
        addFilm(categories, "MATURE", "HOUSEWIFE", "MARRIED", "LATE NIGHT", new Film("Artist K", "ABX-011", LocalDate.of(2026,7,25), "MATURE", "LATE NIGHT"));

        addFilm(categories, "COSPLAY", "ANIME", "MAID", "FESTIVAL", new Film("Artist L", "ABX-012", LocalDate.of(2026,8,8), "COSPLAY", "FESTIVAL"));
        addFilm(categories, "COSPLAY", "ANIME", "MAID", "FESTIVAL", new Film("Artist M", "ABX-013", LocalDate.of(2026,8,12), "COSPLAY", "FESTIVAL"));
        addFilm(categories, "COSPLAY", "GAME", "WARRIOR", "LEGEND", new Film("Artist N", "ABX-014", LocalDate.of(2026,8,20), "COSPLAY", "LEGEND"));
        addFilm(categories, "COSPLAY", "GAME", "MAGE", "MAGIC WORLD", new Film("Artist O", "ABX-015", LocalDate.of(2026,9,1), "COSPLAY", "MAGIC WORLD"));

        addFilm(categories, "IDOL", "CONCERT", "LIVE", "TOKYO TOUR", new Film("Artist P", "ABX-016", LocalDate.of(2026,9,15), "IDOL", "TOKYO TOUR"));
        addFilm(categories, "IDOL", "CONCERT", "LIVE", "OSAKA TOUR", new Film("Artist Q", "ABX-017", LocalDate.of(2026,9,25), "IDOL", "OSAKA TOUR"));
        addFilm(categories, "IDOL", "BACKSTAGE", "REHEARSAL", "SPECIAL CUT", new Film("Artist R", "ABX-018", LocalDate.of(2026,10,5), "IDOL", "SPECIAL CUT"));
        addFilm(categories, "IDOL", "BACKSTAGE", "REHEARSAL", "LIMITED EDITION", new Film("Artist S", "ABX-019", LocalDate.of(2026,10,20), "IDOL", "LIMITED EDITION"));

        addFilm(categories, "DRAMA", "ROMANCE", "FIRST LOVE", "MEMORIES", new Film("Artist T", "ABX-020", LocalDate.of(2026,11,1), "DRAMA", "MEMORIES"));
        addFilm(categories, "DRAMA", "ROMANCE", "BREAKUP", "LAST DAY", new Film("Artist U", "ABX-021", LocalDate.of(2026,11,10), "DRAMA", "LAST DAY"));
        addFilm(categories, "DRAMA", "FAMILY", "SISTER", "REUNION", new Film("Artist V", "ABX-022", LocalDate.of(2026,11,18), "DRAMA", "REUNION"));
        addFilm(categories, "DRAMA", "FAMILY", "COUSIN", "HOLIDAY", new Film("Artist W", "ABX-023", LocalDate.of(2026,12,1), "DRAMA", "HOLIDAY"));

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
