package com.migu.csdexercise.legacycode.chapter25.q;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public abstract class SchedulerService {
    protected List<ScheduleItem> items = new ArrayList<>();

    public int getDeadtime() {
        int result = 0;
        for (Iterator<ScheduleItem> it = items.iterator(); it.hasNext(); ) {
            ScheduleItem item = it.next();
            if (item.getType() != ScheduleItem.TRANSIENT && notShared(item)) {
                result += item.getSetupTime() + clockTime();
            }
            if (item.getType() != ScheduleItem.TRANSIENT) {
                result += item.finishingTime();
            } else {
                result += getStandardFinish(item);
            }
        }
        return result;
    }

    private int getStandardFinish(ScheduleItem item) {
        return 0;
    }

    private int clockTime() {
        return 0;
    }

    private boolean notShared(ScheduleItem item) {
        return true;
    }
}
