package com.Christina.model;

public class Sun extends Hats {
// model number of SN4109, have a UPC Prefix of 317590 and a starting count of 7236. This hat is made of straw material
    boolean handStitched = true;
    boolean handWashed = true;
    String modelNumber = "SN4109";
    String upcPrefix = "317590";
    int startingCount = 7236;
    String material = "straw";
    String color;
    public double price = 55.00;

    public Sun(String color) {
        super(color);
    }
}
