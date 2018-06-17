package com.migu.csdexercise.OneHundredDoors

import spock.lang.Specification

class OneHundredDoorsSpockTest extends Specification {

    def OneHundredDoors oneHundredDoors
    def int[] doors

    void setup() {
        oneHundredDoors = new OneHundredDoors();
        doors = oneHundredDoors.getDoors();
    }

    void cleanup() {
    }

    def "DoorsInit"() {
        given: ""
        when: "100 doors in a row are all initially closed"
        then: "every door should be closed"
        doors.every() {
            it == OneHundredDoors.DOOR_STATUS_CLOSED
        }
    }

    def "VisitOnce"() {
        given: ""
        when:
        "The first time through, you\n" +
                "visit every door and toggle the door (if the door is\n" +
                "closed, you open it; if it is open, you close it)."
        oneHundredDoors.visitOnce();
        then: "every door should be opened"
        doors.every() {
            it == OneHundredDoors.DOOR_STATUS_OPENED
        }
    }

    def "VisitTwice"() {
        given: ""
        when:
        "The second time you only visit every 2nd door (door\n" +
                "#2, #4, #6, ...)"
        oneHundredDoors.visitTwice();
        then: "half doors that the number is even should be closed and the left doors should be opened"
        doors.eachWithIndex{ int entry, int i ->
            if ((i + 1) % 2 == 0) {
                assert entry == OneHundredDoors.DOOR_STATUS_CLOSED
            } else {
                assert entry == OneHundredDoors.DOOR_STATUS_OPENED
            }
        }
    }

    def "VisitOneHundredTunes"() {
        given: ""
        when: "the 100th visit, visit the 100th door"
        oneHundredDoors.visitOneHundredTunes();
        then: "凡是1、4、9、16、25、36、49、64、81、100号的门，都是打开状态的，剩余的都是关闭状态的"
        for (int i = 1; i <= 10; i++) {
            org.junit.Assert.assertEquals(OneHundredDoors.DOOR_STATUS_OPENED, doors[i * i - 1]);
            doors[i * i - 1] = OneHundredDoors.DOOR_STATUS_CLOSED;
        }
        doors.every() {
            OneHundredDoors.DOOR_STATUS_CLOSED == it
        }
    }
}
