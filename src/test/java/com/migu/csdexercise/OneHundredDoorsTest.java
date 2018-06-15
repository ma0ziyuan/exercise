package com.migu.csdexercise;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class OneHundredDoorsTest {

    private OneHundredDoors oneHundredDoors;

    @Before
    public void setUp() throws Exception {
        oneHundredDoors = new OneHundredDoors();
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void testDoorsInit() {
        int[] doors = oneHundredDoors.getDoors();
        for (int i = 0; i < doors.length; i++) {
            assertEquals(0,doors[i]);
        }
    }

}