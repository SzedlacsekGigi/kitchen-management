package com.codecool.kitchen;

public abstract class Employee {

    protected String name;
    protected int age;
    protected double salary;

    public String printTaxReport(Employee employee) {
        double calculatedTax = (employee.salary*(0.99));
        return employee.name + " should pay " + calculatedTax + " $ of tax.";
    }

    }
