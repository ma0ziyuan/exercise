package com.migu.csdexercise.legacycode.chapter25.t;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class TestingRegisterSaleTest {

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void addItem() {
        TestingRegisterSale testingRegisterSale = new TestingRegisterSale();
        testingRegisterSale.addItem(new Barcode());
        assertEquals(1,testingRegisterSale.getItems().size());
    }
}