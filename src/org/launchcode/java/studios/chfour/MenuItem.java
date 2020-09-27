package org.launchcode.java.studios.chfour;

public class MenuItem {
    private String itemName;
    private double itemPrice;
    private String itemDescription;
    private String itemCategory;
    private boolean itemNew;

    public MenuItem(String itemName, double itemPrice, String itemDescription, String itemCategory) {
        this.itemName = itemName;
        this.itemPrice = itemPrice;
        this.itemDescription = itemDescription;
        this.itemCategory = itemCategory;
        this.itemNew = true; //skipped parameter because all menu items are new
    }





    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public double getItemPrice() {
        return itemPrice;
    }

    public void setItemPrice(double itemPrice) {
        this.itemPrice = itemPrice;
    }

    public String getItemDescription() {
        return itemDescription;
    }

    public void setItemDescription(String itemDescription) {
        this.itemDescription = itemDescription;
    }

    public String getItemCategory() {
        return itemCategory;
    }

    public void setItemCategory(String itemCategory) {
        this.itemCategory = itemCategory;
    }

    public boolean isItemNew() {
        return itemNew;
    }

    public void setItemNew(boolean itemNew) {
        this.itemNew = itemNew;
    }

}



/*

public constructor(a, b, c,) {
    this.a = a;
    this.b = b;
    this.c = c;
 }



Item Name
    setter & getter
Price
    setter & getter
Description
    setter & getter
Category: Appetizer, Main Course, Dessert
    getter
New or Not new
    setter & getter
Menu last updated
    getter
 */