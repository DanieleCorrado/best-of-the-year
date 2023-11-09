package com.example.bestoftheyear.controller;

import com.example.bestoftheyear.model.Movie;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Arrays;
import java.util.List;


@Controller
@RequestMapping("/movies")
public class MovieController {

    @GetMapping
    public String movies(Model model) {
        model.addAttribute("bestMovies", getBestMovies());
        return "movies/movies";
    }

    @GetMapping("/{id}")
    public String movieDetail(@PathVariable("id") int movieId, Model model) {

        Movie movie = getMovieById(movieId);
        model.addAttribute("movie", movie);
        return "movies/movie-details";
    }


    //    metodo private
    private List<Movie> getBestMovies() {
        Movie[] movieList = {new Movie(1,"Ritorno al futuro Part. 1"), new Movie(2,"Ritorno al futuro Part. 2"), new Movie(3,"Ritorno al futuro Part. 3"), new Movie(4,"Il padrino parte 1"), new Movie(5,"Il padrino parte 2"), new Movie(6,"Il padrino parte 3")};

        return Arrays.asList(movieList);
    }

    private Movie getMovieById(int id) {
        for (Movie movie : getBestMovies()) {
            if (movie.getId() == id) {

                return movie;
            }
        }

        return null;
    }
}