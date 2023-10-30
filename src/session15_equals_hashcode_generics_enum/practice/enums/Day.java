package session15_equals_hashcode_generics_enum.practice.enums;

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