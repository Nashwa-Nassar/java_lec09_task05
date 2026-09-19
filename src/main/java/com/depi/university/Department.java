package com.depi.university;

import java.util.ArrayList;
import java.util.List;

/**
 * A university department that offers multiple courses (Theory and
 * Lab alike) and contains multiple students.
 *
 * Composition: a Department has-a List<Course> and a List<Student>.
 */
public class Department {

    private String name;
    private List<Course> courses;   // composition: Department has-a list of Courses
    private List<Student> students; // composition: Department has-a list of Students

    public Department(String name) {
        this.name = name;
        this.courses = new ArrayList<>();
        this.students = new ArrayList<>();
    }

    public void addCourse(Course course) {
        courses.add(course);
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public String getName() {
        return name;
    }

    public List<Course> getCourses() {
        return courses;
    }

    public List<Student> getStudents() {
        return students;
    }

    /** Prints every course offered, both Theory and Lab (polymorphic toString()). */
    public void displayAllCourses() {
        System.out.println(name + " department - offered courses:");
        for (Course course : courses) {
            System.out.println("  " + course);
        }
    }

    /** Prints, for every student in the department, the courses they're enrolled in. */
    public void displayStudentsAndCourses() {
        for (Student student : students) {
            student.displayCourses();
        }
    }

    @Override
    public String toString() {
        return name;
    }
}
