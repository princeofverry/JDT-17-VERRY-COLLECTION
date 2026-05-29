package com.indivaragroup.challenge.list.service;

import com.indivaragroup.challenge.list.film.Film;

import java.util.*;

public class FilmService {
    private final Scanner scanner = new Scanner(System.in);
    private final Map<String, Map<String, Map<String, Map<String, List<Film>>>>> categories;

    public FilmService(Map<String, Map<String, Map<String, Map<String, List<Film>>>>> categories) {
        this.categories = categories;
    }
    public void browseCategory() {

        List<String> level1List =
                new ArrayList<>(categories.keySet());

        System.out.println("\n=== FILM CATEGORY ===");
        printMenu(level1List);

        int level1Choice = scanner.nextInt();

        String level1 = level1List.get(level1Choice - 1);

        Map<String,
                Map<String,
                        Map<String,
                                List<Film>>>> level2Map =
                categories.get(level1);

        List<String> level2List = new ArrayList<>(level2Map.keySet());

        System.out.println("\n=== SUB CATEGORY ===");
        printMenu(level2List);

        int level2Choice = scanner.nextInt();

        String level2 = level2List.get(level2Choice - 1);

        Map<String,
                Map<String,
                        List<Film>>> level3Map =
                level2Map.get(level2);

        List<String> level3List = new ArrayList<>(level3Map.keySet());

        System.out.println("\n=== SUB SUB CATEGORY ===");
        printMenu(level3List);

        int level3Choice = scanner.nextInt();

        String level3 = level3List.get(level3Choice - 1);
        Map<String, List<Film>> level4Map = level3Map.get(level3);
        List<String> level4List = new ArrayList<>(level4Map.keySet());
        System.out.println("\n=== LEVEL 4 ===");
        printMenu(level4List);
        int level4Choice = scanner.nextInt();
        String level4 = level4List.get(level4Choice - 1);
        showFilms(level4Map.get(level4));
    }

    public void searchByCode() {
        scanner.nextLine();
        System.out.print("Input KODE_AV : ");
        String code = scanner.nextLine();
        boolean found = false;
        for (Map<String, Map<String, Map<String, List<Film>>>> level2 : categories.values()) {
            for (Map<String, Map<String, List<Film>>> level3 : level2.values()) {
                for (Map<String, List<Film>> level4 : level3.values()) {
                    for (List<Film> films : level4.values()) {
                        for (Film film : films) {
                            if (film.getCodeAv().equalsIgnoreCase(code)) {
                                System.out.println(film);
                                found = true;
                            }
                        }
                    }
                }
            }
        }

        if (!found) {
            System.out.println("Film not found");
        }
    }

    public void countFilmPerCategory() {
        for (String category : categories.keySet()) {
            int total = 0;
            Map<String, Map<String, Map<String, List<Film>>>> level2 = categories.get(category);
            for (Map<String, Map<String, List<Film>>> level3 : level2.values()) {
                for (Map<String, List<Film>> level4 : level3.values()) {
                    for (List<Film> films : level4.values()) {
                        total += films.size();
                    }
                }
            }
            System.out.println(category + " = " + total);
        }
    }

    private void showFilms(List<Film> films) {
        Iterator<Film> iterator = films.iterator();
        int no = 1;
        System.out.println("\n=== DATA FILM ===");
        while (iterator.hasNext()) {
            Film film = iterator.next();
            System.out.println(
                    no++ + ". " +
                            film.getArtistName() + " | " +
                            film.getCodeAv() + " | " +
                            film.getReleaseDate()
            );
        }
    }

    private void printMenu(List<String> data) {
        for (int i = 0; i < data.size(); i++) {
            System.out.println((i + 1) + ". " + data.get(i));
        }
    }
}
