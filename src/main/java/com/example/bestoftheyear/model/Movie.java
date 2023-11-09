package com.example.bestoftheyear.model;

public class Movie {

    // ATTRIBUTI
    private int id;
    private String title;

    // COSTRUTTORI
    public Movie(int id, String title) {
        this.id = id;
        this.title = title;
    }

    // GETTER E SETTER

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    // METODI

    public void setTitle(String title) {
        this.title = title;
    }
}
