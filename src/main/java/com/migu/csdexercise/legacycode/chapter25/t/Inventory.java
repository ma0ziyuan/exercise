package com.migu.csdexercise.legacycode.chapter25.t;

public class Inventory {
    private static Inventory inventory;

    public static Inventory getInventory() {
        if (inventory==null) {
            inventory = new Inventory();
        }
        return inventory;
    }

    protected Inventory() {

    }

    public Item itemForBarcode(Barcode code) {
        return new Item(code);
    }
}
