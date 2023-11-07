package com.example.bestoftheyear.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/")
public class IndexController {

    @GetMapping()
    public String index(Model model) {
        String myName = "Daniele Corrado";
        model.addAttribute("myName", myName);
        return "index";
    }

    @GetMapping("/movies")
    public String movies(Model model) {
        List<String> bestMovies = getBestMovies();
        model.addAttribute("bestMovies", String.join(", ", bestMovies));
        return "movies";
    }

    @GetMapping("/songs")
    public String songs(Model model) {
        List<String> bestSongs = getBestSongs();
        model.addAttribute("bestSongs", String.join(", ", bestSongs));
        return "songs";
    }

    private List<String> getBestMovies(){
        List<String> movies = new ArrayList<>();
        movies.add("Ritorno al futuro Part. 1");
        movies.add("Ritorno al futuro Part. 2");
        movies.add("Ritorno al futuro Part. 3");
        movies.add("Il padrino parte 1");
        movies.add("Il padrino parte 2");
        movies.add("Il padrino parte 3");
        return movies;
    }

    private List<String> getBestSongs(){
        List<String> songs = new ArrayList<>();
        songs.add("Another brick in the wall");
        songs.add("I wanna be your Slave");
        songs.add("Whatever it takes");
        return songs;
    }

}
