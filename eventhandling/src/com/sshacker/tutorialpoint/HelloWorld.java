package com.sshacker.tutorialpoint;

public class HelloWorld {
    private String message;

    public String getMessage() {
        System.out.println("event handling " + message);
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

}
