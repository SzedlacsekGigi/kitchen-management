package com.codecool.kitchen;

import java.util.Date;

public class KitchenHelper extends Employee {

    public KitchenHelper(){}

    public KitchenHelper(String name, Date birthday, double salary) {
        this.name = name;
        this.birthday = birthday;
        this.salary = salary;
    }
}
