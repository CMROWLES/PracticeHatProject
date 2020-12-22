package com.Christina.model;

public class Trucker extends Hats {
//model number of TR2040, have a UPC Prefix of 113324 and a starting count of 8848. This hat is made of a cloth material.
    boolean handStitched = true;
    boolean handWashed = true;
    String modelNumber = "TR2040";
    String upcPrefix = "113324";
    int startingCount = 8848;
    String material = "cloth";
    String color;
    public double price = 20.00;

    public Trucker(String color) {
        super(color);
    }
}
