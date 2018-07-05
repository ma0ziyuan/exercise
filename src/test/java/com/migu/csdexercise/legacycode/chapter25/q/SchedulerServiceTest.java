package com.migu.csdexercise.legacycode.chapter25.q;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SchedulerServiceTest {

    private TestingSchedulerService testingSchedulerService;

    @Before
    public void setUp() throws Exception {
        testingSchedulerService = new TestingSchedulerService();
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void testGetDeadtime() {
        testingSchedulerService.addItem(new ScheduleItem("a",10,20,ScheduleItem.BASIC));
        assertEquals(2,testingSchedulerService.getDeadtime());
    }
}