package com.depi.university;

/**
 * Abstract base class for every course a department offers.
 * Holds the one attribute every course shares (name) and leaves
 * getType() abstract so each concrete subclass reports its own kind
 * ("Theory" or "Lab") - this is the polymorphism the assignment asks
 * to demonstrate via a List<Course>.
 */
public abstract class Course {

    private String name;

    protected Course(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    /** Returns "Theory" or "Lab" depending on the concrete subclass. */
    public abstract String getType();

    @Override
    public String toString() {
        return "[" + getType() + "] " + name;
    }
}
