package com.indivaragroup.challenge.list.film;

import java.time.LocalDate;

public class Film {
    private String artistName;
    private String codeAv;
    private LocalDate releaseDate;
    private String category;
    private String subCategory;

    public Film(String artistName, String codeAv, LocalDate releaseDate, String category, String subCategory) {
        this.artistName = artistName;
        this.codeAv = codeAv;
        this.releaseDate = releaseDate;
        this.category = category;
        this.subCategory = subCategory;
    }

    public String getArtistName() {
        return artistName;
    }

    public String getCodeAv() {
        return codeAv;
    }

    public LocalDate getReleaseDate() {
        return releaseDate;
    }

    public String getCategory() {
        return category;
    }

    public String getSubCategory() {
        return subCategory;
    }

    @Override
    public String toString() {
        return String.format(
                "%-15s %-10s %-15s %-15s %-20s",
                artistName,
                codeAv,
                releaseDate,
                category,
                subCategory
        );
    }
}
