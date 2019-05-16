package com.codecool.kitchen;

import java.util.EnumMap;
import java.util.Random;

public class KitchenHelper extends Employee {

    EnumMap<Ingredient, Integer> ingredientMap = new EnumMap<>(Ingredient.class);
    boolean haveNeededIngredient = false;

    /**
     * Simple constructor
     */
    public KitchenHelper() {
    }


    /**
     * Parameterized constructor
     * @param name
     * @param age
     * @param salary
     */
    public KitchenHelper(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;


        ingredientMap.put(Ingredient.CARROT, 0);
        ingredientMap.put(Ingredient.MEAT, 0);
        ingredientMap.put(Ingredient.POTATO, 0);
    }


    /**
     * @return random int between 0-3
     */
    protected int randomNoOfIngredient() {
        Random rand = new Random();
        return rand.nextInt(4);
    }

    /**
     * Sets the EnumMap up with the randomized number of ingredients
     */
    public void setIngredients() {
        ingredientMap.put(Ingredient.POTATO, randomNoOfIngredient());
        ingredientMap.put(Ingredient.CARROT, randomNoOfIngredient());
        ingredientMap.put(Ingredient.MEAT, randomNoOfIngredient());
    }

    /**
     * Kitchen helpers check their ingredient map for the ingredient the chef needs in every hour.
     * If they have an ingredient in their map thatt he chef asks for, they check how many they have.
     * If they have more than 0 of that ingredient, they set haveNeededIngredient to true.
     * After that they decrease the named ingredient with 1.
     * If they don't have any of the ingredient (value of it is 0), they print out that.
     * @param ingredientForChef is the Ingredient enum in every hour the chef yells out
     */
    public void checkForIngredient(Ingredient ingredientForChef) {
        System.out.println(this.name + " has with him/her " + this.ingredientMap);
        for(Ingredient ingredient : ingredientMap.keySet()) {
            if(ingredient.equals(ingredientForChef)){
                int howMuchIHave = ingredientMap.get(ingredientForChef);
                if(howMuchIHave > 0) {
                    System.out.println("I have " + ingredient);
                    haveNeededIngredient = true;
                    ingredientMap.put(ingredientForChef, howMuchIHave - 1);
                } else {
                    System.out.println("I don't have any...");
                    haveNeededIngredient = false;
                }
            }
        }
    }

    public boolean isHaveNeededIngredient() {
        return haveNeededIngredient;
    }

    /**
     * Every kitchen helper sets their ingredients in the beginning of a working day.
     */
    public void prepareForDay() {
        this.setIngredients();
    }

}
