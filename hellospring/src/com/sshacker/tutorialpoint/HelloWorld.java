package com.sshacker.tutorialpoint;

public class HelloWorld {
    private String message;

    public void setMessage(String message) {
        this.message = message;
    }

    public void getMessage() {
        System.out.println("Your message : " + message);
    }

    public void init() {
        System.out.println("init method called ...");
    }

    public void destroy() {
        System.out.println("destroy method called ...");
    }

}
