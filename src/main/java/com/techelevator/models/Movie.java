package com.techelevator.models;

public class Movie {
    // Attributes
    private int movieId;
    private String theOneMovieId;
    private String name;
    private  int runtimeinMinutes;
    private int budgetInMillions;

    public int getMovieId() {
        return movieId;
    }

    public void setMovieId(int movieId) {
        this.movieId = movieId;
    }

    public String getTheOneMovieId() {
        return theOneMovieId;
    }

    public void setTheOneMovieId(String theOneMovieId) {
        this.theOneMovieId = theOneMovieId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRuntimeinMinutes() {
        return runtimeinMinutes;
    }

    public void setRuntimeinMinutes(int runtimeinMinutes) {
        this.runtimeinMinutes = runtimeinMinutes;
    }

    public int getBudgetInMillions() {
        return budgetInMillions;
    }

    public void setBudgetInMillions(int budgetInMillions) {
        this.budgetInMillions = budgetInMillions;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "movieId=" + movieId +
                ", theOneMovieId='" + theOneMovieId + '\'' +
                ", name='" + name + '\'' +
                ", runtimeinMinutes=" + runtimeinMinutes +
                ", budgetInMillions=" + budgetInMillions +
                '}';
    }
}
