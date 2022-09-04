package com.example.reactbackend.service;

import com.example.reactbackend.model.Movie;
import com.example.reactbackend.repository.MovieRespository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MovieService {

  private final MovieRespository movieRespository;

  @Autowired
  public MovieService(MovieRespository movieRespository) {
    this.movieRespository = movieRespository;
  }

  public List<Movie> getAllMovies() {
    return movieRespository.findAll();
  }

  public Movie saveMovie(Movie movie) {
    return movieRespository.save(movie);
  }

  public void saveDummyMovies(List<Movie> movieList){
    movieList.forEach(movieRespository::save);
  }

}
