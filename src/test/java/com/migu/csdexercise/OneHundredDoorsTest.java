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
        for (int i = 0; i < doors.length; i++) {
            if ((i + 1) % 2 == 0) {
                assertEquals(OneHundredDoors.DOOR_STATUS_CLOSED, doors[i]);
            } else {
                assertEquals(OneHundredDoors.DOOR_STATUS_OPENED, doors[i]);
            }
        }
    }

    @Test
    public void testDoorsVisitOneHundredTunes() {
        int[] doors = oneHundredDoors.getDoors();
        oneHundredDoors.visitOneHundredTunes();
        for (int i = 1; i <= 10; i++) {
            assertEquals(OneHundredDoors.DOOR_STATUS_OPENED, doors[i * i - 1]);
            doors[i * i - 1] = OneHundredDoors.DOOR_STATUS_CLOSED;
        }
        for (int door:doors) {
            assertEquals(OneHundredDoors.DOOR_STATUS_CLOSED, door);
        }
    }
}