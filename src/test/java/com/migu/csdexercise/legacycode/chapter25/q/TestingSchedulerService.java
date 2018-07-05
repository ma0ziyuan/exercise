package com.migu.csdexercise.legacycode.chapter25.q;

public class TestingSchedulerService extends SchedulerService {

    public TestingSchedulerService() {
        super();
    }

    public void addItem(ScheduleItem item) {
        this.items.add(item);
    }
}
