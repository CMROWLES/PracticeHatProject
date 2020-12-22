package com.Christina.model;

public class Beret extends Hats {

    boolean handStitched = true;
    boolean handWashed = true;
    String modelNumber = "BR3109";
    String upcPrefix = "648252";
    int startingCount = 8467;
    String material = "wool";
    String color;
    public double price = 45.00;

    public Beret(String color) {
        super(color);
    }
}
