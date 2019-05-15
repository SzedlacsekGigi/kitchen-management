package com.codecool.kitchen;

import java.util.Date;
import java.util.EnumMap;

public class KitchenHelper extends Employee {

    public KitchenHelper() {
    }

    public KitchenHelper(String name, Date birthday, double salary) {
        this.name = name;
        this.birthday = birthday;
        this.salary = salary;


        EnumMap<Ingredient, Integer> ingredientMap = new EnumMap<>(Ingredient.class);
        ingredientMap.put(Ingredient.CARROT, 0);
        ingredientMap.put(Ingredient.MEAT, 0);
        ingredientMap.put(Ingredient.POTATO, 0);
    }

}
