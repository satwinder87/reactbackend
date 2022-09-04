package com.example.reactbackend.rest;

import com.example.reactbackend.model.Movie;
import com.example.reactbackend.service.MovieService;
import java.util.List;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin
@Slf4j
@RestController
@RequestMapping(value = "api/v1")
public class MoviesController {

  private MovieService service;

  @Autowired
  public MoviesController(MovieService service) {
    this.service = service;
  }

  @GetMapping(value = "getAllMovies")
  public ResponseEntity<List<Movie>> getAllMovies() {
    log.info("Received Request to retrieve all movies ");
    return ResponseEntity.ok(service.getAllMovies());
  }

  @PostMapping(value = "saveMovie")
  public ResponseEntity<Movie> saveMovie(@RequestBody Movie movie) {
    log.info("Received Request to save a movie, Movie = " + movie);
    return ResponseEntity.ok(service.saveMovie(movie));
  }

}
