package com.Christina.view;
import com.Christina.controller.AppController;

import java.util.Scanner;

public class AppUI {

    public static void openingMenu() {
        System.out.println(" Welcome to the Hat Store");
        System.out.print("Please select from one of the menu items\n" +
                "1. Cowboy\n" +
                "2. Beret\n" +
                "3. Visor\n" +
                "4. Trucker\n" +
                "5. Sun\n" +
                "6. Sport\n" +
                "Q to exit\n");
    }

    public static void pickColor(){
        System.out.println(
                "---------------------------------------------------------\n" +
                "                  Pick a color for your hat             \n " +
                "---------------------------------------------------------\n" +
                " 1. Red \n" +
                " 2. Green \n" +
                " 3. Blue \n" +
                " 4. Black \n" +
                " 5. Yellow \n" +
                " 6. Gray \n" +
                "Q to exit"
        );
    }
    public static void additionalLogo(){

    }



//        switch (userInput) {
//            case "1":
//                AppController.buyHat(userInput);
//                break;
//        }
//    }
//    public static void pickColor(){
//        System.out.println("Pick a color for your hat" +
//                "1. Red\n" +
//                "2. Green\n" +
//                "3. Yellow\n" +
//                "4. Blue\n" +
//                "5. Black\n" +
//                "Q to exit ");
//
//    }
//
//    public static void addLogo(){
//        if(true){
//            System.out.println("Additional Logo added");
//        }else
//            System.out.println("This should return to opening menu");
//        }
//    }
}
