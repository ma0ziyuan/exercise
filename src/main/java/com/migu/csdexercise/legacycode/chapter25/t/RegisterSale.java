package com.migu.csdexercise.legacycode.chapter25.t;


import java.util.ArrayList;
import java.util.List;

public class RegisterSale {
    private List<Item> items = new ArrayList<>();


    /* before modify*/
    public void addItem(Barcode code) {
        Item newItem = Inventory.getInventory().itemForBarcode(code);
        items.add(newItem);
    }

    public List<Item> getItems() {
        return items;
    }

    /* after modify*/
    /*public void addItem(Barcode code) {
        Item newItem = getInventory().itemForBarcode(code);
        items.add(newItem);
    }

    protected Inventory getInventory() {
        return Inventory.getInventory();
    }*/
}
