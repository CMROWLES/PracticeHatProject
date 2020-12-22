package com.Christina.service;

import com.Christina.model.Beret;
import com.Christina.model.Cowboy;
import com.Christina.model.Hats;
import com.sun.jndi.ldap.Ber;

public class HatService {

    public static Hats selectHat(String type){
        Cowboy hatToBuy = null;
        switch (type) {
            case "1":
                hatToBuy = new Cowboy();
                System.out.println("We constructed a cowboy hat");
                break;
        }
        return hatToBuy;

    }

}
