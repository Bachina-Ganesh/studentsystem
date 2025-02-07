package com.ganesh.dto;

import java.util.List;

public class Student {
    private int studentId;
    private String studentName;
    private Address address;
    private List<Course> courses;
    
    public Student(int studentId, String studentName, Address address, List<Course> courses) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.address = address;
        this.courses = courses;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public List<Course> getCourses() {
        return courses;
    }

    public void setCourses(List<Course> courses) {
        this.courses = courses;
    }

    
}
