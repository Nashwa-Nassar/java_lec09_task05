package com.depi.university;

import java.util.ArrayList;
import java.util.List;

/**
 * A student who can enroll in any kind of Course (Theory or Lab alike),
 * demonstrated by storing enrolled courses in a List<Course>.
 *
 * Composition: a Student has-a List<Course> - the courses they're
 * enrolled in (the courses themselves are owned by the Department).
 */
public class Student {

    private String name;
    private List<Course> enrolledCourses; // composition: Student has-a list of Courses

    public Student(String name) {
        this.name = name;
        this.enrolledCourses = new ArrayList<>();
    }

    /** Enrolls the student in any Course - Theory or Lab, thanks to polymorphism. */
    public void enroll(Course course) {
        enrolledCourses.add(course);
    }

    public String getName() {
        return name;
    }

    public List<Course> getEnrolledCourses() {
        return enrolledCourses;
    }

    /** Prints every course this student is enrolled in. */
    public void displayCourses() {
        System.out.println(name + "'s courses:");
        if (enrolledCourses.isEmpty()) {
            System.out.println("  (not enrolled in any course)");
            return;
        }
        for (Course course : enrolledCourses) {
            System.out.println("  " + course); // polymorphic toString()
        }
    }

    @Override
    public String toString() {
        return name;
    }
}
