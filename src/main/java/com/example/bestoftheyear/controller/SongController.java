package com.example.bestoftheyear.controller;


import com.example.bestoftheyear.model.Song;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Arrays;
import java.util.List;

@Controller
@RequestMapping("/songs")
public class SongController {

    @GetMapping
    public String songs (Model model) {

        model.addAttribute("bestSongs",getBestSongs());

        return "songs/songs";
    }

    @GetMapping("/{id}")
    public String SongDetail(@PathVariable("id") int songId, Model model) {

        Song song = getSongById(songId);
        model.addAttribute("song", song);

        return "songs/song-details";
    }


    private List<Song> getBestSongs() {
        Song []  songList = {new Song(1,"Another brick in the wall"), new Song(2,"I wanna be your Slave"),new Song(3,"Whatever it takes")};

        return Arrays.asList(songList);
    }

    private Song getSongById(int id) {
        for (Song song : getBestSongs()) {
            if (song.getId() == id) {

                return song;
            }

        }
        return null;

    }
}
