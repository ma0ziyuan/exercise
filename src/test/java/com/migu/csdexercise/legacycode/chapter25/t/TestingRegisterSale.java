package com.migu.csdexercise.legacycode.chapter25.t;

public class TestingRegisterSale extends RegisterSale {
    Inventory inventory = new FakeInventory();

    public Inventory getInventory() {
        return this.inventory;
    }
}
