package com.example.reactbackend.rest;

import com.example.reactbackend.model.Meal;
import com.example.reactbackend.service.MealService;
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
public class MealController {

  private MealService service;

  @Autowired
  public MealController(MealService service) {
    this.service = service;
  }

  @GetMapping(value = "getAllMeals")
  public ResponseEntity<List<Meal>> getAllMeals() {
    log.info("Received Request to retrieve all meals ");
    return ResponseEntity.ok(service.getAllMeals());
  }

  @PostMapping(value = "saveMeal")
  public ResponseEntity<Meal> saveMeal(@RequestBody Meal meal) {
    log.info("Received Request to save a meal, Meal = " + meal);
    return ResponseEntity.ok(service.saveMovie(meal));
  }

}
