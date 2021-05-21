package com.example.springdocker.controller;

import com.example.springdocker.model.Drink;
import com.example.springdocker.service.DrinkService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequiredArgsConstructor
@RestController
public class DrinkController {
    private final DrinkService service;

    @GetMapping("/Drinks")
    public List<Drink> getDrinks() {
        return service.getDrinks();
    }

    @PostMapping("/Drinks")
    public void saveNewDrink(@RequestBody Drink Drink) {
        service.saveNewDrink(Drink);
    }

    @GetMapping("/Drinks/cookable")
    public List<String> getDrinkableDrinks() {
        return service.getDrinkableDrinks();
    }
}