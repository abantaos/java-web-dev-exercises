package org.launchcode.java.studios.chfour;

import java.util.ArrayList;
import java.util.Date;


public class Menu {

    private ArrayList<MenuItem> items;
    private Date dateUpdated;

//    this is from the studio video but doesn't work in restaurant class?
//    public FourMenu() {
//        this.items = new ArrayList<>();
//        this.lastUpdated = new Date(); // right now
//    }

    public void Menu(Date dateUpdated, ArrayList<MenuItem> item) {
        this.items = item;
        this.dateUpdated = dateUpdated;
    }

    public ArrayList<MenuItem> addItem(MenuItem item) {
        this.items.add(item);
        return items;
    }

//    public ArrayList<FourMenuItem> removeItem(FourMenuItem item) {
//        for (String lookingFor : items) {
//            if (lookingFor = items) {
//                this.items.remove(item);
//            }
//        }
//        return items;
//    }

}

//
//
//public void add(MenuItem m) {
//    if (!listOfDishes.contains(m)) {
//        listOfDishes.add(m);
//    this.lastUpdated = new Date();
//    }
//}
//
//public void remove(MenuItem m) {
//    listOfDishes.remove(m);
//}
//
//public Date getLastUpdated() {
//    return lastUpdated;
//}
//
//
//
//look up autogenerate toString and isEqual