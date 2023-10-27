package com.techelevator.daos;

import com.techelevator.models.Movie;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;


import java.util.ArrayList;
import java.util.List;

public class JDBCMoviesDao implements  MovieDao {

    private JdbcTemplate jdbctemplate;

    public JDBCMoviesDao(JdbcTemplate jdbctemplate) {
        this.jdbctemplate = jdbctemplate;
    }

    @Override
    public List<Movie> getAllMovies() {
        String sql = "SELECT * From movie";
        SqlRowSet result = jdbctemplate.queryForRowSet(sql);
        List<Movie> movieList =new ArrayList<>();
        while(result.next()){
            Movie movie = mapRowToMovie(result); // make a variable and save the result
            movieList.add(movie);// add movies list
        }
        return movieList;
    }



    @Override
    public Movie getMovieByMovieId(int id) {
        String sql = "SELECT * FROM movie Where movie_id = ? ";
        SqlRowSet result = jdbctemplate.queryForRowSet(sql,id);  // result this is going to make a call and get back a row and save it as a result
        Movie movie = null; // empty movie
        if(result.next()){ // if there result
            movie = mapRowToMovie(result);
        }
        return movie;
    }


    @Override
    public Movie addNewMovie(Movie movie) {
        String sql = "INSERT INTO movie(the_one_movie_id, name, " +
                "runtime_in_minutes," +
                " budget_in_millions) " +
                "VALUE (?,?,?,?)" +
                "Returning movie_id";

        Integer id = jdbctemplate.queryForObject(sql,Integer.class, movie.getTheOneMovieId(), movie.getName(), movie.getRuntimeinMinutes(), movie.getBudgetInMillions());
        // need a method that lets us queery

        return getMovieByMovieId(id);
    }
    private Movie mapRowToMovie(SqlRowSet rs){
        Movie movie = new Movie();
        movie.setMovieId(rs.getInt("movie_id"));
        movie.setTheOneMovieId(rs.getString("the_one_movie_id"));
        movie.setName(rs.getString("name"));
        movie.setRuntimeinMinutes(rs.getInt("runtime_in_minutes"));
        movie.setBudgetInMillions(rs.getInt("budget_in_millions"));
        return movie;
    }

}
