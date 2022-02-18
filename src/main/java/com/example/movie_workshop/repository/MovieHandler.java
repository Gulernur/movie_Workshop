package com.example.movie_workshop.repository;

import com.example.movie_workshop.models.Movie;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class MovieHandler {

    public MovieHandler(){

    }

    public ArrayList<Movie> addFileDataToList(){
        File movieFile = new File("data/imdb-data.csv");
        ArrayList<Movie> movieList = new ArrayList<>();
        try{
            Scanner scanner = new Scanner(movieFile);
            while(scanner.hasNext()){
                String line = scanner.nextLine();
                String[] data = line.split(";");
                int year = Integer.parseInt(data[0]);
                int length = Integer.parseInt(data[1]);
                String title = data[2];
                String subject = data[3];
                int popularity = Integer.parseInt(data[4]);
                String awards = data[5];
                Movie newMovie = new Movie(year, length, title, subject, popularity, awards);
                movieList.add(newMovie);
            }

        }catch (FileNotFoundException e) {
            e.printStackTrace();
            System.out.println("File not found");
        }
        return movieList;
    }
}
