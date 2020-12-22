package com.Christina.model;

public class Cowboy extends Hats {
    boolean handStitched = true;
    boolean handWashed = true;
    String modelNumber = "CB3319";
    String upcPrefix = "901352";
    int startingCount = 9573;
    String material = "beaver";
    private String color;
    public double price = 25.00;

//    public String setColor(String color){
//        this.color = color;
//        return color;
//
//    }

    public String getColor(){
        return color;
    }



    public Cowboy(String color) {
        super(color);
    }

    public Cowboy() {
        super();
    }
}





