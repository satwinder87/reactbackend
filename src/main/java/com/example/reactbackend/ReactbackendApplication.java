package com.example.reactbackend;

import com.example.reactbackend.model.Meal;
import com.example.reactbackend.model.Movie;
import com.example.reactbackend.service.MealService;
import com.example.reactbackend.service.MovieService;
import java.time.LocalDate;
import java.util.List;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@Slf4j
@SpringBootApplication
public class ReactbackendApplication {

  public static void main(String[] args) {
    SpringApplication.run(ReactbackendApplication.class, args);
  }

  @Bean
  public CommandLineRunner init(MovieService service) {
    log.info("Starting Application, Saving Initial Movies Dump");
    return args -> {
      service.saveDummyMovies(List.of(Movie.builder().title("Inception").openingText("Some text").releaseDate(
          LocalDate.now()).build(), Movie.builder().title("Troy").openingText("Some text").releaseDate(
          LocalDate.now()).build(), Movie.builder().title("Matrix").openingText("Some text").releaseDate(
          LocalDate.now()).build()));
    };

  }

  @Bean
  public CommandLineRunner init2(MealService service) {
    log.info("Starting Application, Saving Initial Meals Dump");
    return args -> {
      service.saveDummyMeals(List.of(Meal.builder().name("Sushi").description("Finest fish and veggies").price(
          22.99).build(), Meal.builder().name("Schnitzel").description("A german specialty!").price(
          16.50).build(), Meal.builder().name("Barbecue Burger").description("American, raw, meaty").price(
          12.99).build(), Meal.builder().name("Green Bowl").description("Healthy...and green...").price(
          18.99).build()));
    };

  }

}
