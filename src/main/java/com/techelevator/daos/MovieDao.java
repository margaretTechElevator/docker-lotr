package com.techelevator.daos;

import com.techelevator.models.Movie;

import java.util.List;

public interface MovieDao {

    // CRUD

    //Start with Reading movies

    List<Movie>getAllMovies(); //Read
    Movie  getMovieByMovieId(int id);

    Movie addNewMovie(Movie movie); // create


}
