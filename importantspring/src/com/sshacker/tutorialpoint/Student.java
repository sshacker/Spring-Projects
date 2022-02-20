package com.sshacker.tutorialpoint;

import org.springframework.beans.factory.annotation.Autowired;

public class Student {
    private String studentName;
    private int studentAge;

    public String getStudentName() {
        return studentName;
    }

    @Autowired
    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public int getStudentAge() {
        return studentAge;
    }

    @Autowired(required = false)
    public void setStudentAge(int studentAge) {
        this.studentAge = studentAge;
    }

}
