package com.migu.csdexercise;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class OneHundredDoorsTest {

    private OneHundredDoors oneHundredDoors;

    @Before
    public void setUp() {
        oneHundredDoors = new OneHundredDoors();
    }

    @After
    public void tearDown() {
    }

    @Test
    public void testDoorsInit() {
        int[] doors = oneHundredDoors.getDoors();
        for (int doorStatus : doors) {
            assertEquals(OneHundredDoors.DOOR_STATUS_CLOSED, doorStatus);
        }
    }

    @Test
    public void testDoorsVisitOnce() {
        int[] doors = oneHundredDoors.getDoors();
        oneHundredDoors.visitOnce();
        for (int doorStatus : doors) {
            assertEquals(OneHundredDoors.DOOR_STATUS_OPENED, doorStatus);
        }
    }

    @Test
    public void testDoorsVisitTwice() {
        int[] doors = oneHundredDoors.getDoors();
        oneHundredDoors.visitTwice();
        for (int i=0;i<doors.length;i++) {
            if (i%2 == 0) {
                assertEquals(OneHundredDoors.DOOR_STATUS_CLOSED, doors[i]);
            } else {
                assertEquals(OneHundredDoors.DOOR_STATUS_OPENED, doors[i]);
            }
        }
    }

}