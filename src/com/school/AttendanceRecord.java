package com.school;

public class AttendanceRecord {
    private int studentId;
    private String date;
    private boolean present;

    public AttendanceRecord(int studentId, String date, boolean present) {
        this.studentId = studentId;
        this.date = date;
        this.present = present;
    }

    public int getStudentId() {
        return studentId;
    }

    public String getDate() {
        return date;
    }

    public boolean isPresent() {
        return present;
    }

    public void displayRecord() {
        System.out.println("Student ID: " + studentId + ", Date: " + date + ", Present: " + present);
    }
}
