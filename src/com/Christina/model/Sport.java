package com.Christina.model;

public class Sport extends Hats {
    // model number of SP4060, have a UPC Prefix of 756634 and a starting count of 3938. This hat is made of a cloth material.
    boolean handStitched = true;
    boolean handWashed = true;
    String modelNumber = "SP4060";
    String upcPrefix = "756634";
    int startingCount = 3938;
    String material = "cloth";
    String color;
    public double price = 80.00;

    public Sport(String color) {
        super(color);
    }
}
