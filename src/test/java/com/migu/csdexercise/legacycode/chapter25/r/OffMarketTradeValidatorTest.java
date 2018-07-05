package com.migu.csdexercise.legacycode.chapter25.r;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class OffMarketTradeValidatorTest {

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void isValid() {

        TestingOffMarketTradeValidator testingOffMarketTradeValidator = new TestingOffMarketTradeValidator(new Trade());
        assertTrue(testingOffMarketTradeValidator.isValid());
    }
}