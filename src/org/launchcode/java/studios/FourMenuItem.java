package org.launchcode.java.studios;

public class FourMenuItem {

    private String itemName;
    private double itemPrice;
    private String itemDescription;
    private String itemCategory;
    private String itemNew;

    public void setItemName(String newItemName) { itemName = newItemName; }
    public String getItemName() { return itemName; }

    public void setItemPrice(double newItemPrice) {
        itemPrice = newItemPrice;
    }
    public double getItemPrice() {
        return itemPrice;
    }

    public void setItemDescription(String newItemDescription) { itemDescription = newItemDescription; }
    public String getItemDescription() { return itemDescription; }

    public void setItemCategory(String newItemCategory) {

//        itemCategory = newItemCategory;
    }
    public String getItemCategory() {
        return itemCategory;
    }

    public void setItemNew(String newSetItemNew) {
        //
    }
    public String getItemNew() {
        return itemNew;
    }

}

/*
Item Name
Price
Description
Category: Appetizer, Main Course, Dessert
New or Not new
Menu last updated
 */