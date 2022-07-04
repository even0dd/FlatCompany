package com.company;

public class Agency extends Flat {
    public String percentageOfSales (Flat flat) {
        double percentage = flat.getPrice * 10 / 100;
        return "Агенство забирает: " + percentage;
    }
}
