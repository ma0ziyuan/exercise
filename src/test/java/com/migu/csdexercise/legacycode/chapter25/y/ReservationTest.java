package com.migu.csdexercise.legacycode.chapter25.y;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ReservationTest {

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void calculateHandlingFee() {
        Reservation reservation = new Reservation();
        assertEquals(0,reservation.calculateHandlingFee(0));
    }
}