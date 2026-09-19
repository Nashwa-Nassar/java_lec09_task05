package com.depi.university;

/**
 * DEPI - Software Testing Track - Session 09 - Task B
 * University course system: abstract Course, TheoryCourse / LabCourse,
 * Student enrollment, and a Department that holds both.
 */
public class Main {

    public static void main(String[] args) {
        // ---- 1) Create one department ----
        Department csDepartment = new Department("Computer Science");

        // ---- 2) Add both Theory and Lab courses ----
        Course dataStructures = new TheoryCourse("Data Structures", 3);
        Course algorithms = new TheoryCourse("Algorithms", 3);
        Course javaLab = new LabCourse("Java Programming Lab", 4);
        Course networksLab = new LabCourse("Networks Lab", 2);

        csDepartment.addCourse(dataStructures);
        csDepartment.addCourse(algorithms);
        csDepartment.addCourse(javaLab);
        csDepartment.addCourse(networksLab);

        // ---- 3) Create two students and enroll them in different courses ----
        Student nashwa = new Student("Nashwa");
        Student omar = new Student("Omar");

        csDepartment.addStudent(nashwa);
        csDepartment.addStudent(omar);

        nashwa.enroll(dataStructures);
        nashwa.enroll(javaLab);

        omar.enroll(algorithms);
        omar.enroll(networksLab);
        omar.enroll(javaLab); // a student can share a course with another student

        // ---- 4) Display all courses and the courses of each student ----
        csDepartment.displayAllCourses();
        System.out.println();
        csDepartment.displayStudentsAndCourses();
    }
}
