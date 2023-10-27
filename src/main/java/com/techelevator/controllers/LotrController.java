package com.techelevator.controllers;

import com.techelevator.models.Movie;
import com.techelevator.services.LotrService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController // you need this because without this nothing will happened
@CrossOrigin
public class LotrController {

    @Autowired // autowired allows Spring to inject the service
    LotrService service;

    @GetMapping("/movie") // the pathway
    public List<Movie> getAllmoviesFromApi(){
        return service.listAllOfMovies(); // get all the list

    }
    @GetMapping("/test")
    public String test(){

        System.out.println("here");
        return "test";
    }


}
