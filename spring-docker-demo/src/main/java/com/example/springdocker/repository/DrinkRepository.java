package com.example.springdocker.repository;

import com.example.springdocker.model.Drink;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DrinkRepository extends MongoRepository<Drink, String> {

    List<Drink> findDrinkByCanIDrinkIt(boolean canCook);
}
