package com.example.reactbackend.repository;

import com.example.reactbackend.model.Meal;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MealRespository extends JpaRepository<Meal, Long> {

}
