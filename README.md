# University Course System

**DEPI – Software Testing Track | Part 01: Java Fundamentals**
Instructor: Mina Younan — Session 09, Task B

A Java Maven project modeling a university department that offers
Theory and Lab courses, with students who can enroll in any kind of
course. Built to demonstrate abstract classes, inheritance,
polymorphism, and constructor chaining.

## Class design

```
                Course (abstract)
                     name
                  getType()*
                     ▲
          ┌──────────┴──────────┐
    TheoryCourse              LabCourse
      credits               weeklyLabHours
   getType()->"Theory"     getType()->"Lab"
```

### `Course` (abstract)
Attribute: `name` (String)
Methods: constructor, `getName()`/`setName()`, abstract `getType()`, `toString()`
Cannot be instantiated directly — only through its concrete subclasses.

### `TheoryCourse extends Course`
Adds: `credits` (int)
Constructor chains to the parent with `super(name)`.
`getType()` returns `"Theory"`; `toString()` is overridden to include the credits.

### `LabCourse extends Course`
Adds: `weeklyLabHours` (int)
Constructor chains to the parent with `super(name)`.
`getType()` returns `"Lab"`; `toString()` is overridden to include the weekly lab hours.

### `Student`
Attributes: `name` (String), `enrolledCourses` (`List<Course>`)
Methods: constructor, `enroll(Course)`, `displayCourses()`, getters
**Composition:** a `Student` has-a `List<Course>` — since the list is
typed as `Course`, a student can enroll in Theory and Lab courses
alike (polymorphism).

### `Department`
Attributes: `name` (String), `courses` (`List<Course>`), `students` (`List<Student>`)
Methods: constructor, `addCourse(Course)`, `addStudent(Student)`, `displayAllCourses()`, `displayStudentsAndCourses()`, getters
**Composition:** a `Department` has-a `List<Course>` and a `List<Student>`.

## Where each required concept shows up

| Concept | Where |
|---|---|
| Abstract class | `Course` can't be created directly |
| Inheritance | `TheoryCourse` and `LabCourse` extend `Course` |
| Polymorphism | Both course types live in the same `List<Course>`; `toString()` and `getType()` behave differently per the real object |
| Constructor chaining | `super(name)` in both `TheoryCourse` and `LabCourse` |

## What `Main` does

1. Creates one `Department` ("Computer Science").
2. Adds two `TheoryCourse`s and two `LabCourse`s to it.
3. Creates two `Student`s and enrolls them in different (and one
   shared) course.
4. Displays every course the department offers, then each student's
   enrolled courses — all through polymorphic `toString()` calls.

## Project structure

```
university-courses/
├── pom.xml
└── src/
    └── main/
        └── java/
            └── com/
                └── depi/
                    └── university/
                        ├── Course.java
                        ├── TheoryCourse.java
                        ├── LabCourse.java
                        ├── Student.java
                        ├── Department.java
                        └── Main.java
```

## Requirements

- Java 11+
- Maven 3.6+

## Build & run

```bash
mvn compile
mvn exec:java -Dexec.mainClass="com.depi.university.Main"

# or
mvn package
java -jar target/university-courses.jar
```

## License

Coursework project for the DEPI Software Testing Track — free to use
for learning and reference.
