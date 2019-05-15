package com.codecool.kitchen;

import java.util.Date;

public class Cook extends FoodPreparer {

    public Cook(){}

    public Cook(String name, Date birthday, double salary) {
        this.name = name;
        this.birthday = birthday;
        this.salary = salary;
    }

    @Override
    public void cook() {
        System.out.println("I cooked something great again");
    }
}
