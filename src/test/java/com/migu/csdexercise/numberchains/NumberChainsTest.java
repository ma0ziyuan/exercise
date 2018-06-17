package com.migu.csdexercise.numberchains;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class NumberChainsTest {
    @Test
    public void testCalChainLength() {
        NumberChains numberChains = new NumberChains("123456789");
        assertEquals(2,numberChains.calChainLength());

        numberChains = new NumberChains("1234");
        assertEquals(4,numberChains.calChainLength());
    }
}