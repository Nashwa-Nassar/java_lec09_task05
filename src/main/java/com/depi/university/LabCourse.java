package com.depi.university;

/**
 * A hands-on lab course. Extends Course via constructor chaining
 * (super(name)) and adds one attribute of its own (weeklyLabHours).
 */
public class LabCourse extends Course {

    private int weeklyLabHours;

    public LabCourse(String name, int weeklyLabHours) {
        super(name); // constructor chaining
        this.weeklyLabHours = weeklyLabHours;
    }

    public int getWeeklyLabHours() {
        return weeklyLabHours;
    }

    public void setWeeklyLabHours(int weeklyLabHours) {
        this.weeklyLabHours = weeklyLabHours;
    }

    @Override
    public String getType() {
        return "Lab";
    }

    @Override
    public String toString() {
        return super.toString() + " (" + weeklyLabHours + " lab hrs/week)";
    }
}
