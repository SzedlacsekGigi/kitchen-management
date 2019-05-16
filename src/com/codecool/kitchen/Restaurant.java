package com.codecool.kitchen;

import java.util.ArrayList;
import java.util.List;

public class Restaurant {

    protected List<Cook> cooks = new ArrayList<>(5);
    protected List<KitchenHelper> kitchenHelpers = new ArrayList<>(10);
    protected Chef chef = new Chef();

    protected void hireEmployees() {
        chef = new Chef("Ramsay", 55, 125000);
        cooks.add(new Cook("Tom", 35, 50000));
        cooks.add(new Cook("Ben", 28, 35000));
        cooks.add(new Cook("Gabby", 30, 52000));
        cooks.add(new Cook("Sam", 32, 47500));
        kitchenHelpers.add(new KitchenHelper("Fred", 25, 10000));
        kitchenHelpers.add(new KitchenHelper("George", 27, 12000));
        kitchenHelpers.add(new KitchenHelper("Mike", 42, 12000));
        kitchenHelpers.add(new KitchenHelper("Laura", 38, 12000));
        kitchenHelpers.add(new KitchenHelper("Will", 51, 12000));
        kitchenHelpers.add(new KitchenHelper("Monica", 26, 10000));
        kitchenHelpers.add(new KitchenHelper("Heston", 56, 12000));
        kitchenHelpers.add(new KitchenHelper("Greg", 34, 12000));
        kitchenHelpers.add(new KitchenHelper("Sonia", 23, 10000));
        kitchenHelpers.add(new KitchenHelper("Robbie", 21, 10000));
    }


    public void simulateDay() {
        for (KitchenHelper kitchenHelper : kitchenHelpers) {
            kitchenHelper.prepareForDay();
        }
        for (int i = 0; i < 8; i++) {
            this.simulateHour();
        }
    }

    public void simulateHour() {
        chef.cook();
        for (Cook cook : cooks) {
            cook.cook();
        }
        for (KitchenHelper kitchenHelper : kitchenHelpers) {
            if (!chef.isGotIngredient()) {
                kitchenHelper.checkForIngredient(chef.getNeededIngredient());
                if (kitchenHelper.isHaveNeededIngredient()) {
                    chef.setGotIngredient(true);
                    break;
                }
            }
        }
    }
}
