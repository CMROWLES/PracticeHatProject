package com.Christina.model;

public abstract class Hats {

    boolean handStitched = true;
    boolean handWashed = true;
    public double price;
    String typeOfHat;

    public String color;


    public Hats(String color){
        this.color = color;
    }

    public String setColor(String option) {
        if (option.equals("1")) {
            this.color = "red";
            if (option.equals("2")) {
                this.color = "green";
                {
                    if (option.equals("3")) {
                        this.color = "blue";{
                            if (option.equals("4")) {
                                this.color = "black";
                                if (option.equals("5")) {
                                    this.color = "yellow";
                                    if (option.equals("6")) {
                                        this.color = "yellow";
                                    }
                                    return this.color;
                                }return this.color;
                            }return this.color;
                        }
                    }return this.color;
                }
            }return this.color;
        }return this.color;
    }

    public Hats() {

    }

}
