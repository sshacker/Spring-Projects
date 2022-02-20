package com.sshacker.tutorialpoint;

import org.springframework.beans.factory.annotation.Required;

public class Student {
    private String sName;
    private int sAge;

    public String getsName() {
        return sName;
    }

    // on setter method only
    @Required
    public void setsName(String sName) {
        this.sName = sName;
    }

    public int getsAge() {
        return sAge;
    }

    @Required
    public void setsAge(int sAge) {
        this.sAge = sAge;
    }

}
