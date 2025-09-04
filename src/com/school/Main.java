package com.school;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Students
        Student student1 = new Student("Alice", "10th Grade");
        Student student2 = new Student("Bob", "11th Grade");
        Student student3 = new Student("Charlie", "12th Grade");

        // Teachers
        Teacher teacher1 = new Teacher("Mr. Smith", "Mathematics");
        Teacher teacher2 = new Teacher("Ms. Johnson", "Physics");

        // Staff
        Staff staff1 = new Staff("John Doe", "Clerk");

        System.out.println("---- Students ----");
        student1.displayDetails();
        student2.displayDetails();
        student3.displayDetails();
        System.out.println();

        System.out.println("---- Teachers ----");
        teacher1.displayDetails();
        teacher2.displayDetails();
        System.out.println();

        System.out.println("---- Staff ----");
        staff1.displayDetails();
        System.out.println();

        // Attendance Records (using Student.getId())
        List<AttendanceRecord> attendanceLog = new ArrayList<>();
        attendanceLog.add(new AttendanceRecord(student1.getId(), "2025-09-04", true));
        attendanceLog.add(new AttendanceRecord(student2.getId(), "2025-09-04", false));
        attendanceLog.add(new AttendanceRecord(student3.getId(), "2025-09-04", true));

        System.out.println("---- Attendance Records ----");
        for (AttendanceRecord record : attendanceLog) {
            record.displayRecord();
        }
    }
}
