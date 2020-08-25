package org.launchcode.java.studios;

public class FourMenuItem {

    private String itemName;
    private double itemPrice;
    private String itemDescription;
    private String itemCategory;
    private Boolean itemNew;

    public FourMenuItem(String itemName, double itemPrice, String itemDescription, String itemCategory , Boolean itemNew) {
        this.itemName = itemName;
        this.itemPrice = itemPrice;
        this.itemDescription = itemDescription;
        this.itemCategory = itemCategory;
        this.itemNew = true;
    }

    public FourMenuItem(String itemName, double itemPrice, String itemDescription, String itemCategory) {
        this.itemName = itemName;
        this.itemPrice = itemPrice;
        this.itemDescription = itemDescription;
        this.itemCategory = itemCategory;
        this.itemNew = true;
    }

        public String getItemName() {
            return this.itemName;
        }
        public void setItemName(String newItemName) {
            this.itemName = newItemName;
        }

        public double getItemPrice() {
            return this.itemPrice;
        }
        public void setItemPrice(double newItemPrice) {
            this.itemPrice = newItemPrice;
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