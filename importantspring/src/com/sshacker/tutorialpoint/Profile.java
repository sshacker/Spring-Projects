package com.sshacker.tutorialpoint;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Profile {

    @Autowired
    @Qualifier("student1")
    private Student student;

    public Profile() {
        System.out.println("Inside Profile constructor.");
    }

    public void printName() {
        System.out.println("Name : " + student.getStudentName());
    }

    public void printAge() {
        System.out.println("Age : " + student.getStudentAge());
    }
}
