package com.example.movie_workshop.models;

public class Movie implements Comparable <Movie>{

    private int year;
    private int length;
    private String title;
    private String subject;
    private int popularity;
    private String award;

    public Movie(int year, int length, String title, String subject, int popularity, String award) {
        this.year = year;
        this.length = length;
        this.title = title;
        this.subject = subject;
        this.popularity = popularity;
        this.award = award;
    }

    public Movie(){

    }

    public String getTitle() {
        return title;
    }

    public int getPopularity() {
        return popularity;
    }

    public int getYear() {
        return year;
    }

    public int getLength() {
        return length;
    }

    public String getSubject() {
        return subject;
    }

    public String getAward() {
        return award;
    }

    @Override
    public int compareTo(Movie o) {
        return this.popularity - o.getPopularity();
    }

    @Override
    public String toString() {
        return "Year: " + year + " Length: " + length + " Title: " + title + "Subject " + subject +
                " Popularity: " + popularity + " Awards: " + award;
    }
}
