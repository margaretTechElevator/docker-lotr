package com.techelevator.services;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.techelevator.models.Movie;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;

@Service // tells spring what to hook up the autowire
public class LotrService {
    // this will be talking to the api
    //attributes
    @Value("${LOTR_API}")
    private String LOTR_API;

    @Value("${KEY}")
    private String Key;

    RestTemplate restTemplate = new RestTemplate();

//// api need a token
//    public List<Movie> listAllOfMovies(){
//        HttpHeaders  headers = new HttpHeaders(); // to store the toke
//        headers.setBearerAuth(Key);
//
//        HttpEntity<Void> entity = new HttpEntity<>(headers); // wraps our header into an entity to pass in get request. token
//
//        ObjectMapper mapper = new ObjectMapper(); // is for walking through the nodes of the json
//        JsonNode jsonNode;
//        ResponseEntity<String> responseEntity = restTemplate.exchange(LOTR_API + "/movie", HttpMethod.GET, entity, String.class); // holds whats going to comeback
//
//        List<Movie>movieList= new ArrayList<>();
//        try {
//            jsonNode = mapper.readTree(responseEntity.getBody());
//            JsonNode docs = jsonNode.path("docs");
//            for (int i = 0; i < docs.size(); i++); // looping the array
//            Movie temp = new Movie();
//            String movieId = docs.path(i).path("_id").asText();
//            temp.setTheOneMovieId(movieId);
//            String name
//
//            temp.setName(name);
//        } catch (JsonProcessingException e) {
//            throw new RuntimeException(e);
//        }
//    }
public List<Movie> listAllOfMovies(){
    HttpHeaders headers = new HttpHeaders();
    headers.setBearerAuth(Key);

    HttpEntity<Void> entity = new HttpEntity<>(headers);

    ObjectMapper mapper = new ObjectMapper(); // working through the JsonNode
    JsonNode jsonNode; // walking through nodes
    ResponseEntity<String> responseEntity = restTemplate.exchange(LOTR_API + "/movie", HttpMethod.GET, entity, String.class);

    List<Movie>movieList= new ArrayList<>();
    try {
        jsonNode = mapper.readTree(responseEntity.getBody());
        JsonNode docs = jsonNode.path("docs");
        for (int i = 0; i < docs.size(); i++) {

            Movie temp = new Movie(); // make temp movie

            String movieId = docs.path(i).path("_id").asText();
            temp.setTheOneMovieId(movieId);
            String name = docs.path(i).path("name").asText();
            temp.setName(name);
            int runTime = docs.path(i).path("runtimeInMinutes").asInt(); // docs and make sure were
            temp.setRuntimeinMinutes(runTime);
            int budget = docs.path(i).path("budgetInMillions").asInt();
            temp.setBudgetInMillions(budget);
            movieList.add(temp);
        }
    } catch (JsonProcessingException e) {
        e.printStackTrace();
    }
    return movieList;
}



}

