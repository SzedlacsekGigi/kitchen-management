package com.codecool.kitchen;

import java.util.Date;
import java.util.Random;

public class Chef extends FoodPreparer {

    private Ingredient neededIngredient;

    public Chef(){}

    public Chef(String name, Date birthday, double salary) {
        this.name = name;
        this.birthday = birthday;
        this.salary = salary;
    }

    private void chooseRandomIngredient() {
        neededIngredient = Ingredient.values()[new Random().nextInt(Ingredient.values().length)];
    }

    @Override
    public void cook() {
        chooseRandomIngredient();
    }

    public Ingredient getNeededIngredient() {
        return neededIngredient;
    }
}
