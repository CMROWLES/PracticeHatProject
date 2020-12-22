package com.Christina.model;

public class Visor extends Hats {
//model number of VS3040, have a UPC Prefix of 885523 and a starting count of 7464. This hat is made of a cloth material.
    boolean handStitched = true;
    boolean handWashed = true;
    String modelNumber = "VS3040";
    String upcPrefix = "885523";
    int startingCount = 7464;
    String material = "cloth";
    String color;
    public double price = 35.00;

    public Visor(String color) {
        super(color);
    }
}
