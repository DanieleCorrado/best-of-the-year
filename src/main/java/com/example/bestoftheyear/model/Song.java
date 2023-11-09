package com.example.bestoftheyear.model;

public class Song {

    // ATTRIBUTI
    private int id;
    private String title;

    // COSTRUTTORI

    public Song(int id, String title) {
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

    public void setTitle(String title) {
        this.title = title;
    }

}
