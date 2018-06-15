package com.migu.csdexercise;

public class OneHundredDoors {
    private final int DOOR_AMOUNT = 100;
    public static final int DOOR_STATUS_CLOSED = 0;
    public static final int DOOR_STATUS_OPENED = 1;

    private int[] doors = new int[DOOR_AMOUNT];

    public int[] getDoors() {
        return doors;
    }

    public OneHundredDoors() {
        for (int i = 0; i < doors.length; i++) {
            doors[i] = DOOR_STATUS_CLOSED;
        }
    }

    public void visitOnce() {
        for (int i = 0; i < doors.length; i++) {
            doors[i] = toggleDoorStatus(doors[i]);
        }
    }

    private int toggleDoorStatus(int doorStatus) {
        if (doorStatus == DOOR_STATUS_OPENED)
            return DOOR_STATUS_CLOSED;
        else
            return DOOR_STATUS_OPENED;
    }

    public void visitTwice() {
        for (int i = 0; i < doors.length; i++) {
            doors[i] = toggleDoorStatus(doors[i]);
        }

        for (int i = 0; i < doors.length; i++) {
            if (i % 2 == 0) {
                doors[i] = toggleDoorStatus(doors[i]);
            }
        }
    }
}
