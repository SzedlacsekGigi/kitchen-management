package com.codecool.kitchen;

import java.util.Date;

public class Chef extends FoodPreparer {

    public Chef(){}

    public Chef(String name, Date birthday, double salary) {
        this.name = name;
        this.birthday = birthday;
        this.salary = salary;
    }
}
