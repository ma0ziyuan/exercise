package com.migu.csdexercise;

class OneHundredDoors {
    private final int DOOR_AMOUNT = 100;
    static final int DOOR_STATUS_CLOSED = 0;
    static final int DOOR_STATUS_OPENED = 1;

    private int[] doors = new int[DOOR_AMOUNT];

    int[] getDoors() {
        return doors;
    }

    OneHundredDoors() {
        for (int i = 0; i < doors.length; i++) {
            doors[i] = DOOR_STATUS_CLOSED;
        }
    }

    void visitOnce() {
        visitTurn(1);
    }

    private int toggleDoorStatus(int doorStatus) {
        if (doorStatus == DOOR_STATUS_OPENED)
            return DOOR_STATUS_CLOSED;
        else
            return DOOR_STATUS_OPENED;
    }

    private void visit(int order) {
        for (int i = 0; i < doors.length; i++) {
            if ((i+1) % order == 0) {
                doors[i] = toggleDoorStatus(doors[i]);
            }
        }
    }

    private void visitTurn(int turns) {
        for (int i=0;i<turns;i++) {
            visit(i+1);
        }
    }

    void visitTwice() {
        visitTurn(2);
    }

    public void visitOneHundredTunes() {
        visitTurn(100);
    }
}
