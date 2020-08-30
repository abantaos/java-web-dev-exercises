package org.launchcode.java.studios;

import java.util.ArrayList;
import java.util.Date;

public class FourMenu {
    private ArrayList<FourMenuItem> listOfDishes;
    private Date lastUpdated;

    public FourMenu() {
        this.listOfDishes = new ArrayList<>();
        this.lastUpdated = new Date(); // right now
    }
}

