package com.migu.csdexercise.legacycode.chapter25.q;

public class Scheduler extends SchedulerService {


    public void updateScheduleItem(ScheduleItem item) throws SchedulingException {
        try {
            validate(item);
        } catch (ConflictException e) {
            throw new SchedulingException();
        }
    }

    private void validate(ScheduleItem item) throws ConflictException {

    }
}
