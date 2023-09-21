package session15.practice.enums;

import java.time.MonthDay;

public enum Day {

    MONDAY(true), TUESDAY(true), WEDNESDAY(true);

    private final boolean isWeekday;

    Day(boolean isWeekday) {
        this.isWeekday = isWeekday;
    }
    public boolean isWeekday() {
        return isWeekday;
    }
}