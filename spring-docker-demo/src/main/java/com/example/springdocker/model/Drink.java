package com.example.springdocker.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Drink {
        String id;
        String name;
        boolean delicious;
        boolean canIDrinkIt;


        public int add(int a, int b){
                return a+b;
        }
        public int multiply(int a, int b){
                return a*b;
        }
        public double divide(double a, double b){
          return a/b;
        }
}
