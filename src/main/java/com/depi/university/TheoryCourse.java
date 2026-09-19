package com.depi.university;

/**
 * A lecture-based course. Extends Course via constructor chaining
 * (super(name)) and adds one attribute of its own (credits).
 */
public class TheoryCourse extends Course {

    private int credits;

    public TheoryCourse(String name, int credits) {
        super(name); // constructor chaining
        this.credits = credits;
    }

    public int getCredits() {
        return credits;
    }

    public void setCredits(int credits) {
        this.credits = credits;
    }

    @Override
    public String getType() {
        return "Theory";
    }

    @Override
    public String toString() {
        return super.toString() + " (" + credits + " credits)";
    }
}
