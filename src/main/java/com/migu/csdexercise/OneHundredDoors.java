package com.migu.csdexercise;

public class OneHundredDoors {
    private final int DOOR_AMOUNT = 100;
    private final int DOOR_CLOSED_STATUS = 0;
    private final int DOOR_OPENED_STATUS = 1;

    private int[] doors = new int[DOOR_AMOUNT];


    public OneHundredDoors() {
        for (int i = 0; i < doors.length; i++) {
            doors[i] = 0;
        }
    }

    public int[] getDoors() {
        return doors;
    }

    public void setDoors(int[] doors) {
        this.doors = doors;
    }
}
