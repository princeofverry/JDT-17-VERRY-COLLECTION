package com.indivaragroup.challenge.list;

import com.indivaragroup.challenge.list.film.Film;
import com.indivaragroup.challenge.list.service.FilmService;
import com.indivaragroup.challenge.list.util.DataInitializer;

import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class ChallengeMain {
    public static void challengeRun() {
        Map<String,
                Map<String,
                        Map<String,
                                Map<String,
                                        List<Film>>>>> categories =
                DataInitializer.initializeData();

        FilmService filmService = new FilmService(categories);

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n=== MENU ===");
            System.out.println("1. Browse Category");
            System.out.println("2. Search Film");
            System.out.println("3. Count Film");
            System.out.println("4. Exit");

            System.out.print("Choose : ");

            int choice = scanner.nextInt();

            switch (choice) {

                case 1:
                    filmService.browseCategory();
                    break;

                case 2:
                    filmService.searchByCode();
                    break;

                case 3:
                    filmService.countFilmPerCategory();
                    break;

                case 4:
                    System.exit(0);

                default:
                    System.out.println("Invalid Menu");
            }
        }
    }
}
