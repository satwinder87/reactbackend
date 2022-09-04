package com.example.reactbackend.service;

import com.example.reactbackend.model.Meal;
import com.example.reactbackend.repository.MealRespository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MealService {

  private final MealRespository mealRespository;

  @Autowired
  public MealService(MealRespository mealRespository) {
    this.mealRespository = mealRespository;
  }

  public List<Meal> getAllMeals() {
    return mealRespository.findAll();
  }

  public Meal saveMovie(Meal meal) {
    return mealRespository.save(meal);
  }

  public void saveDummyMeals(List<Meal> mealList) {
    mealList.forEach(mealRespository::save);
  }

}
