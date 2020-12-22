package com.Christina.controller;

import com.Christina.model.Hats;
import com.Christina.service.HatService;
import com.Christina.view.AppUI;

import java.util.Scanner;

public class AppController {


    public static void startApp(){
        String userInput = "";

        while(!userInput.equalsIgnoreCase("Q")){
            AppUI.openingMenu();
            inventoryOptions(getUserInput());

        }
    }

    // YOu could put this in a util folder
    public static String getUserInput() {
        Scanner sc = new Scanner(System.in);
        return sc.next();
    }

    public static String inventoryOptions (String option) {
        switch (option) {
            case "1":
                Hats referenceToHat = HatService.selectHat(option);
                AppUI.pickColor();
                referenceToHat.setColor(getUserInput());
                System.out.println("The Cowboy Hat is: " + referenceToHat.color);
                break;
//            case "2":
//                option = "2
//                addBeretHat();
//                break;
//            case "3":
//                option = "3";
//                addVisorHat();
//                break;
//            case "4":
//                option = "4";
//                addTruckerHat();
//                break;
//            case "5":
//                option = "5";
//                addSunHat();
//                break;
//            case "6":
//                option = "6";
//                addSportHat();
//                break;
//            default:
//                option = "Q";
        }
        return option;
    }


//    public static Hats addHat(){
//        Hat newHat = new ();
//                System.out.println("1 " + newHat.price);
//                return newHat;
//        }
//    }

    public static String getAmount(String option) {return option;}

    public static String removeAmt(String option) {return option;}

    public static void addCowboyHat(){
        AppUI.pickColor();
        getUserInput();
        getAmount(getUserInput());
    }

    public static void removeHat(){
        getUserInput();
        removeAmt(getUserInput());
    }

    }
