package com.codecool.kitchen;

public abstract class FoodPreparer extends Employee {

    private boolean hasKnife = false;

    public abstract void cook();

    public void setHasKnife(boolean hasKnife) {
        this.hasKnife = hasKnife;
    }
}
