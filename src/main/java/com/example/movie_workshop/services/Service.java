package com.example.movie_workshop.services;

import com.example.movie_workshop.models.Movie;
import com.example.movie_workshop.repository.MovieHandler;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Service {
    private ArrayList<Movie> getMovie;
    private Random random = new Random();

    public Service(){
        MovieHandler movieHandler = new MovieHandler();
        getMovie = movieHandler.addFileDataToList();
    }

    public String getFirstMovieTitle(){
        String title = getMovie.get(0).getTitle();
        return title;
    }

    public String getRandomMovieTitle(){
        String title = getMovie.get(random.nextInt(getMovie.size())+1).getTitle();
        return title;
    }

    public ArrayList<Movie> getTenMoviesSorted(){
        ArrayList<Movie> tenMovies = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            tenMovies.add(getMovie.get(random.nextInt(getMovie.size()) + 1));
        }
        Collections.sort(tenMovies);
        return tenMovies;
    }

    public int getAwardWinningMovies(){
        int count = 0;
        for (Movie m : getMovie) {
            if(m.getAward().equals("Yes")){
                count++;
            }
        }
        return count;
    }

    public ArrayList<Movie> moviesWithCertainLetters(char letter, int amount) {
        ArrayList<Movie> moviesWithLetter = new ArrayList<>();
        for (Movie m : getMovie) {
            if (getMovie.contains(letter)){
                moviesWithLetter.add(m);
            }
        }
        return moviesWithLetter;
    }
}
