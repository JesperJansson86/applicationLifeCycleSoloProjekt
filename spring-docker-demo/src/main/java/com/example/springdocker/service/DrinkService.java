package com.example.springdocker.service;

import com.example.springdocker.model.Drink;
import com.example.springdocker.repository.DrinkRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@RequiredArgsConstructor
@Service
public class DrinkService {
    private final DrinkRepository drinkRepository;

    public List<Drink> getDrinks() {
        return drinkRepository.findAll();
    }

    public void saveNewDrink(Drink Drink) {
        drinkRepository.save(Drink);
    }

    public List<String> getDrinkableDrinks() {
        // hämtar alla Drinks som vi kan laga
        List<Drink> drinkableDrinks = drinkRepository.findDrinkByCanIDrinkIt(true);

        // returnerar endast Drink namnen i en lista
        return drinkableDrinks.stream()
                .map(Drink -> Drink.getName())
                .collect(Collectors.toList());
    }
}
