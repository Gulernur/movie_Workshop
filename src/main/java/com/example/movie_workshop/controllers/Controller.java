package com.example.movie_workshop.controllers;

import com.example.movie_workshop.models.Movie;
import com.example.movie_workshop.services.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class Controller {
    Service service = new Service();

    //Opgave 3.1:
    @GetMapping("/")
    public String greeting(){
        return "Welcome to the Movie Workshop! " + "\n" +
                "This program will give you information about tons of movies. " + "\n" +
                "We hope you like the program as much as we do! :)";
    }

    //Opgave 3.2:
    @GetMapping("/getFirst")
    public String getFirstMovieTitle(){
        String title =  service.getFirstMovieTitle();
        return title;
    }

    //Opgave 3.3:
    @GetMapping("/getRandom")
    public String getRandom(){
        String title = service.getRandomMovieTitle();
        return title;
    }

    //Opgave 3.4;
    @GetMapping("/getTenSortByPopularity")
    public ArrayList<Movie> getTenSortByPopularity(){
        return service.getTenMoviesSorted();
    }

    //Opgave 3.5:
    @GetMapping("/howManyWonAnAward")
    public int howManyWonAnAward(){
        return service.getAwardWinningMovies();
    }

    //TODO: not finished...
    //Opgave 3.6:
    @GetMapping("/moviesBasedOnCharAmount")
    public ArrayList<Movie> moviesBasedOnCharAmount(@RequestParam char letter, int amount){
        return service.moviesWithCertainLetters(letter, amount);
    }
}
