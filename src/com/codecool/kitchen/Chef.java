package com.codecool.kitchen;

import java.util.Random;

public class Chef extends FoodPreparer {


    private Ingredient neededIngredient;
    private boolean gotIngredient = false;


    public Chef() {
    }

    public Chef(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    private void chooseRandomIngredient() {
        Ingredient newNeededIngredient = Ingredient.values()[new Random().nextInt(Ingredient.values().length)];
        setNeededIngredient(newNeededIngredient);
        setGotIngredient(false);
    }

    @Override
    public void cook() {
        chooseRandomIngredient();
        System.out.println(neededIngredient);
    }

    public Ingredient getNeededIngredient() {
        return neededIngredient;
    }

    public void setNeededIngredient(Ingredient neededIngredient) {
        this.neededIngredient = neededIngredient;
    }


    public void setGotIngredient(boolean gotIngredient) {
        this.gotIngredient = gotIngredient;
    }

    public boolean isGotIngredient() {
        return gotIngredient;
    }
}