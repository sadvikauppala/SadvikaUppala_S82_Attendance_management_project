package com.school;

public class Main {
    public static void main(String[] args) {
         Student[] students = new Student[2];
        Course[] courses = new Course[2];

        
        students[0] = new Student("Alice", 101);
        students[1] = new Student("Bob", 102);

        courses[0] = new Course("Mathematics", 201);
        courses[1] = new Course("Physics", 202);

        System.out.println("---- Students ----");
        for (Student s : students) {
            s.displayInfo();
            System.out.println();
        }

        System.out.println("---- Courses ----");
        for (Course c : courses) {
            c.displayInfo();
            System.out.println();
        }
    }
}